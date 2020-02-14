<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Temp Converter</title>
</head>
<body>
<h1> Welcome to the super cool Temp Converter </h1>

	<form action= "getTempServlet" method ="post">
	Enter the temperature to convert as a whole number:
	<input type= "text" name= "userTemp" size= "3">
	<br>
	<input type="checkbox" name="celsiusEntered" value="true"> Check if entering celsius 
	<input type= "submit" value= "Calculate Temp">
	</form>


</body>
</html>