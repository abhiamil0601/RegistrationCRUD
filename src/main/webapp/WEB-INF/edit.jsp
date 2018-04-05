<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Edit User</h2>
<spring:url value="/Home/list" var="list"  />
<a href="/list">UserList</a>
<c:url var="action" value="/Home/update"/>
<form:form method="post" action="${action}" modelAttribute="user">
  <table>
       <tr><td> <form:hidden path="userId"/>
        <form:label path="name">Name</form:label>
        </td> 
        <td>
        <form:input path="name"/>
        </td>
        </tr>  
        <tr>
          <td><form:label path="email">Email</form:label>
        </td> 
        <td>
        <form:input path="email"/>
        </td>
        </tr>
        <tr>
          <td><form:label path="mobileno">MobileNO</form:label>
        </td> 
        <td>
        <form:input path="mobileno"/>
        </td>
        </tr>
        <tr>
          <td><form:label path="skills">Skills</form:label>
        </td> 
        <td>
        <form:input path="skills"/>
        </td>
        </tr>
        <tr>
        <td colspan="2"><input type="submit" value="Update User"/> </td>
        </tr>
  </table>
</form:form>
</body>
</html>