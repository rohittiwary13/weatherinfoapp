<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Zip to get Weather Info</title>
</head>
<body>
	<h3>Weather Info</h3>

	<form:form action="enterzip.html" commandName="enterZipForm">
		<table>
			<tr>          
				<td>Enter Zip Code:<FONT color="red"><form:errors
							path="zipcode" /></FONT></td>
			</tr>
			<tr>
				<td><form:input path="zipcode" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
	<h3>
		You have entered the zip::::
		<core:out value="${enterZipForm.zipcode}" default="No Value Entered" />
	</h3>
	<font color="blue" size="3"> City:: </font>
	${city} <br/>
	<font color="blue" size="3"> State:: </font>
	${state} <br/>
	<font color="blue" size="3"> Temperature in fahrenheit:: </font>
	${temperature} <br/>
	
</body>
</html>
