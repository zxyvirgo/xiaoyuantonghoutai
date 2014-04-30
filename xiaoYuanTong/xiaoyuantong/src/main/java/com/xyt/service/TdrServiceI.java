package com.xyt.service;

import java.util.List;

import com.xyt.model.Usertbl;

public interface TdrServiceI {
	public List<Usertbl> getTdrService(String tdrid); //根据同道人的编号（默认写好的1-7）返回同道人列表

}
