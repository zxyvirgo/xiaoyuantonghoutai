package com.xyt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xyt.dao.BaseDaoI;
import com.xyt.model.Messagetbl;
import com.xyt.service.DynamicServiceI;

@Service("dynamicService")
public class DynamicServiceImpl implements DynamicServiceI {
	
	
	private BaseDaoI<Messagetbl> messageDao;
	

	public BaseDaoI<Messagetbl> getMessageDao() {
		return messageDao;
	}

	@Autowired
	public void setMessageDao(BaseDaoI<Messagetbl> messageDao) {
		this.messageDao = messageDao;
	}


	@Transactional
	public List<Messagetbl> getMessageService(String topicid) {
		// TODO Auto-generated method stub
		
		String hql = null;
		
		hql="SELECT messagetbl.* from messagetbl WHERE messagetbl.topicid = "+topicid;
	/*	Map<String, Object> params = new HashMap<String, Object>();
		params.put("groupId", "1");
*/
		//已经测试过，能够查找到数据库中的数据
		List<Messagetbl> gt = (List<Messagetbl>) messageDao.findmessagesql(hql);
		return gt;
	}
	
	@Transactional
	public List<Messagetbl> getUserMessageService(String userid) {
		// TODO Auto-generated method stub
		
		String hql = null;
		
		hql="SELECT messagetbl.* from messagetbl,usermessagetbl WHERE usermessagetbl.messageid = messagetbl.messageid and usermessagetbl.userid ="+userid;
	/*	Map<String, Object> params = new HashMap<String, Object>();
		params.put("groupId", "1");
*/
		//已经测试过，能够查找到数据库中的数据
		List<Messagetbl> gt = (List<Messagetbl>) messageDao.findmessagesql(hql);
		return gt;
	}
	

}
