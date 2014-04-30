package com.xyt.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Topictbl entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "topictbl", catalog = "xiaoyuantong")
public class Topictbl implements java.io.Serializable {

	// Fields

	private String topicid;
	private String topicname;
	private Integer massgenumber;
	private Timestamp createTime;
	private Set<Messagetbl> messagetbls = new HashSet<Messagetbl>(0);
	private Set<Usertopictbl> usertopictbls = new HashSet<Usertopictbl>(0);

	// Constructors

	/** default constructor */
	public Topictbl() {
	}

	/** minimal constructor */
	public Topictbl(String topicid) {
		this.topicid = topicid;
	}

	/** full constructor */
	public Topictbl(String topicid, String topicname, Integer massgenumber,
			Timestamp createTime, Set<Messagetbl> messagetbls,
			Set<Usertopictbl> usertopictbls) {
		this.topicid = topicid;
		this.topicname = topicname;
		this.massgenumber = massgenumber;
		this.createTime = createTime;
		this.messagetbls = messagetbls;
		this.usertopictbls = usertopictbls;
	}

	// Property accessors
	@Id
	@Column(name = "topicid", unique = true, nullable = false, length = 100)
	public String getTopicid() {
		return this.topicid;
	}

	public void setTopicid(String topicid) {
		this.topicid = topicid;
	}

	@Column(name = "topicname", length = 30)
	public String getTopicname() {
		return this.topicname;
	}

	public void setTopicname(String topicname) {
		this.topicname = topicname;
	}

	@Column(name = "massgenumber")
	public Integer getMassgenumber() {
		return this.massgenumber;
	}

	public void setMassgenumber(Integer massgenumber) {
		this.massgenumber = massgenumber;
	}

	@Column(name = "createTime", length = 19)
	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "topictbl")
	public Set<Messagetbl> getMessagetbls() {
		return this.messagetbls;
	}

	public void setMessagetbls(Set<Messagetbl> messagetbls) {
		this.messagetbls = messagetbls;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "topictbl")
	public Set<Usertopictbl> getUsertopictbls() {
		return this.usertopictbls;
	}

	public void setUsertopictbls(Set<Usertopictbl> usertopictbls) {
		this.usertopictbls = usertopictbls;
	}

}