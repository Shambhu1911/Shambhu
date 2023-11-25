slip10
Q1.
<html>
<body>
<form action="seta1.php" method=post>
Enter first number<input type=text name=t1>
<br>
Enter second number<input type=text name=t2>
<input type=submit value=display>
</form>
</body>
</html>






<?php 
function mod($x,$y) 
{ 
$z=$x%$y;
echo "mod value of $x & $y is $z<br>"; 
} 
function power($x, $y)
{ 
$f= 1; 
$n1 = $y; 
while($n1 > 0) 
{
$f= $f * $x; 
$n1--; 
} 
echo "$x raised to the power $y = $f <br>"; 
{ 
$sum=$sum+$i; 
$i++; 
}
echo "sumof first $x number is $sum<br>"; 
} 
function fact
{
$i=1;$f=1; 
while($i<=$y) 
{
$f=$f*$i; $i++; 
} 
echo "factorial of $y is $f"; 
}
$x=$_POST['t1']; 
$y=$_POST['t2'];
mod($x,$y); 
power($x,$y); 
sum($x); 
fact($y);
?>





q2a
import pandas as pd
data = {
'Height': [65, 68, 70, 60, 74, 72],
'Weight': [120, 150, 180, 110, 200, 190]
}
df = pd.DataFrame(data)
mean_values = df.mean()
median_values = df.median()
print("Column-wise Mean:")
print(mean_values)
print("\nColumn-wise Median:")
print(median_values)


B->
def manhattan_distance(point1, point2):
return abs(point1[0] - point2[0]) + abs(point1[1] - point2[1])
def sum_manhattan_distances(points):
n = len(points)
total_distance = 0
for i in range(n):
for j in range(i+1, n):
total_distance += manhattan_distance(points[i], points[j])
return total_distance
points = [(1, 2), (4, 6), (7, 3), (9, 5)]
result = sum_manhattan_distances(points)
print(f"The sum of Manhattan distances between all pairs of points is: {result}")
