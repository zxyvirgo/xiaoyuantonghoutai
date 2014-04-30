package com.xyt.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletInputStream;

import org.apache.log4j.Logger;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.xyt.pageModel.Json;
import com.xyt.pageModel.User;
import com.xyt.service.UserService;

@ParentPackage("basePackage")
@Namespace("/")
@Action(value = "userAction")
/*
 * 登陆注册模块
 */
public class UserAction extends BaseAction implements ModelDriven<User>{
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(UserAction.class);

	/**
	 * Logger for this class
	 */
	private User user = new User();
	
	
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	


	//private static final Logger logger = Logger.getLogger(UserAction.class);	
	private UserService userService;
	
	private UserService getUserService(){
		return userService;
	}

	@Autowired
	public void setUserService(UserService userService){
		this.userService = userService;
	}
	
	//用户注册
	public void reg(){
		logger.info("测试测试");
	///String name = ServletActionContext.getRequest().getParameter("name");
//	String pwd = ServletActionContext.getRequest().getParameter("pwd");
	//Map<String, Object> m = new HashMap<String, Object>();
		
/*	try {

            ServletActionContext.getRequest().setCharacterEncoding("utf-8");
			ServletInputStream json = ServletActionContext.getRequest().getInputStream();
			
			BufferedReader stdin = new BufferedReader(new InputStreamReader(json));
			String s;
			while((s = stdin.readLine())!=null && s.length()!=0)
			
			logger.info(s);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
	//logger.info(name);
		try {
		//	ServletInputStream json = ServletActionContext.getRequest().getInputStream();
			BufferedReader stdin=ServletActionContext.getRequest().getReader();
			String s;
			while((s = stdin.readLine())!=null && s.length()!=0)
			
			logger.info(s);
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
	Json j= new Json();
	try{

	//	userService.insertUser(user);
		
		logger.info(user.getName());
		j.setSuccess("true");
		j.setMsg("注册成功！");
		
		//用户注册成功，则进入主界面

	}catch(Exception e){
		e.printStackTrace();
		j.setMsg(e.getMessage());

	}
	super.writeJson(j);

	}
	
	public void register(){
		logger.info("测试测试");
//	String name = ServletActionContext.getRequest().getParameter("pwd");
//	String pwd = ServletActionContext.getRequest().getParameter("pwd");
	//Map<String, Object> m = new HashMap<String, Object>();
		logger.info(user.getName());
		
	 Json j= new Json();
	try{

	//	userService.insertUser(user);
		j.setSuccess("true");
		j.setMsg("注册成功！");
		
		//用户注册成功，则进入主界面

	}catch(Exception e){
		e.printStackTrace();
		j.setMsg(e.getMessage());

	}
	super.writeJson(j);

	}

	

}
