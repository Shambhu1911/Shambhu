slip no 28
q1
<?php 
if(file_exists("stud.dat"))
{
$fp1=fopen("stud.dat","r"); 
$buf1=fread($fp1,filesize("stud.dat"));
$temprecs=explode("\n",$buf1); 
$i=0;
foreach($temprecs as $t) 
if(strlen($t)>0) 
$records[$i++]=explode(" ",$t);
echo"<p>********Student Detalis******</p>"; 
echo "<table border=2>"; 
echo"<tr><th>rollno</th><th>Name</th><th>OS</th><th>WT</th><th>DS</th><th>Python</th><th>Java</th><th>CN</th><th>ptage</th></tr>";
foreach($records as $rec) 
{ 
echo "<tr>";
$k=1; 
$tot=0; 
foreach($rec as $f)
{ 
printf("<td>%s</td>",$f); 
$k++; 
if($k>3)
$tot=$tot+$f; 
} 
$ptage=$tot/6.0;
printf("<th>%.2f</th><br>",$ptage); 
} 
echo"</table>";
}//if 
else 
echo " file not exists"; 
?>




q2
import pandas as pd
import numpy as np
data = {'name': ['John', 'Jane', 'Bob', 'Alice', 'Eve', 'Charlie', 'Diana', 'Frank', 'Grace', 'Henry'],
'age': [25, 30, 22, 28, 26, 27, 29, 31, 23, 24],
'percentage': [75.5, 88.3, 65.2, 90.1, 77.8, 82.6, 69.7, 95.0, 70.3, 78.9]}
df = pd.DataFrame(data)
additional_data = {'name': ['Sam', 'Lucy', 'Tom', 'Emily', 'Oliver', 'Sophia', 'Liam', 'Emma', 'Mason',
'Ava'],
'age': [26, 29, 30, 25, 31, 23, 28, 27, 32, 24],
'percentage': [72.4, 91.7, 68.8, 85.3, 79.6, 83.2, 76.9, 92.5, 73.8, 87.4]}
df = df.append(pd.DataFrame(additional_data), ignore_index=True)
print("Task 1: DataFrame with 20 rows")
print(df)
print()
print("Task 2: Data Details")
print(f"Shape: {df.shape}")
print(f"Number of Rows: {len(df)}")
print(f"Number of Columns: {len(df.columns)}")
print(f"Data Types:\n{df.dtypes}\n")
print(f"Feature Names:\n{df.columns}\n")
print(f"Description:\n{df.describe()}\n")
print("Task 3: Basic Statistical Details")
print(df.describe())
print()
values
additional_data_task4 = {'name': ['Jane', np.nan, 'Bob', 'Alice', 'Eve'],
'age': [30, 27, 22, 28, np.nan],
'percentage': [88.3, 82.6, 65.2, np.nan, 77.8],
'remarks': ['', '', '', '', '']}
df = df.append(pd.DataFrame(additional_data_task4), ignore_index=True)
print("Task 4: DataFrame with 25 rows (including duplicates and missing values)")
print(df)