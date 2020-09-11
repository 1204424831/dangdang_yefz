package com.baizhi.service.impl;

import javax.management.RuntimeErrorException;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.baizhi.dao.AdminDao;
import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import com.baizhi.util.MybatisUtil;

public class AdminServiceImpl implements AdminService{
    //action层做三件事： 1.收参传参      2.调用业务      3.跳转
	//service层负责  业务代码的处理
 	@Override
	public void login(String username, String password) {
		//1.获取AdminDao,session
		AdminDao dao=(AdminDao)MybatisUtil.getMapper(AdminDao.class);
		HttpSession session=ServletActionContext.getRequest().getSession();
		try {
			//2.判断验证码是否输入正确
			//3.判断管理员用户名是否输入正确
			Admin a=dao.login(username);
			if(a==null)throw new RuntimeException("用户名输入错误");
			//4.判断密码是否输入正确
			if(!a.getPassword().equals(password))throw new RuntimeException("密码输入错误");
			//5.往作用域中存储登陆标志
			session.setAttribute("loginAdmin", a);
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e.getMessage());
		}
		MybatisUtil.close();
	}

}
