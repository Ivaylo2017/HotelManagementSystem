<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirm Order</title>
</head>
<body>
	<img class="img" src="/static/images/${roomImage}"/>
	<h2>Room name</h2>
	<h3>From ..... to.....</h3>
	<h3>Total</h3>
	<p>Description - Amenities</p>
	<form class="confirm" action="confirmed" method="POST">
		<input type="submit" name="submit" value="Book"/>
	</form></body>
</html>