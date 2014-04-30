package com.xyt.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ModelDriven;

import com.xyt.model.Lostandfindtbl;
import com.xyt.model.Messagetbl;
import com.xyt.pageModel.Commit;
import com.xyt.pageModel.FindAndLost;
import com.xyt.pageModel.Message;
import com.xyt.service.DynamicServiceI;
import com.xyt.service.MessageServiceI;

/*
 * 交友平台中的动态模块
 */

@ParentPackage("basePackage")
@Namespace("/")
@Action(value = "dynamicAction")
public class DynamicAction extends BaseAction implements ModelDriven<Message>{

	private Message message = new Message (); //模型驱动

//	@Override
	
	public Message getModel() {
		return message;
	}

	private DynamicServiceI dynamicService;

	
	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public DynamicServiceI getDynamicService() {
		return dynamicService;
	}

	@Autowired
	public void setDynamicService(DynamicServiceI dynamicService) {
		this.dynamicService = dynamicService;
	}

	//显示所有的话题消息
	public void messageList() {
		
	//	String topicid = ServletActionContext.getRequest().getParameter("topicid");
		
		Map<String, Object> params = new HashMap<String, Object>();
		
		List<Messagetbl> ll =dynamicService.getMessageService("1");
		
		//想要返还给前台的列表
		List<Message> fi=new ArrayList<Message>();
		
		for (int i=0; i<ll.size(); i++){
			
			Message finfo = new Message();
			
			finfo.setMessageid(ll.get(i).getMessageid());
			finfo.setMassage(ll.get(i).getMassage());
			finfo.setCommittime(ll.get(i).getCommittime());
			finfo.setCreatetime(ll.get(i).getCreatetime());
			finfo.setTopicname(ll.get(i).getTopictbl().getTopicname());
			finfo.setTransmit(ll.get(i).getTransmit());
			
			
			//BeanUtils.copyProperties(ll.get(i), finfo);

			fi.add(finfo);
		}
		
		params.put("dynamic", fi);
		
		super.writeJson(params);
		
	}//将得到的类转换成json格式，传递给前台
	
	public void insertmessage(){
		
	}
	    
	
	
	public void insertCommit(Commit  commit){   //针对某个消息进行评论
	}
	
	
	public void getCommit(String messageid){   //找到针对某个消息的全部评论 
	
	}
	
	public void getTransmit(){   //获取转发的信息
	
	}
	
	
	}
	
