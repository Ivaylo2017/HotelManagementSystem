<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Registration</title>
</head>
<body>
	<div class="regForm" >
		<form action="accountHome" method="POST">
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="fname">First name:</label>
					<input type="text" class="form-control" name="fname" placeholder="Enter your first name">
				</div>
				<div class="form-group col-md-6">
					<label for="lname">Last name:</label>
					<input type="text" class="form-control" name="lname" placeholder="Enter your last name">
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="phone">Phone number</label>
					<br>
					<input type="number" class="from-control" name="fname" placeholder="Enter your phone number">
				</div>
				<div class="form-group col-md-6">
					<label for="email">Email</label>
					<input type="email" class="form-control" id="inputEmail4" name="email" placeholder="Enter your email">
				</div>
			</div>
			<div class="form-group">
				<label for="strAddress">Street address</label>
				<input type="text" name="address" class="form-control" id="inputAddress" placeholder="Enter your street address">
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="city">City</label>
					<input type="text" class="form-control" id="inputCity" name="city" placeholder="Enter city">
				</div>
				<div class="form-control col-md-6">
					<label for="state">State</label>
					<select class="form-control" id="inputState" name="state">
					<option selected>Choose...</option>
						  <option value="AL">Alabama</option>
						  <option value="AK">Alaska</option>
						  <option value="AZ">Arizona</option>
						  <option value="AR">Arkansas</option>
						  <option value="CA">California</option>
						  <option value="CO">Colorado</option>
						  <option value="CT">Connecticut</option>
						  <option value="DE">Delaware</option>
						  <option value="DC">Dist of Columbia</option>
						  <option value="FL">Florida</option>
						  <option value="GA">Georgia</option>
						  <option value="HI">Hawaii</option>
						  <option value="ID">Idaho</option>
						  <option value="IL">Illinois</option>
						  <option value="IN">Indiana</option>
						  <option value="IA">Iowa</option>
						  <option value="KS">Kansas</option>
						  <option value="KY">Kentucky</option>
						  <option value="LA">Louisiana</option>
						  <option value="ME">Maine</option>
						  <option value="MD">Maryland</option>
						  <option value="MA">Massachusetts</option>
						  <option value="MI">Michigan</option>
						  <option value="MN">Minnesota</option>
						  <option value="MS">Mississippi</option>
						  <option value="MO">Missouri</option>
						  <option value="MT">Montana</option>
						  <option value="NE">Nebraska</option>
						  <option value="NV">Nevada</option>
						  <option value="NH">New Hampshire</option>
						  <option value="NJ">New Jersey</option>
						  <option value="NM">New Mexico</option>
						  <option value="NY">New York</option>
						  <option value="NC">North Carolina</option>
						  <option value="ND">North Dakota</option>
						  <option value="OH">Ohio</option>
						  <option value="OK">Oklahoma</option>
						  <option value="OR">Oregon</option>
						  <option value="PA">Pennsylvania</option>
						  <option value="RI">Rhode Island</option>
						  <option value="SC">South Carolina</option>
						  <option value="SD">South Dakota</option>
						  <option value="TN">Tennessee</option>
						  <option value="TX">Texas</option>
						  <option value="UT">Utah</option>
						  <option value="VT">Vermont</option>
						  <option value="VA">Virginia</option>
						  <option value="WA">Washington</option>
						  <option value="WV">West Virginia</option>
						  <option value="WI">Wisconsin</option>
						  <option value="WY">Wyoming</option>
					</select>
				</div>
			</div>
			<label for="preferences">Preferences</label>
			<textarea name="preferences" id="textarea">Tell us specific requests regarding your stay</textarea>
			<div class="form-row">
				<div class="form-control col-md-6">
					<label for="ccinfo">Credit card</label>
					<input type="number" class="form-control" name="ccinfo" placeholder="Enter cc number">
				</div>
				<div class="form-control col-md-3">
					<label for="exp">Valid through</label>
					<input type="date" class="form-control" name="exp" placeholder="Enter card expiration date">
				</div>
				<div class="form-control col-md-3">
					<label for="ccv">CCV</label>
					<input type="number" class="form-control" name="ccv" placeholder="Enter CCV code from back of card">
				</div>
			</div>
			<br>
			<input type="submit" name="submit"  value="Submit"/>
		</form>
	</div>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>