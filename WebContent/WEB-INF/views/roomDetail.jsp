<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import ="com.langmore.model.Inventory"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Room Detail</title>
</head>
<body>
<% Inventory inventory = (Inventory) request.getAttribute("room"); %>
<c:set var="imageName" value="<%= inventory.getImageUrl()%>"/>

	<div id='roomInfo'>
		 <img src="<c:url value="/static/images/${imageName}"/>" width=200px height=150px>
		<p>Description: <br><%= inventory.getDescription() %></p>
		<p>Price: ..........................................<%= inventory.getPricePerUnit() %></p>
	</div>
	<div id='form'>
		<form action='book' method='POST'>
			From: <input type='date' name='startdate'>
			To:<input type='date' name='endDate'><br>
			<br><br>
			<input id='requestButton' type='submit' value='Request Quote'>
			<input id='bookButton' type='submit' value='Book'>
		</form>
	</div>
</body>
</html>