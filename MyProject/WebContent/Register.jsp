<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Employee</title>
</head>
<body>
<center>
<form name="form2" action="Register1" method="POST">
<tr>
<td>First Name:</td><td><input type="text" name="fname"/></td><br><br>
</tr>
<tr>
<td>Last Name:</td><td><input type="text" name="lname"/></td><br><br>
</tr>
<tr>
<td>Employee Id:</td><td><input type="text" name="eid"/></td><br><br>
</tr>
<tr>
<td>Email:</td><td><input type="text" name="email"/></td><br><br>
</tr>
<tr>
<td>Age:</td><td><input type="text" name="age"/></td><br><br>
</tr>
<tr>
<td>Department:</td><td><select name="dept">
	<option value="Accounts">Accounts</option>
    <option value="Sales">Sales</option>
    <option value="Finance">Finance</option>
    <option value="IT">IT</option>
    </select></td><br><br>
</tr>
<tr>
<td>Salary:</td><td><input type="text" name="sal"/></td><br><br>
</tr>
<tr>
<td>Phone Number:</td><td><input type="text" name="pno"/></td><br><br>
</tr>
<tr>
<td>Address Line 1:</td><td><input type="text" name="add1"/></td><br><br>
</tr>
<tr>
<td>Address line 2:</td><td><input type="text" name="add2"/></td><br><br>
</tr>
<tr>
<td>City:</td><td><select name="city">
	<option value="Mumbai">Mumbai</option>
    <option value="Banglore">Banglore</option>
    <option value="Hydrabad">Hydrabad</option>
    <option value="Delhi">Delhi</option>
    </select></td><br><br>
</tr>
<tr>
<td><input type="submit" value="Submit"/></td>
<td><input type="reset" value="Reset"/></td>
</tr>
</form>
</center>
</body>
</html>