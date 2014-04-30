package com.xyt.pageModel;

import org.apache.log4j.Logger;

import java.sql.Timestamp;

public class Group {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(Group.class);

	private String groupId;
	private String groupName;
	private Timestamp createTime;
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
	public void print(){
		logger.info(groupName);
	}

}
