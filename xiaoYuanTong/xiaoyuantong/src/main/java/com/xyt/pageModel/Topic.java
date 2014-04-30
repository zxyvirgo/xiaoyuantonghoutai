package com.xyt.pageModel;

import java.sql.Timestamp;

public class Topic {
	private String topicid;
	private String topicname;
	private Integer massgenumber;
	private Timestamp createTime;
	public String getTopicid() {
		return topicid;
	}
	public void setTopicid(String topicid) {
		this.topicid = topicid;
	}
	public String getTopicname() {
		return topicname;
	}
	public void setTopicname(String topicname) {
		this.topicname = topicname;
	}
	public Integer getMassgenumber() {
		return massgenumber;
	}
	public void setMassgenumber(Integer massgenumber) {
		this.massgenumber = massgenumber;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
	

}
