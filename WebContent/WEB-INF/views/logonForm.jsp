<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logon</title>
</head>
<body>
	<h2>Logon</h2>
	<div class="form">
	
		<label for ="username">Username:</label>
		<input type="text" name="username"/>
		<br>
		<label for="pass">Password:</label>
		<input type="password" name="pass"/>
		<br>
			<form action="accountHome" method="POST">
		<input type="submit" name="login" value="Login"/>
		</form>
		<form action="register" method="POST">
		<input type="submit" name="register" value="Register"/> 
		</form>
	</div>
</body>
</html>