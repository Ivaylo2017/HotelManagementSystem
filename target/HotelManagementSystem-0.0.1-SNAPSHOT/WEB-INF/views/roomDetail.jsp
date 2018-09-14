<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import ="com.langmore.model.Inventory"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Room Detail</title>
</head>
<body>
<% Inventory inventory = (Inventory) request.getAttribute("room"); %>
	<div id='roomInfo'>
		<p><%= inventory.getImageUrl() %></p>
		<p><%= inventory.getDescription() %></p>
		<p><%= inventory.getPricePerUnit() %></p>
	</div>
	<div id='form'>
		<form action='book' method='POST'>
			From: <input type='date' name='startdate'>
			To:<input type='date' name='endDate'><br>
			<input id='requestButton' type='submit' value='Request Quote'>
			<input id='bookButton' type='submit' value='Book'>
		</form>
	</div>
</body>
</html>