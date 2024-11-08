<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Dinner</title>
</head>
<body>

<h1>Dinner time</h1>

<#list dishes as dish>
    <p>${dish.name}</p> <br>
    <a href="/dishes/${dish.id}">Open</a>
</#list>

<h3>Add dish</h3>

<form action="dish/create" method="post">
    Name:
    <input type="text" name="name"/>
    <input type="submit" value="Add dish">
</form>
</body>
</html>