<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Account</title>
<style>
/* header style*/
.header {
	background-color: #f1f1f1;
	text-align: center;
	padding: 20px;
}

body {
	margin: 0;
}

input[type=text], select, textarea {
	width: 100%;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	resize: vertical;
}

label {
	padding: 12px 12px 12px 0;
	display: inline-block;
}

input[type=submit], input[type=reset] {
	background-color: #4CAF50;
	color: white;
	padding: 12px 20px;
	margin-right: 10px;
	margin-top: 10px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	float: right;
	border: none;
}

.container {
	border-radius: 10px;
	padding: 20px;
	background-color: #f2f2f2;
}

.col-25 {
	float: right;
	width: 25%;
	margin-top: 6 px;
}

.col-75 {
	float: right;
	width: 50%;
	margin-top: 6 px;
}

.row:after {
	content: "";
	display: table;
	clear: both;
}

ul {
	list-style-type: none;
	margin: 20;
	padding: 0px;
	width: 20%;
	background-color: #f1f1f1;
	position: fixed;
	height: 100%;
	overflow: auto;
}

li a {
	display: block;
	color: #000;
	padding: 8px 16px;
	text-decoration: none;
}

li a.active {
	background-color: #4CAF50;
	color: white;
}



li a:hover:not(.active ) {
	background-color: #555;
	color: white;
}

.col-nav {
	float: left;
	width: 20%;
	
}

@media screen and (max-width: 600px) {
	.col-25, .col-75, input[type=submit] {
		width: 100%;
		margin-top: 0;
	}
}
</style>
</head>
<body>

	<div class="header">
		<h1>SSS Bank</h1>
		<p>Relationships beyond Banking</p>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-nav">
				<ul>
					<li><a class="active" href="#home">Personal Information</a></li>
					<li><a href="#news">Contact Information</a></li>
					<li><a href="#contact">Address Information</a></li>
					<li><a href="#about">Identity Information</a></li>
					<li><a href="#about">Final Submission</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="container">


		<form method="post" action="PersonalInformation">
			<center><h1>Personal Information</h1></center>
			<div class="row">
				<div class="col-75">
					<input type="text" name="fname">
					</div>
				<div class="col-25">
					<label>First Name</label>
				</div>
			</div>
	<div class="row">
		<div class="col-75">
			<input type="text" name="lname">

		</div>
		<div class="col-25">
			<label>Last Name</label>
		</div>



	</div>

	<div class="row">
		<div class="col-75">
			<input type="date" name="dob">

		</div>
		<div class="col-25">
			<label>Date of Birth</label>
		</div>


	</div>

	<div class="row">

		<div class="col-75">
			<select id="gender" name="gender">
				<option value="m">Male</option>
				<option value="f">Female</option>
			</select>
		</div>
		<div class="col-25">
			<label for="country">Gender</label>
		</div>
	</div>
	<div class="row">
		<div class="col-75">
			<input type="submit" value="Submit" /> 
			<input type="reset" value="Reset" />
		</div>
	</div>
	</form>
	</div>

</body>
</html>