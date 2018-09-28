<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Request a Quote</title>
</head>
<body>
	<div> 
		<p>You can use this form to request a quote if you need to book more than 1 rooms under same
	person's name or if you need to request a discount for extended stays. One of our sales agents will contact
	you promptly
	</p>
	<br>
	<form action="processQuote" method="POST">
		<label for="email" >Your Email:</label><input type="text" id="email" name="emial" placeholder="Enter Your Email">
		<label for="description">Request:</label><input type="textarea" id="description" name="desc">
		<div><input type="submit" name="submit" value="Submit"/></div>	
	 </form>
	</div>
</body>
</html>