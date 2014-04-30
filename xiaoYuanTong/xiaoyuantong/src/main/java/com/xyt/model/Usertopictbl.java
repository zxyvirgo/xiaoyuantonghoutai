package com.xyt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Usertopictbl entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "usertopictbl", catalog = "xiaoyuantong")
public class Usertopictbl implements java.io.Serializable {

	// Fields

	private String usertopicid;
	private Topictbl topictbl;
	private Usertbl usertbl;

	// Constructors

	/** default constructor */
	public Usertopictbl() {
	}

	/** minimal constructor */
	public Usertopictbl(String usertopicid) {
		this.usertopicid = usertopicid;
	}

	/** full constructor */
	public Usertopictbl(String usertopicid, Topictbl topictbl, Usertbl usertbl) {
		this.usertopicid = usertopicid;
		this.topictbl = topictbl;
		this.usertbl = usertbl;
	}

	// Property accessors
	@Id
	@Column(name = "usertopicid", unique = true, nullable = false, length = 100)
	public String getUsertopicid() {
		return this.usertopicid;
	}

	public void setUsertopicid(String usertopicid) {
		this.usertopicid = usertopicid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "topicid")
	public Topictbl getTopictbl() {
		return this.topictbl;
	}

	public void setTopictbl(Topictbl topictbl) {
		this.topictbl = topictbl;
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