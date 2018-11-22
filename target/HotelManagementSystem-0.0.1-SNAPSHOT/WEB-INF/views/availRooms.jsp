<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import= "com.langmore.model.Inventory, java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Available Rooms</title>
</head>
<body>
<% List<Inventory> inv = (List<Inventory>) request.getAttribute("inventory"); %>
	<div class="container" >
		<table>
		<%
  			for (Inventory item:inv){
		 %>
			<tr>
<%-- 				<td><%= attending.getCourseName()%></td> --%>
<%-- 				<td><%= attending.getFullName()%></td> --%>
<%-- 				<td><%= attending.getEmail() %></td> --%>
					<c:set var="imageName" value="<%= item.getImageUrl()%>"/>
					<c:set var="roomType" value="<%= item.getItemType()%>"/>
					
	 			<td> <img src="<c:url value="/static/images/${imageName}"  />" width=200px height=150px></td>
				<td>
			 		<span>Unit: <strong><%=item.getItemType()%></strong></span>
<%-- 			 		<span>..............................Price: <strong><%= item.getPricePerUnit() %></strong></span> --%>
			 		<p>Description:</p>
			 		<p> <%= item.getDescription()%> </p>
			 		<a href="/HotelManagementSystem/getDetail?id=${roomType}" name="${roomType}">Get More Details >></a>
		 		</td>
	 		</tr>
		<% } %>
		</table>
	</div>
</body>
</html>