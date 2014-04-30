package com.xyt.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Committbl entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "committbl", catalog = "xiaoyuantong")
public class Committbl implements java.io.Serializable {

	// Fields

	private String commitid;
	private Usertbl usertbl;
	private Messagetbl messagetbl;
	private Timestamp createtime;
	private String commit;

	// Constructors

	/** default constructor */
	public Committbl() {
	}

	/** minimal constructor */
	public Committbl(String commitid) {
		this.commitid = commitid;
	}

	/** full constructor */
	public Committbl(String commitid, Usertbl usertbl, Messagetbl messagetbl,
			Timestamp createtime, String commit) {
		this.commitid = commitid;
		this.usertbl = usertbl;
		this.messagetbl = messagetbl;
		this.createtime = createtime;
		this.commit = commit;
	}

	// Property accessors
	@Id
	@Column(name = "commitid", unique = true, nullable = false, length = 100)
	public String getCommitid() {
		return this.commitid;
	}

	public void setCommitid(String commitid) {
		this.commitid = commitid;
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

	@Column(name = "createtime", length = 19)
	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	@Column(name = "commit")
	public String getCommit() {
		return this.commit;
	}

	public void setCommit(String commit) {
		this.commit = commit;
	}

}