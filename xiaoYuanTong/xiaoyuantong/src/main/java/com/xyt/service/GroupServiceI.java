package com.xyt.service;

import java.util.List;

import com.xyt.model.Grouptbl;
import com.xyt.model.Usertbl;
import com.xyt.model.Messagetbl;
import com.xyt.pageModel.Group;
import com.xyt.pageModel.GroupFriends;

public interface GroupServiceI {
	

	public List<Grouptbl> getGroupService(String userid); //根据用户的编号取出用户所拥有的组列表
	
	public List<Group> getGroupService1(String userid); //根据用户的编号取出用户所拥有的组列表
	
	
	public List<Usertbl> getFriendsService(String groupid); //根据组编号取出组对应的联系人列表，里面包含了联系人的消息

	public List<Messagetbl> findMessageService(String userid);//根据编号找到联系人的发过的消息,非话题类消息
	//实际上是查找usermessagetbl里面的对应记录

	//创建组
	public  boolean addGroupSerivce(Group group,String userid);//插入组记录，并且记录下哪个用户创建的组
	
	//给组添加联系人
	public boolean addFriendsSerivce(GroupFriends groupriends);
	
	
	
	public void deleteFriendsService(String groudid, String userid);//删除某个组拥有的好友关系
	//删除groupfriendstbl里面的某个关系录
    
	public boolean deleteGroupService(String groupid,String userid);//删除某个用户所拥有的组

	
	public boolean changeGroupService(String groupid, String userid);//改变用户所属于的组，改变组和好友编号的对应关系，则完成所属组的修改

    
}
