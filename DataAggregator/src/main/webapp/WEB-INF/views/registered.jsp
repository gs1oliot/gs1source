<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registered Page</title>
</head>
<body>
<%@page import="org.gs1.source.service.DAOFactory" %>
<%@page import="org.gs1.source.service.registration.Registerar" %>
<%@page import="org.gs1.source.service.mongo.ServiceKey" %>
<%
	String key = request.getParameter("key");

	String xmldata = request.getParameter("xmldata");
	Registerar registerar = new Registerar(new DAOFactory(), "mongo");

	int result = registerar.register(key, xmldata);
	if (result == Registerar.NODATA)
		out.println("<h2>Please fill the blank.<h2>");
	else if (result == Registerar.NOT_VALID)
		out.println("<h2>The xml data is not valid.<h2>");
	else if (result == Registerar.EXISTED)
		out.println("<h1>The product is already exists.<h1>");
	else if (result == Registerar.NOT_AUTHENTICATED)
		out.println("<h1>The product is registered at Aggregator.<h1>");
	else
		out.println("<h1>The service key is not registered.<h1>");
%>
</body>
</html>