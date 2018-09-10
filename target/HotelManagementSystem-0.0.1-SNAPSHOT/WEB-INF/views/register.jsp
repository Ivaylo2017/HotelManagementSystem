<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<div class="regForm" >
		<form action="accountHome" method="POST">
			<label for="fname">First name:</label>
			<input type="text" name="fname" placeholder="Enter your first name">
			<br>
			<label for="lname">Last name:</label>
			<input type="text" name="lname" placeholder="Enter your last name">
			<br>
			<label for="phone">Phone number:</label>
			<input type="text" name="fname" placeholder="Enter your phone number">
			<br>
			<label for="email">Email:</label>
			<input type="text" name="email" placeholder="Enter your email">
			<br>
			<label for="strAddress">Street address:</label>
			<input type="text" name="address" placeholder="Enter your street address">
			<br>
			<label for="city">City:</label>
			<input type="text" name="city" placeholder="Enter city">
			<br>
			<label for="state">State:</label>
			<input type="text" name="state" placeholder="Enter state">
			<br>
			<label for="preferences">Preferences:</label>
			<textarea name="preferences" id="textarea">Enter your first name</textarea>
			<br>
			<label for="ccinfo">Credit card:</label>
			<input type="text" name="ccinfo" placeholder="Enter cc number">
			<br>
			<label for="exp">Valid through::</label>
			<input type="text" name="exp" placeholder="Enter card expiration date">
			<br>
			<label for="ccv">CCV:</label>
			<input type="text" name="ccv" placeholder="Enter CCV code from back of card">
			<br>
			<input type="submit" name="submit"  value="Submit"/>
		</form>
	
	</div>
</body>
</html>