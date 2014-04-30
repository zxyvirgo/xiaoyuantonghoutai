package com.xyt.service.impl;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xyt.dao.BaseDaoI;
import com.xyt.model.Grouptbl;
import com.xyt.model.Messagetbl;
import com.xyt.model.Usertbl;
import com.xyt.pageModel.Group;
import com.xyt.pageModel.GroupFriends;
import com.xyt.service.GroupServiceI;

@Service("groupService")
public class GroupServiceImpl implements GroupServiceI {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger
			.getLogger(GroupServiceImpl.class);

	private BaseDaoI<Grouptbl> groupDao;
	

	public BaseDaoI<Grouptbl> getGroupDao() {
		return groupDao;
	}

	//要加上注入标记
	@Autowired
	public void setGroupDao(BaseDaoI<Grouptbl> groupDao) {
		this.groupDao = groupDao;
	}
	
	

	@Transactional
	public List<Grouptbl> getGroupService(String userid) {
		// TODO Auto-generated method stub
	/*List<Group> gl  = new ArrayList<Group>();
		
		Group gt = new Group();
		gt.setGroupId("7");
		gt.setGroupName("test");
	//	gt.setCreateTime(201404-0611:24:32);
	//	gl.add(new Group("7","test",2014-04-06 11:24:32));
		gl.add(gt);*/
		String hql = null;
		hql="SELECT grouptbl.* FROM grouptbl,usergrouptbl WHERE usergrouptbl.groupid = grouptbl.groupId and usergrouptbl.userid = "+userid;
	/*	Map<String, Object> params = new HashMap<String, Object>();
		params.put("groupId", "1");
*/
		//已经测试过，能够查找到数据库中的数据
		List<Grouptbl> gt = (List<Grouptbl>) groupDao.findsql(hql);
		//groupDao.toString();
		//List<Grouptbl> gt = (List<Grouptbl>) groupDao.get("from Grouptbl t");
	
		return gt;
	}

	@Transactional
	public List<Usertbl> getFriendsService(String groupid) {
		// TODO Auto-generated method stub
		String hql = null;
		hql="select usertbl.* from usertbl,groupfriendstbl WHERE groupfriendstbl.friendsid = usertbl.userId and groupfriendstbl.groupid="+groupid;
		List<Usertbl> gt = (List<Usertbl>) groupDao.findfriendsql(hql);
		
		return gt;
	}

	@Override
	public List<Messagetbl> findMessageService(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addGroupSerivce(Group group, String userid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addFriendsSerivce(GroupFriends groupriends) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteFriendsService(String groudid, String userid) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean deleteGroupService(String groupid, String userid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changeGroupService(String groupid, String userid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public List<Group> getGroupService1(String userid) {
		// TODO Auto-generated method stub
	
		List<Group> gl  = new ArrayList<Group>();
		
		Group gt = new Group();
		gt.setGroupId("7");
		gt.setGroupName("test");
	//	gt.setCreateTime(201404-0611:24:32);
	//	gl.add(new Group("7","test",2014-04-06 11:24:32));
		gl.add(gt);
		String hql = null;
	/*	hql="SELECT groupName FROM grouptbl,usergrouptbl WHERE usergrouptbl.groupid = grouptbl.groupId"+
				"and usergrouptbl.userid = '1'";*/
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("groupId", "1");

		//groupDao.toString();
		Grouptbl t = groupDao.get("from Grouptbl t where t.groupId = :groupId", params);
	
	//	Map<String, Object> params = new HashMap<String, Object>();
	//	List<Grouptbl> t =groupDao.findsql(hql);
	//	List<Grouptbl> l = groupDao.find(hql,params);
		//t.print();
		logger.info(t.getGroupName());
	/*	
		if (l != null && l.size() > 0) {
			for (Grouptbl t : l) {
				Group m = new Group();
				BeanUtils.copyProperties(t, m);
			//	Set<Grouptbl> set = t.getTmenus();
				
				gl.add(m);
			}
		}*/
		
		return gl;
	}

}
