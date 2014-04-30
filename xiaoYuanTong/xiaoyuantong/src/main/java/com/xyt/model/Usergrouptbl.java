package com.xyt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Usergrouptbl entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "usergrouptbl", catalog = "xiaoyuantong")
public class Usergrouptbl implements java.io.Serializable {

	// Fields

	private String usergroupid;
	private Grouptbl grouptbl;
	private Usertbl usertbl;

	// Constructors

	/** default constructor */
	public Usergrouptbl() {
	}

	/** minimal constructor */
	public Usergrouptbl(String usergroupid) {
		this.usergroupid = usergroupid;
	}

	/** full constructor */
	public Usergrouptbl(String usergroupid, Grouptbl grouptbl, Usertbl usertbl) {
		this.usergroupid = usergroupid;
		this.grouptbl = grouptbl;
		this.usertbl = usertbl;
	}

	// Property accessors
	@Id
	@Column(name = "usergroupid", unique = true, nullable = false, length = 100)
	public String getUsergroupid() {
		return this.usergroupid;
	}

	public void setUsergroupid(String usergroupid) {
		this.usergroupid = usergroupid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "groupid")
	public Grouptbl getGrouptbl() {
		return this.grouptbl;
	}

	public void setGrouptbl(Grouptbl grouptbl) {
		this.grouptbl = grouptbl;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid")
	public Usertbl getUsertbl() {
		return this.usertbl;
	}

	public void setUsertbl(Usertbl usertbl) {
		this.usertbl = usertbl;
	}

}