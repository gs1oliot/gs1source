<%@ page language="java" contentType="text/xml; charset=UTF-8"
    pageEncoding="UTF-8"%>${ResponseString}

<%
	String mac = (String) request.getAttribute("payloadMac");
	if(mac.compareTo("0") != 0)
		response.setHeader("GS1-MAC", mac);
%>