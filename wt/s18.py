slip18
Q1.
<html>
<body>
<form action="seta1.php" method="POST">
1.Reverse the order of each element’s key-value pair
<input type="radio" name="opt1" value="o1"><br>
2.traverse the element in the random order
<input type="radio" name="opt1" value="o2"><br>
3. Convert the array elements into individual variables.
<input type="radio" name="opt1" value="o3"><br>
4.Display the elements of an array along with key.
<input type="radio" name="opt1" value="o4"><br>
<input type="submit" value="ok">
</form>
</body>
</html>


<?php 
$a=array('one'=>'aa','two'=>'bb','three'=>'cc','four'=>'dd','five'=>'ee'); 
$opt=$_POST['opt1'];
if($opt=='o1') 
{ 
echo "origonal array is<br>"; 
print_r($a);
echo"the flip elements of array<br>"; 
$fp=array_flip($a); 
print_r($fp); 
}
else if($opt=='o2') 
{ 
echo"random order elements are"; 
shuffle($a);
print_r($a); 
} 
if($opt=='o3') 
{ 
extract($a);
echo "after converting array into variables<br>"; 
echo $one." ".$two." ".$three." ".$four." ".$five; 
}
else if($opt=='o4') 
{ 
echo"the elemnt of array with therer keys"; print_r($a); 
}
?>






q2a
import pandas as pd
import matplotlib.pyplot as plt
iris_data = pd.read_csv('iris.csv')
features = ['sepal_length', 'sepal_width', 'petal_length', 'petal_width']
species = ['setosa', 'versicolor', 'virginica']
plt.figure(figsize=(12, 8))
for i, feature in enumerate(features, 1):
plt.subplot(2, 2, i)
plt.boxplot([iris_data[iris_data['species'] == sp][feature] for sp in species], labels=species)
plt.title(f'Box Plot of {feature}')
plt.xlabel('Species')
plt.ylabel(feature)
plt.tight_layout()
plt.show()



B->
import pandas as pd
df = pd.read_csv('heights_weights.csv')
print("First Row:")
print(df.head(1))
print("\nLast 5 Rows:")
print(df.tail(5))
print("\nRandom 10 Rows:")
print(df.sample(10))