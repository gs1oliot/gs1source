<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Register Page</title>
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

<div id="content">
<form action="registered" method="post">
<h2>Register the xml string of product data</h2>
Service Key : <input type="text" name="key"/><br/>
Product Data as XML format :<br/>
<textarea name="xmldata" rows="40" cols="70"></textarea><br/>
<input type="submit" value="Register">
</form>
</div>

<div id="lefty">
<div id="menu">
<a href="${pageContext.request.contextPath}">HOME</a>
<a href="./register"><strong>Register Page</strong></a>
<a href="./query">Query Page</a>
</div>
</div>

<div class="footer">
      <p>&copy; Auto-ID Labs. Korea <a target="_blank" href="http://oliot.org">Oliot.org</a></p>
    </div>
</div>
</body>
</html>