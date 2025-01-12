<%--
网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
author  yeeku.H.lee kongyeeku@163.com
version  1.0
Copyright (C), 2001-2018, yeeku.H.Lee
This program is protected by copyright laws.
Program Name:
Date: 
--%>

<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>使用s:append标签拼接集合和Map</title>
</head>
<body>
<!-- 使用append将List和Map集合拼接在一起
	新集合实际上是Map集合，其名字为newList -->
<s:append var="newList">
	<s:param value="#{'疯狂Java讲义':'李刚',
		'疯狂iOS讲义':'李刚',
		'经典Java EE企业应用实战':'李刚'}" />
	<s:param value="#{'http://www.crazyit.org', 
		'http://www.fkit.org'}" />
</s:append>
<table border="1" width="280">
<!-- 使用iterator迭代newList集合 -->
<s:iterator value="#newList" status="st">
	<tr <s:if test="#st.odd">
		style="background-color:#bbbbbb"</s:if>>
		<td><s:property value="key"/></td>
		<td><s:property value="value"/></td>
	</tr>
</s:iterator>
</table>
</body>
</html>
