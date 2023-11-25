slip25
q2a
import numpy as np
import matplotlib.pyplot as plt
random_data = np.random.randint(1, 100, 50)
plt.figure(figsize=(10, 4))
plt.subplot(2, 2, 1)
plt.plot(random_data, color='blue')
plt.title('Line Chart')
plt.xlabel('Index')
plt.ylabel('Value')
plt.subplot(2, 2, 2)
plt.scatter(range(50), random_data, color='red')
plt.title('Scatter Plot')
plt.xlabel('Index')
plt.ylabel('Value')
plt.subplot(2, 2, 3)
plt.hist(random_data, bins=10, color='green', alpha=0.7)
plt.title('Histogram')
plt.xlabel('Value')
plt.ylabel('Frequency')
plt.subplot(2, 2, 4)
plt.boxplot(random_data, vert=False, patch_artist=True)
plt.title('Box Plot')
plt.xlabel('Value')
plt.tight_layout()
plt.show()



B->
import matplotlib.pyplot as plt
subjects = ['Math', 'Science', 'English', 'History']
marks = [85, 90, 75, 80]
plt.figure(figsize=(8, 8))
plt.pie(marks, labels=subjects, autopct='%1.1f%%', startangle=140,
colors=['#ff9999','#66b3ff','#99ff99','#ffcc99'])
plt.title('Subject-wise Marks Distribution')
plt.show()