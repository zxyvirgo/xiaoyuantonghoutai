package com.xyt.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;

import com.opensymphony.xwork2.ModelDriven;
import com.xyt.pageModel.Topic;
import com.xyt.service.TopicServiceI;


@ParentPackage("basePackage")
@Namespace("/")
@Action(value = "topicAction")
/*
 * 交友平台中的话题模块
 */
public class TopicAction extends BaseAction implements ModelDriven<Topic>{

	private Topic topic = new Topic (); //模型驱动

	@Override
	public Topic getModel() {
		return topic;//这句不能少，因为是注入pagemodel的需要
	}

	private TopicServiceI topicService;

	public TopicServiceI getTopicService() {
		return topicService;
	}

	public void TopicList(String topicid) {
		super.writeJson(topicService.getTopicService(topicid));
	}//将得到的类转换成json格式，传递给前台

   public void  insertTopic(Topic topic){//创建一个话题
	   
   }
}
