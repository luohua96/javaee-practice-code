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
	<title>使用s:token防止重复提交</title>
</head>
<body>
<h3>使用s:token防止重复提交</h3>
<s:form action="pro">
	<!-- 普通表单域 -->
	<s:textfield name="book" label="书名"/>
	<!-- 用于防刷新的token -->
	<s:token/>
	<s:submit value="提交"/>
</s:form>
</body>
</html>
