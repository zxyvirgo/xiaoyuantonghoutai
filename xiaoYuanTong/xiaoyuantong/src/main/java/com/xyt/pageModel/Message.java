package com.xyt.pageModel;

import java.sql.Timestamp;

import com.xyt.model.Topictbl;

public class Message {
	
	private String messageid;
	private String topicname;
	private String massage;
	private Integer committime;
	private Integer transmit;
	private Timestamp createtime;
	public String getMessageid() {
		return messageid;
	}
	public void setMessageid(String messageid) {
		this.messageid = messageid;
	}
	
	
	public String getTopicname() {
		return topicname;
	}
	public void setTopicname(String topicname) {
		this.topicname = topicname;
	}
	public String getMassage() {
		return massage;
	}
	public void setMassage(String massage) {
		this.massage = massage;
	}
	public Integer getCommittime() {
		return committime;
	}
	public void setCommittime(Integer committime) {
		this.committime = committime;
	}
	public Integer getTransmit() {
		return transmit;
	}
	public void setTransmit(Integer transmit) {
		this.transmit = transmit;
	}
	public Timestamp getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}
	
	

}
