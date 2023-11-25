slip12->
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
plt.figure(figsize=(10, 4))
plt.hist(random_data, bins=10, color='purple', edgecolor='black', alpha=0.7)
plt.title('Histogram', fontsize=14)
plt.xlabel('Value', fontsize=12)
plt.ylabel('Frequency', fontsize=12)
plt.grid(axis='y', alpha=0.5)
plt.show()
plt.figure(figsize=(10, 4))
plt.boxplot(random_data, vert=False, patch_artist=True, boxprops=dict(facecolor='orange'))
plt.title('Box Plot', fontsize=14)
plt.xlabel('Value', fontsize=12)
plt.grid(axis='x', linestyle='--', alpha=0.5)
plt.show()


B->
import pandas as pd
data = {
'name': ['John', 'Jane', 'Bob', 'Alice', 'Eve', 'John', 'Bob', 'Jane', 'Eve', 'Alice', '', None, 'Bob'],
'salary': [50000, 60000, None, 65000, 70000, 50000, 55000, 60000, None, 70000, 75000,
80000, 55000],
'department': ['HR', 'IT', 'Sales', 'HR', 'IT', 'HR', 'Sales', 'IT', 'IT', 'Sales', 'IT', 'HR', 'Sales']
}
df = pd.DataFrame(data)
print("Original DataFrame:")
print(df)
df = df.dropna(subset=['name', 'salary', 'department']).replace('', None)
print("\nModified DataFrame:")
print(df)