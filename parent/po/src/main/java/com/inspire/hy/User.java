package com.inspire.hy;

import com.inspire.hyBase.UserBase;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "hy_user")
public class User  extends UserBase {
	
	private static final long serialVersionUID = 8139071855373410874L;

//	private List<Actor> actorList;
//
//	// 多对多定义
//	@ManyToMany(fetch=FetchType.LAZY,cascade={CascadeType.REFRESH})
//	// 中间表定义,表名采用默认命名规则
//	@JoinTable(name = "hy_useractor", joinColumns = {@JoinColumn(name = hy_useractor.suserid) }, inverseJoinColumns = { @JoinColumn(name = hy_useractor.sroleid)})
//	@JsonIgnore
//	public List<Actor> getActorList() {
//		return actorList;
//	}
//
//	public void setActorList(List<Actor> actorList) {
//		this.actorList = actorList;
//	}

	private String[] sroleids;
	@Transient
	public String[] getSroleids() {
		return sroleids;
	}
	public void setSroleids(String[] sroleids) {
		this.sroleids = sroleids;
	}
	private String[] role;
	@Transient
	public String[] getRole() {
		return role;
	}

	public void setRole(String[] role) {
		this.role = role;
	}

}
