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
	<title>使用s:radio生成多个单选框</title>
	<s:head/>
</head>
<body>
<h3>使用s:radio生成多个单选框</h3>
<s:form>
<!-- 使用简单集合来生成多个单选框 -->
<s:radio name="a" label="请选择您喜欢的图书" labelposition="top"
	list="{'疯狂Java讲义','轻量级Java EE企业应用实战',
		'疯狂iOS讲义'}"/>
<!-- 使用简单Map对象来生成多个单选框 -->
<s:radio name="b" label="请选择您想选择出版日期" labelposition="top"
	list="#{'疯狂Java讲义':'2008年9月'
	,'轻量级Java EE企业应用实战':'2008月12月'
	,'疯狂iOS讲义':'2014年1月'}"
	listKey="key"
	listValue="value"/>
<!-- 创建一个JavaBean实例 -->
<s:bean name="org.crazyit.app.service.BookService" var="bs"/>
<!-- 使用集合里放多个JavaBean实例来生成多个单选框 -->
<s:radio name="c" label="请选择您喜欢的图书" labelposition="top"
	list="#bs.books"
	listKey="author"
	listValue="name"/>
</s:form>
</body>
</html>
