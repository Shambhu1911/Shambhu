slip11->
q1
Q1.
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
href=>
<script src=></script>
<script
src="></script>
<script
src=""></script>
</head>
<body>
<div class="container">
<h2>Button Styles</h2>
<button type="button" class="btn">Basic</button>
<button type="button" class="btn btn-primary">Primary</button>
<button type="button" class="btn btn-secondary">Secondary</button>
<button type="button" class="btn btn-success">Success</button>
<button type="button" class="btn btn-info">Info</button>
<button type="button" class="btn btn-warning">Warning</button>
<button type="button" class="btn btn-danger">Danger</button>
<button type="button" class="btn btn-dark">Dark</button>
<button type="button" class="btn btn-light">Light</button>
<button type="button" class="btn btn-link">Link</button>
</div>
</body>
</html>


q2a
import pandas as pd
import matplotlib.pyplot as plt
iris_data = pd.read_csv('iris.csv')
species_frequency = iris_data['species'].value_counts()
plt.figure(figsize=(8, 8))
plt.pie(species_frequency, labels=species_frequency.index, autopct='%1.1f%%', startangle=140,
colors=['#ff9999','#66b3ff','#99ff99'])
plt.title('Frequency of Iris Species')
plt.axis('equal') 
plt.show()


B->
import pandas as pd
wine_data = pd.read_csv('winequality-red.csv')
statistical_details = wine_data.describe()
print(statistical_details)