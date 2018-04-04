<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List</title>
</head>
<body>
<h1>Employee List</h1>
<spring:url value="/Home/index" var="register">
   <a href="${register}">Register Here</a>
   <c:if test="${!empty userList}">
   <table border="2">
   <tr>
   <th>Name</th>
   <th>Email</th>
   <th>Mobile</th>
   <th>Skills</th>
   <th>Actions</th>
   </tr>
   <c:forEach items="${userList}" var="user">
   <tr>
    <td><c:out value="${user.name }" /></td>
    <td><c:out value="${user.email }" /></td>
    <td><c:out value="${user.mobileno }" /></td>
    <td><c:out value="${user.skills }" /></td>
    <td>
     <a href="<c:url value='/Home/edit/${user.userId}'/>" />Edit</a>
     <a href="<c:url value='/Home/delete/${user.userId}'/>" />Delete</a>
     <a href="<c:url value='/Home/details/${user.userId}'/>" />Details</a>
    </td>
   </tr>
   </c:forEach>
   </table>
   </c:if>
</spring:url>
</body>
</html>