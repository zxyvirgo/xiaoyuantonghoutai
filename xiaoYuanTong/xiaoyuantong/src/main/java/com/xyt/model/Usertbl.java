package com.xyt.model;

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
 * Usertbl entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "usertbl", catalog = "xiaoyuantong")
public class Usertbl implements java.io.Serializable {

	// Fields

	private String userId;
	private String tdrId;
	private String face;
	private String name;
	private String sex;
	private String college;
	private String major;
	private String grade;
	private String mail;
	private String tel;
	private String qq;
	private String hometown;
	private Set<Usergrouptbl> usergrouptbls = new HashSet<Usergrouptbl>(0);
	private Set<Committbl> committbls = new HashSet<Committbl>(0);
	private Set<Usermessagetbl> usermessagetbls = new HashSet<Usermessagetbl>(0);
	private Set<Lostandfindtbl> lostandfindtbls = new HashSet<Lostandfindtbl>(0);
	private Set<Groupfriendstbl> groupfriendstbls = new HashSet<Groupfriendstbl>(
			0);
	private Set<Usertopictbl> usertopictbls = new HashSet<Usertopictbl>(0);

	// Constructors

	/** default constructor */
	public Usertbl() {
	}

	/** minimal constructor */
	public Usertbl(String userId) {
		this.userId = userId;
	}

	/** full constructor */
	public Usertbl(String userId, String tdrId, String face, String name,
			String sex, String college, String major, String grade,
			String mail, String tel, String qq, String hometown,
			Set<Usergrouptbl> usergrouptbls, Set<Committbl> committbls,
			Set<Usermessagetbl> usermessagetbls,
			Set<Lostandfindtbl> lostandfindtbls,
			Set<Groupfriendstbl> groupfriendstbls,
			Set<Usertopictbl> usertopictbls) {
		this.userId = userId;
		this.tdrId = tdrId;
		this.face = face;
		this.name = name;
		this.sex = sex;
		this.college = college;
		this.major = major;
		this.grade = grade;
		this.mail = mail;
		this.tel = tel;
		this.qq = qq;
		this.hometown = hometown;
		this.usergrouptbls = usergrouptbls;
		this.committbls = committbls;
		this.usermessagetbls = usermessagetbls;
		this.lostandfindtbls = lostandfindtbls;
		this.groupfriendstbls = groupfriendstbls;
		this.usertopictbls = usertopictbls;
	}

	// Property accessors
	@Id
	@Column(name = "userId", unique = true, nullable = false, length = 100)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "tdrId", length = 10)
	public String getTdrId() {
		return this.tdrId;
	}

	public void setTdrId(String tdrId) {
		this.tdrId = tdrId;
	}

	@Column(name = "face", length = 10)
	public String getFace() {
		return this.face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	@Column(name = "name", length = 10)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "sex", length = 10)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(name = "college", length = 10)
	public String getCollege() {
		return this.college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Column(name = "major", length = 10)
	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Column(name = "grade", length = 10)
	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Column(name = "mail", length = 10)
	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Column(name = "tel", length = 10)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "qq", length = 10)
	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	@Column(name = "hometown", length = 10)
	public String getHometown() {
		return this.hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "usertbl")
	public Set<Usergrouptbl> getUsergrouptbls() {
		return this.usergrouptbls;
	}

	public void setUsergrouptbls(Set<Usergrouptbl> usergrouptbls) {
		this.usergrouptbls = usergrouptbls;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "usertbl")
	public Set<Committbl> getCommittbls() {
		return this.committbls;
	}

	public void setCommittbls(Set<Committbl> committbls) {
		this.committbls = committbls;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "usertbl")
	public Set<Usermessagetbl> getUsermessagetbls() {
		return this.usermessagetbls;
	}

	public void setUsermessagetbls(Set<Usermessagetbl> usermessagetbls) {
		this.usermessagetbls = usermessagetbls;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "usertbl")
	public Set<Lostandfindtbl> getLostandfindtbls() {
		return this.lostandfindtbls;
	}

	public void setLostandfindtbls(Set<Lostandfindtbl> lostandfindtbls) {
		this.lostandfindtbls = lostandfindtbls;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "usertbl")
	public Set<Groupfriendstbl> getGroupfriendstbls() {
		return this.groupfriendstbls;
	}

	public void setGroupfriendstbls(Set<Groupfriendstbl> groupfriendstbls) {
		this.groupfriendstbls = groupfriendstbls;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "usertbl")
	public Set<Usertopictbl> getUsertopictbls() {
		return this.usertopictbls;
	}

	public void setUsertopictbls(Set<Usertopictbl> usertopictbls) {
		this.usertopictbls = usertopictbls;
	}

}