<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Register Here</title>
</head>
<body>
<h1>Student Admission from</h1>
<c:url var="action" value="/Home/create"></c:url>
<form:form method="post" action="${action}" modelAttribute="user">
<h2>${msg}</h2>
<table>
<tr><td><form:label path="name">Name:</form:label></td><td><form:input type="text" name="name" placeholder="Your Name here" path="name" /></td></tr>
<tr><td><form:label path="email">Email:</form:label></td><td><form:input type="text" name="email"  placeholder="Your email here" path="email"/></td></tr>
<tr><td><form:label path="mobileno">MOBILE:</form:label></td><td><form:input type="number" name="mobileno"  placeholder="Mobile no" path="mobileno" /></td></tr>
<tr><td><form:label path="skills">Your SKILLS:</form:label></td><td><form:select name="skills" multiple="multiple" path="skills">
<form:option value="core Java">core Java</form:option>
<form:option value="Hadoop">Hadoop</form:option>
<form:option value="Spring">Spring</form:option>
</form:select></td></tr>
<tr><td colspan="2"><input type="submit" value="SUBMIT" /></td></tr>
</table>
</form:form>
</body>
</html>