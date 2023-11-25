#slip9->



q2a
import numpy as np
import matplotlib.pyplot as plt
random_data = np.random.randint(0, 100, 50)
plt.figure(figsize=(10, 4))
plt.plot(random_data, color='blue', marker='o', linestyle='-', linewidth=2, markersize=8)
plt.title('Line Chart', fontsize=14)
plt.xlabel('Index', fontsize=12)
plt.ylabel('Value', fontsize=12)
plt.grid(True, linestyle='--', alpha=0.5)
plt.show()
plt.figure(figsize=(10, 4))
plt.scatter(range(50), random_data, color='green', label='Data Points', s=50)
plt.title('Scatter Plot', fontsize=14)
plt.xlabel('Index', fontsize=12)
plt.ylabel('Value', fontsize=12)
plt.legend()
plt.grid(True, linestyle='--', alpha=0.5)
plt.show()

B->
import matplotlib.pyplot as plt
subjects = ['Math', 'Science', 'English', 'History']
marks = [85, 90, 75, 88]
plt.figure(figsize=(8, 8))
plt.pie(marks, labels=subjects, autopct='%1.1f%%', startangle=140,
colors=['#ff9999','#66b3ff','#99ff99', '#ffcc99'])
plt.title('Subject-wise Marks Distribution')
plt.axis('equal') 
plt.show()



C->
import pandas as pd
data = pd.read_csv('winequality-red.csv')
description = data.describe()
shape = data.shape
first_3_rows = data.head(3)
print("a) Describing the dataset:")
print(description)
print("\nb) Shape of the dataset:")
print(shape)
print("\nc) Display first 3 rows from dataset:")
print(first_3_rows)