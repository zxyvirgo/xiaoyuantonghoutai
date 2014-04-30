package com.xyt.service;

import java.util.List;

import com.xyt.model.Messagetbl;

public interface DynamicServiceI {
	
	public List<Messagetbl> getMessageService(String topicid);
	
	public List<Messagetbl> getUserMessageService(String userid);

}
