<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Langmore Hotel</title>
</head>
<style>
.body {
		background-color: blue;
	}
#text{
		text-align:center;
		margin: 30px;
		width: 90%;
	}
#btn {
	background-color: green;
	position: center;
	float: right;
}
#images{
	margin: 30px;
	width: 90%;
	}
</style>
<body>
	<h2 align="center"><i>Welcome to <b>Langmore Hotel</b></i></h2>
	<div id='images'>
	<table>
		<tr>
			<td><img src="<c:url value="/static/images/outdoor swimming pool.jpg"  />" width=330px height=200px></td>
			<td><img src="<c:url value="/static/images/5-star dining.jpg"  />" width=330px height=200px></td>
			<td><img src="<c:url value="/static/images/rooftop jacuzzi.jpg"  />" width=330px height=200px></td>
		</tr>
		<tr>
			<td><img src="<c:url value="/static/images/great room service.jpeg"  />" width=330px height=200px></td>
			<td><img src="<c:url value="/static/images/welcoming cafe.png"  />" width=330px height=200px></td>
			<td><img src="<c:url value="/static/images/quick check-in.jpg"  />" width=330px height=200px></td>
		</tr>
	</table>
	</div>
	<div id ="text">
		<p>Let you vacation experience begin with <i>Langmore Hotel</i> -  where days fill with sun and play
		are elegantly combined with fine dining and supreme customer service.
		Enjoy our spa and jacuzzi or have fun with your kids by the pool. Visit our welcoming cafe and enjoy fun conversation
		 with your loved ones over a cup of hot or cold beverage of your choice. Ready for dinner? Join us exquisite 5-star dining
		 experience in the <i>Oaktree at Langmore Restaurant</i>. Featuring master chef Maria Izqueba and silver dining service we'll 
		 set the tone for an amazing evening. Lounge in the outdoor patio or retire to  your luxurious apartments with full room-service
		 cable Tv, free High Speed Internet Access, fridge. The choice is yours!
	</div>
	
	<form id='form' style='align-bottom' action='availRooms' method='GET'>
	<input id="btn" type='submit' value='Check Our Services'>
	</form>
</body>
</html>