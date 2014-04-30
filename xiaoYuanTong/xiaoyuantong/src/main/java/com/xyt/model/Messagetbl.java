package com.xyt.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Messagetbl entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "messagetbl", catalog = "xiaoyuantong")
public class Messagetbl implements java.io.Serializable {

	// Fields

	private String messageid;
	private Topictbl topictbl;
	private String massage;
	private Integer committime;
	private Integer transmit;
	private Timestamp createtime;
	private Set<Committbl> committbls = new HashSet<Committbl>(0);
	private Set<Usermessagetbl> usermessagetbls = new HashSet<Usermessagetbl>(0);

	// Constructors

	/** default constructor */
	public Messagetbl() {
	}

	/** minimal constructor */
	public Messagetbl(String messageid) {
		this.messageid = messageid;
	}

	/** full constructor */
	public Messagetbl(String messageid, Topictbl topictbl, String massage,
			Integer committime, Integer transmit, Timestamp createtime,
			Set<Committbl> committbls, Set<Usermessagetbl> usermessagetbls) {
		this.messageid = messageid;
		this.topictbl = topictbl;
		this.massage = massage;
		this.committime = committime;
		this.transmit = transmit;
		this.createtime = createtime;
		this.committbls = committbls;
		this.usermessagetbls = usermessagetbls;
	}

	// Property accessors
	@Id
	@Column(name = "messageid", unique = true, nullable = false, length = 100)
	public String getMessageid() {
		return this.messageid;
	}

	public void setMessageid(String messageid) {
		this.messageid = messageid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "topicid")
	public Topictbl getTopictbl() {
		return this.topictbl;
	}

	public void setTopictbl(Topictbl topictbl) {
		this.topictbl = topictbl;
	}

	@Column(name = "massage")
	public String getMassage() {
		return this.massage;
	}

	public void setMassage(String massage) {
		this.massage = massage;
	}

	@Column(name = "committime")
	public Integer getCommittime() {
		return this.committime;
	}

	public void setCommittime(Integer committime) {
		this.committime = committime;
	}

	@Column(name = "transmit")
	public Integer getTransmit() {
		return this.transmit;
	}

	public void setTransmit(Integer transmit) {
		this.transmit = transmit;
	}

	@Column(name = "createtime", length = 19)
	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "messagetbl")
	public Set<Committbl> getCommittbls() {
		return this.committbls;
	}

	public void setCommittbls(Set<Committbl> committbls) {
		this.committbls = committbls;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "messagetbl")
	public Set<Usermessagetbl> getUsermessagetbls() {
		return this.usermessagetbls;
	}

	public void setUsermessagetbls(Set<Usermessagetbl> usermessagetbls) {
		this.usermessagetbls = usermessagetbls;
	}

}