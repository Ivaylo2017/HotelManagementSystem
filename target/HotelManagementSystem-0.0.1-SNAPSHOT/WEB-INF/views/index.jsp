<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Langmore Hotel</title>
</head>
<body>
	<h2>Welcome to Langmore Hotel</h2>
	<p> This page will display images of the hotel and allow guests to browse inventory</p>
	<form id='form' style='align-bottom' action='/rooms/availRooms' method='POST'>
	select dates to check availability:<br>
	from: <input type='date' name='startdate'>
	to:<input type='date' name='endDate'>
	<input type='submit' value='Submit'>
	
	</form>
</body>
</html>