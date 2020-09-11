package com.baizhi.interceptor;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.w3c.dom.UserDataHandler;

import com.baizhi.entity.User;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TestInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		//前台拦截器    拦截当前用户是否登录   拦截前台用户是否激活
		HttpSession session=ServletActionContext.getRequest().getSession();
		User user=(User)session.getAttribute("loginUser");
		//测试 
		//user=new User();
		//user.setCode("1231412341");
		if(user==null){
			return "login";
		}else{
			if(user.getCode()==null||"".equals(user.getCode())){
				return "active";
			}else{
				arg0.invoke();
			}
		}
		return null;
	}

}
