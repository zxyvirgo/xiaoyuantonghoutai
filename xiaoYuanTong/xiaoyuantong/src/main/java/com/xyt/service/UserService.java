package com.xyt.service;

import java.io.Serializable;

import com.xyt.model.Usertbl;
import com.xyt.pageModel.User;

public interface UserService {
	
	public void insertUser(User user);
	
	public Serializable save(Usertbl t);

}
