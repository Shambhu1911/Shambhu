slip14->
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
src=></script>
<script
src=></script>
</head>
<body>
<div class="container">
<div class="row">
<div class="col-sm-4">
<h3>Column 1</h3>
<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
</div>
<div class="col-sm-4">
<h3>Column 2</h3>
<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
</div>
<div class="col-sm-4">
<h3>Column 3</h3>
<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit...</p>
<p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris...</p>
</div>
</div>
</div>
</body>
</html>


q2
import numpy as np
arr = np.array([1, 2, 3, 4, 5, 6])
weights = np.array([0.1, 0.2, 0.3, 0.2, 0.1, 0.1])
arr = arr.flatten()
weighted_avg = np.average(arr, weights=weights)
print(f"The weighted average is: {weighted_avg}")
B->
import pandas as pd
data = pd.read_csv('advertising.csv')
statistical_details = data.describe()
print(statistical_details)