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
 * Lostandfindtbl entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "lostandfindtbl", catalog = "xiaoyuantong")
public class Lostandfindtbl implements java.io.Serializable {

	// Fields

	private String loastandfindId;
	private Usertbl usertbl;
	private String flag;
	private String state;
	private String category;
	private String content;
	private Timestamp createTime;

	// Constructors

	/** default constructor */
	public Lostandfindtbl() {
	}

	/** minimal constructor */
	public Lostandfindtbl(String loastandfindId) {
		this.loastandfindId = loastandfindId;
	}

	/** full constructor */
	public Lostandfindtbl(String loastandfindId, Usertbl usertbl, String flag,
			String state, String category, String content, Timestamp createTime) {
		this.loastandfindId = loastandfindId;
		this.usertbl = usertbl;
		this.flag = flag;
		this.state = state;
		this.category = category;
		this.content = content;
		this.createTime = createTime;
	}

	// Property accessors
	@Id
	@Column(name = "loastandfindId", unique = true, nullable = false, length = 100)
	public String getLoastandfindId() {
		return this.loastandfindId;
	}

	public void setLoastandfindId(String loastandfindId) {
		this.loastandfindId = loastandfindId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	public Usertbl getUsertbl() {
		return this.usertbl;
	}

	public void setUsertbl(Usertbl usertbl) {
		this.usertbl = usertbl;
	}

	@Column(name = "flag", length = 4)
	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Column(name = "state", length = 4)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "category", length = 30)
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "content", length = 100)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "createTime", length = 19)
	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

}