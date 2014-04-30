package com.xyt.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;
import com.xyt.model.Messagetbl;
import com.xyt.model.Usertbl;
import com.xyt.pageModel.Message;
import com.xyt.pageModel.User;
import com.xyt.service.TdrServiceI;

/*
 * 交友平台中的同道人
 * 
 */
@ParentPackage("basePackage")
@Namespace("/")
@Action(value = "tdrAction")
public class TdrAction extends BaseAction implements ModelDriven<User>{

	private User user = new User (); //模型驱动

	@Override
	public User getModel() {
		return user;//这句不能少，因为是注入pagemodel的需要
	}

	private TdrServiceI  tdrService;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public TdrServiceI getTdrService() {
		return tdrService;
	}


	@Autowired
	public void setTdrService(TdrServiceI tdrService) {
		this.tdrService = tdrService;
	}


	public void TdrList() {
		
		String tdrid = ServletActionContext.getRequest().getParameter("tdrid");
		Map<String, Object> params = new HashMap<String, Object>();
		
		List<Usertbl> ll =tdrService.getTdrService(tdrid);
		
		//想要返还给前台的列表
		List<User> fi=new ArrayList<User>();
		
		for (int i=0; i<ll.size(); i++){
			
			User finfo = new User();
			
			finfo.setTdrId(ll.get(i).getTdrId());
			finfo.setCollege(ll.get(i).getCollege());
			finfo.setGrade(ll.get(i).getGrade());
			finfo.setName(ll.get(i).getName());
		/*	finfo.setMessageid(ll.get(i).getMessageid());
			finfo.setMassage(ll.get(i).getMassage());
			finfo.setCommittime(ll.get(i).getCommittime());
			finfo.setCreatetime(ll.get(i).getCreatetime());
			finfo.setTopicname(ll.get(i).getTopictbl().getTopicname());
			finfo.setTransmit(ll.get(i).getTransmit());
			*/
			
			//BeanUtils.copyProperties(finfo,ll.get(i));

			fi.add(finfo);
		}
		
		params.put("tdr", fi);
		
		super.writeJson(params);
	
	}//将得到的类转换成json格式，传递给前台
	
	
}
