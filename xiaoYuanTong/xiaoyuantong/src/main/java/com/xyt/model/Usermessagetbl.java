package com.xyt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Usermessagetbl entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "usermessagetbl", catalog = "xiaoyuantong")
public class Usermessagetbl implements java.io.Serializable {

	// Fields

	private String usermessageid;
	private Usertbl usertbl;
	private Messagetbl messagetbl;

	// Constructors

	/** default constructor */
	public Usermessagetbl() {
	}

	/** minimal constructor */
	public Usermessagetbl(String usermessageid) {
		this.usermessageid = usermessageid;
	}

	/** full constructor */
	public Usermessagetbl(String usermessageid, Usertbl usertbl,
			Messagetbl messagetbl) {
		this.usermessageid = usermessageid;
		this.usertbl = usertbl;
		this.messagetbl = messagetbl;
	}

	// Property accessors
	@Id
	@Column(name = "usermessageid", unique = true, nullable = false, length = 100)
	public String getUsermessageid() {
		return this.usermessageid;
	}

	public void setUsermessageid(String usermessageid) {
		this.usermessageid = usermessageid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid")
	public Usertbl getUsertbl() {
		return this.usertbl;
	}

	public void setUsertbl(Usertbl usertbl) {
		this.usertbl = usertbl;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "messageid")
	public Messagetbl getMessagetbl() {
		return this.messagetbl;
	}

	public void setMessagetbl(Messagetbl messagetbl) {
		this.messagetbl = messagetbl;
	}

}