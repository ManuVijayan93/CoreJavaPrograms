<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page-MVC DEMO</title>

</head>
<body>
<form action="LoginCheck" methods="post">
<table align="center" cellspacing="2"></table>
<tr>
<td colspan="2"><center>Login Dialog</center></td>
</tr>
<tr>
<td>User Name</td><td><input type="text" name="uname"/></td>
</tr>
<tr>
<td>Password</td><td><input type="password" name="passwd"/></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="SUBMIT"/></td>
</tr>

</tables>
</form>