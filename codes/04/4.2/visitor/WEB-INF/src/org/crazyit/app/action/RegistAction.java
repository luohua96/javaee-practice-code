package org.crazyit.app.action;

import com.opensymphony.xwork2.ActionSupport;

import org.crazyit.app.domain.*;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2018, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class RegistAction extends ActionSupport
{
	// 定义User类型的成员变量用于封装请求参数
	private User user;

	// user的setter和getter方法
	public void setUser(User user)
	{
		this.user = user;
	}
	public User getUser()
	{
		return (this.user);
	}
}