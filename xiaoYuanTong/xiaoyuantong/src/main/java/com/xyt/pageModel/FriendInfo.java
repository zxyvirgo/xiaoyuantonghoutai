package com.xyt.pageModel;

import java.util.ArrayList;
import java.util.List;

public class FriendInfo{
    private String groupId;
    private String groupName;
    private List<String> grouplist = new ArrayList<String>();
    @Override
    public String toString() {
	return "FriendInfo [groupId=" + groupId + ", groupName=" + groupName + ", groupList="
		+ grouplist + "]";
    }
    public String getGroupId() {
        return groupId;
    }
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public List getGrouplist() {
        return grouplist;
    }
    public void setGrouplist(List grouplist) {
        this.grouplist = grouplist;
    }
}