<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>
<a href="${list}">UserList</a>
<c:url var="action" value="/Home/update"/>
<h3>${msg}</h3>
<h2>User Details are:</h2>
<h2>${display_name}</h2>
<h2>${display_email}</h2>
<h2>${display_mobileno}</h2>
<h2>${display_skills}</h2>
</body>
</html>