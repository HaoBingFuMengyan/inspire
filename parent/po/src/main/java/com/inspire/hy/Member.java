package com.inspire.hy;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.collect.Lists;
import com.inspire.hyBase.MemberBase;

@Entity
@Table(name = "hy_member")
public class Member  extends MemberBase {
	private static final long serialVersionUID = -8430032023059484267L;

	private List<User> userList = Lists.newArrayList();
	@OneToMany
	@JoinColumn(name = "smemberid") 
	@JsonIgnore
	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

}
