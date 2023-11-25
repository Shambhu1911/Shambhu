slip19
import pandas as pd
import numpy as np
data = {
'name': ['John', 'Jane', 'Bob', 'Alice', 'Eve', 'Mark', 'Emily', 'David', 'Sarah', 'Michael'],
'age': [25, 30, 28, 27, 32, 29, 26, 31, 33, 30],
'percentage': [78.5, 89.2, 67.8, 92.0, 81.3, 76.7, 88.9, 72.4, 94.1, 85.6]
}
df = pd.DataFrame(data)
print(f"Shape of the DataFrame: {df.shape}")
print(f"Number of Rows: {len(df)}")
print(f"Number of Columns: {len(df.columns)}")
print("\nData Types:")
print(df.dtypes)
print("\nFeature Names:")
print(df.columns.tolist())
print("\nDescription:")
print(df.describe())
missing_data = pd.DataFrame({'name': [None, 'Lisa', 'John', 'Bob', 'Eve'],
'age': [35, None, None, 28, 33],
'percentage': [None, 77.2, 89.5, 66.9, None],
'remarks': ['Missing', 'Duplicate', 'Duplicate', 'Duplicate', 'Missing']})
df = df.append(missing_data, ignore_index=True)
print("\nUpdated DataFrame:")
print(df)



