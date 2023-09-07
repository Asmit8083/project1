<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
This is our Home page <br>
<a href="<%=request.getContextPath() %>/Controller?page=services"> Services </a>
<a href="<%=request.getContextPath() %>/Controller?page=contact">Contact Us</a>
<a href="<%=request.getContextPath() %>/Controller?page=about"> About Us </a>
</body>
</html>