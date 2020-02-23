<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>
		Welcome to shipment Type Register page
		<h3 />

		<pre>
		

shipment Mode;
<select name="Shipmode">
<option>----select----</option>
<option>Air</option>
<option>Trunk</option>
<option>ship</option>
<option>Train</option>

</select>
shipment code;
<input type="text" name="Shipcode" />
Enable shipment;
<select name="enbShip">
<option>----select----</option>
<option>Yes</option>
<option>no</option>

</select>
shipment Grade;
<input Type="radio" name="shipGrade" value="A">A
<input Type="radio" name="shipGrade" value="B">B
<input Type="radio" name="shipGrade" value="C">C

Description;
<textarea name="shipDesc "></textarea>
<input type="Submit" value="CREAT SHIPMENT" />
 
<form action = "save" method ="post">
</form>
$(message)
</pre>
</body>
</html>