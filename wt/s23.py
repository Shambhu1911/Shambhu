slip23
q2
import pandas as pd
from sklearn.preprocessing import MinMaxScaler, StandardScaler, Binarizer
data = pd.read_csv('winequality-red.csv')
X = data.drop('quality', axis=1)
y = data['quality']

scaler = MinMaxScaler()
X_rescaled = scaler.fit_transform(X)
std_scaler = StandardScaler()
X_standardized = std_scaler.fit_transform(X)

binarizer = Binarizer(threshold=3.5) 
X_binarized = binarizer.transform(X)
print("Rescaled Data:")
print(X_rescaled[:5]) 
print("\nStandardized Data:")
print(X_standardized[:5]) 
print("\nBinarized Data:")
print(X_binarized[:5]) 