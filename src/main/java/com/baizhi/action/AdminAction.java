package com.baizhi.action;

import java.awt.image.BufferedImage;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.baizhi.service.AdminService;
import com.baizhi.service.impl.AdminServiceImpl;
import com.baizhi.util.SecurityCode;
import com.baizhi.util.SecurityImage;
import com.opensymphony.xwork2.Action;
//一个模块用一个action
public class AdminAction {
	//使用成员变量进行收参,传参
	private String username;
	private String password;
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//管理员登录
	//改错的思路   1.看异常信息    2.分析这个异常是怎末产生    3.猜测可出现问题的地方进行解决
	//有多个异常信息，只看第一个
    public String login(){
    	//1.获取AdminService
    	AdminService service=new AdminServiceImpl();
    	//2.调用业务
    	try {
    		service.login(username, password);
    		//"success"
    		return Action.SUCCESS;
		} catch (Exception e) {
			//往页面返回异常信息    理解为存到request
			message=e.getMessage();
			//"error"
			return Action.ERROR;
		}
    }
    //获取验证码
    public String getCode(){
    	//1.获取验证码的字符
    	String code=SecurityCode.getSecurityCode();
    	//2.存储验证码
    	HttpSession session=ServletActionContext.getRequest().getSession();
    	session.setAttribute("code", code);
    	//3.绘制验证码图片
    	BufferedImage image=SecurityImage.createImage(code);
    	//4.将图片返回页面
    	try {
    		ImageIO.write(image, "png", ServletActionContext.getResponse().getOutputStream());
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return null;
    }
    //登出
}
