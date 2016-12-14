<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Query Page</title>
	<meta http-equiv="content-type" content="text/html; charset=utf-8">
	<link href="/DataAggregator/resources/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id="main">

<div id="header">
<span class="title">GS1 Source Data Aggregator</span><br>
<span style="margin-left: 28px">GS1 Source is a framework for sharing product information in the digital world.</span>
</div>
<div id="corporate">
<h3>Welcome to Data Aggregator Server</h3>
</div>

<%
String gtin = request.getParameter("gtin");
if(gtin == null) {
	gtin = "";
}
String targetMarket = request.getParameter("targetMarket");
if(targetMarket == null) {
	targetMarket = "";
}
%>

<div id="content">
<h2>Query product data</h2>
<form action="query">
GTIN:	<input type="text" name="gtin" value=<% out.print(gtin); %>><br/>
Target Market:	<input type="text" name="targetMarket" value=<% out.print(targetMarket); %>><br/>
<input type="submit" value="Generate Query Link"/><br/>
</form>

<strong>Link: </strong><a href="${pageContext.request.contextPath}/v1/ProductData/gtin/<%= gtin %>?targetMarket=<%= targetMarket %>">
${pageContext.request.contextPath}/v1/ProductData/gtin/<%= gtin %>?targetMarket=<%= targetMarket %>
</a>
</div>

<div id="lefty">
<div id="menu">
<a href="${pageContext.request.contextPath}">HOME</a>
<a href="./register">Register Page</a>
<a href="./query"><strong>Query Page</strong></a>
</div>
</div>

<div class="footer">
      <p>&copy; Auto-ID Labs. Korea <a target="_blank" href="http://oliot.org">Oliot.org</a></p>
    </div>
</div>
</body>
</html>