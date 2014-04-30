package com.xyt.service.impl;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyt.dao.BaseDaoI;
import com.xyt.model.Usertbl;
import com.xyt.pageModel.User;
import com.xyt.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	private BaseDaoI<Usertbl> userDao;
	

	public BaseDaoI<Usertbl> getUserDao() {
		return userDao;
	}

	@Autowired
	public void setUserDao(BaseDaoI<Usertbl> userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public Serializable save(Usertbl t){
		return userDao.save(t);
	}

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		Usertbl t = new Usertbl();
	
		BeanUtils.copyProperties(user, t);
		//将user的属性复制到t，但是刨除pass
		userDao.save(t);
		

	}

}
