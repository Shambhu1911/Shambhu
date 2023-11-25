slip20
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
import numpy as np
import matplotlib.pyplot as plt
random_data = np.random.randint(0, 100, 50)
random_data = np.append(random_data, [150, 160])
plt.figure(figsize=(10, 4))
plt.boxplot(random_data, vert=False, patch_artist=True, boxprops=dict(facecolor='orange'))
plt.title('Box Plot with Outliers', fontsize=14)
plt.xlabel('Value', fontsize=12)
plt.grid(axis='x', linestyle='--', alpha=0.5)
plt.show()