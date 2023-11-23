s1 q1
#include <stdlib.h>
int isPagePresent(int page, int *frames, int n) {
for (int i = 0; i < n; i++) {
if (frames[i] == page) {
return 1; 
}
}
return 0; 
}
int findOldestPageIndex(int *arrival, int n) {
int oldestIndex = 0;
for (int i = 1; i < n; i++) {
if (arrival[i] < arrival[oldestIndex]) {
oldestIndex = i;
}
}
return oldestIndex;
}
void simulateDemandPaging(int *referenceString, int referenceStringLength, int n) {
int frames[n];
int arrival[n]; 
int pageFaults = 0;
for (int i = 0; i < n; i++) {
frames[i] = -1; 
arrival[i] = 0;
}
for (int i = 0; i < referenceStringLength; i++) {
int page = referenceString[i];
if (!isPagePresent(page, frames, n)) {
int oldestIndex = findOldestPageIndex(arrival, n);
frames[oldestIndex] = page;
arrival[oldestIndex] = i + 1; 
pageFaults++;
}
printf("%d ", page);
}
printf("\nTotal Page Faults: %d\n", pageFaults);
}
int main() {
int referenceString[] = {3, 4, 5, 6, 3, 4, 7, 3, 4, 5, 6, 7, 2, 4, 6};
int referenceStringLength = sizeof(referenceString) / sizeof(referenceString[0]);

int n = 3;
simulateDemandPaging(referenceString, referenceStringLength, n);
return 0;
}