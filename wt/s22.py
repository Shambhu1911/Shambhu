slip22
Q1.
<html>
<body>
<form name="f1" method="POST" action="arrayc1.php">
<center>MENU</center>
1.Insert an element in queue<br>
2.Delete element from queue<br>
3.Display the contents of stack<br>
Enter your choice :
<input type="text" name="t1"><br>
<input type="submit" value=ok>
</form>
</body>
</html>




<?php
$ch=$_POST['t1']; 
$a=array(10,20,1,2,3,4,5,6); 
switch($ch) 
{
case 1:echo"<br>ORIGINAL QUEUE IS :"; 
foreach($a as $v) 
{ 
echo"$v\t"; 
}
array_unshift($a,'7'); 
echo"<br>After inserting an element queue is :"; 
foreach($a as $v)
{ 
echo"$v\t"; 
} 
break;
case 2:echo"<br>ORIGINAL QUEUE IS :"; 
foreach($a as $v)
{ 
echo"$v\t"; 
} 
array_shift($a); 
echo"<br>Queue after deleting one element : "; 
foreach($a as $v)
{ 
echo"$v\t"; 
}
break; 
case 3:echo"<br>ORIGINAL QUEUE IS :"; 
foreach($a as $v)
{ 
echo"$v\t";
} 
break; 
default :echo"Invalid choice"; 
} 
?>










q2
import pandas as pd
from sklearn.preprocessing import MinMaxScaler, StandardScaler, Normalizer
data = pd.read_csv('winequality-red.csv')
X = data.drop('quality', axis=1)
y = data['quality']

scaler = MinMaxScaler()
X_rescaled = scaler.fit_transform(X)

std_scaler = StandardScaler()
X_standardized = std_scaler.fit_transform(X)

normalizer = Normalizer()
X_normalized = normalizer.fit_transform(X)

print("Rescaled Data:")
print(X_rescaled[:5]) 
print("\nStandardized Data:")
print(X_standardized[:5]) 
print("\nNormalized Data:")
print(X_normalized[:5])



