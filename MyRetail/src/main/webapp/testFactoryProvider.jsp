<%@page import="com.deloitte.myretail.helper.FactoryProvider"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test Factory Provider</title>
</head>
<body>
<h1>I am creating Session Factory</h1>


<%
	//Java Code only
	//Singleton  Design Pattern in java
	out.println(FactoryProvider.getFactory()+"<br>");
	out.println(FactoryProvider.getFactory()+"<br>");
	out.println(FactoryProvider.getFactory()+"<br>");
	out.println(FactoryProvider.getFactory()+"<br>");
	out.println(FactoryProvider.getFactory()+"<br>");
	out.println(FactoryProvider.getFactory()+"<br>");
	out.println(FactoryProvider.getFactory()+"<br>");
	out.println(FactoryProvider.getFactory()+"<br>");


%>


</body>
</html>