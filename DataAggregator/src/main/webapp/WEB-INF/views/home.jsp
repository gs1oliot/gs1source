<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Data Aggregator</title>
	<meta http-equiv="content-type" content="text/html; charset=utf-8">
	<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet" type="text/css">
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

<h3>What is GS1 Source?</h3>
<p>
<strong>GS1 Source</strong> is a framework for sharing product information in the digital world. Through GS1 Source, Brand owners can increase sales, protect the brand, improve the shopping experience, and connect to the digital world, Application developers can optimize consumer experience, increase efficiency, and comply with regulations, and Consumers can get accurate product data.
</p>
<p>
<strong>GS1 Source</strong> is a network of data aggregators who have all agreed to use GS1 standards. Data aggregators gather product data from brand owners and manufacturers, share it with each other on the cloud, and make it available to developers for their web and mobile applications.
</p>

<h3>Why GS1 Source is needed?</h3>
<p>
<strong>To provide reliable information of products</strong><br/>
Reliability of information of products is a critical component.<br/>
GS1 Source can assure reliability.<br/>
- Data aggregator is managed by chartered institute or corporation.<br/>
- Data aggregator should be certified by GS1 organization.<br/>
- Data exchange between data aggregators is carried out with authentication.<br/>
</p>
<p>
<strong>To make consumers easily obtain the desired product data</strong><br/>
It is hard to obtain accurate product data in real-time.<br/>
GS1 provides simple method for acquisition of product data.<br/>
Consumers can get the information of the desired product by scanning the ID such as barcode or RFID.<br/>
</p>

<h3>Trusted Source of Data</h3>
<p>
The aim of the TSD framework is to support the communication of authentic and accurate product data by brand owners to consumers/shoppers, retailers, Internet applications, and government using internet and mobile devices.
</p>
<img src="<c:url value="/resources/figures/TSD_Framework_v3_2.png"/>" width="500" height="331"/>

</div>

<div id="lefty">
<div id="menu">
<a href=""><strong>HOME</strong></a>
<a href="./register">Register Page</a>
<a href="./query">Query Page</a>
</div>
</div>

<div class="footer">
      <p>&copy; Auto-ID Labs. Korea <a target="_blank" href="http://oliot.org">Oliot.org</a></p>
    </div>


</div>

</body>
</html>
