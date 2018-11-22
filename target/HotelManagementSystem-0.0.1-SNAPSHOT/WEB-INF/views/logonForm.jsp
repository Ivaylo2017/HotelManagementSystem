<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logon</title>
</head>
<body>
	<h2>Logon Form</h2>
	<% if (request.getAttribute("message") != null){
		out.print("<span style='color:red'>" + request.getAttribute("message") + "</span>");
	}%>
	<div class="container">
		<form action="accountHome" method="POST">
			<label for ="username">Username:</label>
			<input type="text" name="username"/>
			<br><br>
			<label for="pass">Password:</label>
			<input type="password" name="pass"/>
			<input type="hidden" name="user_type" value="customer"/>
			<br><br>
			<input type="submit" name="login" value="Login"/>
			<span><input type="submit" name="register" value="Register"/> </span>
		</form>
	</div>
</body>
</html>