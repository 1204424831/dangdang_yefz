package com.baizhi.test;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.w3c.dom.UserDataHandler;

import javassist.expr.NewArray;

import com.baizhi.dao.AdminDao;
import com.baizhi.entity.Admin;
import com.baizhi.util.MD5Utils;
import com.baizhi.util.MybatisUtil;

public class AdminTest {
    public static void main(String[] args) {
	   HttpSession session=ServletActionContext.getRequest().getSession();
    	String password="123456";
    	
    }
}
