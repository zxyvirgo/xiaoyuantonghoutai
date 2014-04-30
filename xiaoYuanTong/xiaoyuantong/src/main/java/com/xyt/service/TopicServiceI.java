package com.xyt.service;

import java.util.List;

import com.xyt.model.Messagetbl;
import com.xyt.model.Topictbl;
import com.xyt.pageModel.Topic;

public interface TopicServiceI {
	
	public List<Topictbl> getTopicService(String userid); 
	//根据用户的编号通过表连接查询找出用户所包含的topicid，然后根据topicid返还用户所拥有的话题列表
	
	public List<Messagetbl> getMessageService(String topicid); //根据话题编号取出组对应的消息列表
	
	public void  insertTopic(Topic topic);//将话题插入数据库



}
