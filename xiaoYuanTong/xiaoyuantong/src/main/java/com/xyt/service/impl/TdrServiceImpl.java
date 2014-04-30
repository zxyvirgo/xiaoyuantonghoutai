package com.xyt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xyt.dao.BaseDaoI;
import com.xyt.model.Usertbl;
import com.xyt.service.TdrServiceI;

@Service("tdrService")
public class TdrServiceImpl implements TdrServiceI {

	private BaseDaoI<Usertbl> userDao;
	

	public BaseDaoI<Usertbl> getUserDao() {
		return userDao;
	}

	@Autowired
	public void setUserDao(BaseDaoI<Usertbl> userDao) {
		this.userDao = userDao;
	}


	
	@Transactional
	public List<Usertbl> getTdrService(String tdrid) {
		// TODO Auto-generated method stub
		String hql = null;
		hql="select usertbl.* from usertbl	where usertbl.tdrId = "+tdrid;
		List<Usertbl> gt = (List<Usertbl>) userDao.findfriendsql(hql);	
		return gt;
	}

}
