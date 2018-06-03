<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Home Page</title>
<style>
* {
    box-sizing: border-box;
}
body {
  margin: 0;
}

/* header style*/
.header {
	background-color: #f1f1f1;
	text-align: center;
	padding: 20px;
}


.column{
	float: left;
	padding: 20px;
	}
	
.column.side{
	width: 30%;
} 

.column.middle{
	width: 70%
}
  
</style>
</head>
<body>
	
		<div class="header">
			<h1>SSS Bank</h1>
			<p>Relationships beyond Banking</p>
		</div>
		
		<div class="row">
			<div class="column side">
				<h1>Login</h1>
				<form action="login" method="post">
				<table>
					<tr>
						<td><p>Username:</p></td>
						<td><input type="text" name="uname"></td>
					</tr>
					<tr>
						<td><p>Password:</p></td>
						<td><input type="password" name="pwd"></td>
					</tr>
				
				</table>
				<input type="submit" value="Login">
				<input type="reset" value="Reset">
				</form>
			</div>
			<div class="column middle">
			<h1>About</h1>
			<h4>Bank of Baroda is proud to receive the appreciation and honor from World Trade Center, Mumbai for the Best Digitized Supply Chain Finance platform to help MSME at the 7th Global Economics Summit 2018.</h4>
			<h4>Bank of Baroda has been awarded winner in Agricultural Banking in the large class bank category in ASSOCHAM social banking excellence award 2017.</h4>
			<h4>Bank of Baroda has been ranked among the top 50 companies in India on People Capital Index(PCI) which is brought out by HR analytics and assessment firm, Jombay in partnership with Job portal site Naukri.com and British Standards Institute (BSI)</h4>
			<a href="createAccount.jsp">Create an account!!</a>
			</div>
		</div>
		
  
</body>
</html>