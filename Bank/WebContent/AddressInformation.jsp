<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	long accNo=(long) session.getAttribute("accountNumber");

%>

<form action="Address" method="post">
	<label>Address Line 1:</label>
	<input type="text" name="add1">

	<label>Address Line 2:</label>
	<input type="text" name="add2">

	<label>City:</label>
	<input type="text" name="city">

	<label>State:</label>
	<input type="text" name="state">

	<label>Zip Code:</label>
	<input type="number" name="zip">

	<input type="submit" name="Submit">
	<input type="reset" name="Reset">


</form>

</body>
</html>