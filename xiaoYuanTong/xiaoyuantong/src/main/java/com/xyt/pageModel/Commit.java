package com.xyt.pageModel;

import java.sql.Timestamp;

import com.xyt.model.Messagetbl;
import com.xyt.model.Usertbl;

public class Commit {
	
	private String commitid;
	private Usertbl usertbl;
	private Messagetbl messagetbl;
	private Timestamp createtime;
	private String commit;
	public String getCommitid() {
		return commitid;
	}
	public void setCommitid(String commitid) {
		this.commitid = commitid;
	}
	public Usertbl getUsertbl() {
		return usertbl;
	}
	public void setUsertbl(Usertbl usertbl) {
		this.usertbl = usertbl;
	}
	public Messagetbl getMessagetbl() {
		return messagetbl;
	}
	public void setMessagetbl(Messagetbl messagetbl) {
		this.messagetbl = messagetbl;
	}
	public Timestamp getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}
	public String getCommit() {
		return commit;
	}
	public void setCommit(String commit) {
		this.commit = commit;
	}

	

}
