package com.xyt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Groupfriendstbl entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "groupfriendstbl", catalog = "xiaoyuantong")
public class Groupfriendstbl implements java.io.Serializable {

	// Fields

	private String groupfriendsid;
	private Grouptbl grouptbl;
	private Usertbl usertbl;

	// Constructors

	/** default constructor */
	public Groupfriendstbl() {
	}

	/** minimal constructor */
	public Groupfriendstbl(String groupfriendsid) {
		this.groupfriendsid = groupfriendsid;
	}

	/** full constructor */
	public Groupfriendstbl(String groupfriendsid, Grouptbl grouptbl,
			Usertbl usertbl) {
		this.groupfriendsid = groupfriendsid;
		this.grouptbl = grouptbl;
		this.usertbl = usertbl;
	}

	// Property accessors
	@Id
	@Column(name = "groupfriendsid", unique = true, nullable = false, length = 10)
	public String getGroupfriendsid() {
		return this.groupfriendsid;
	}

	public void setGroupfriendsid(String groupfriendsid) {
		this.groupfriendsid = groupfriendsid;
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
	@JoinColumn(name = "friendsid")
	public Usertbl getUsertbl() {
		return this.usertbl;
	}

	public void setUsertbl(Usertbl usertbl) {
		this.usertbl = usertbl;
	}

}