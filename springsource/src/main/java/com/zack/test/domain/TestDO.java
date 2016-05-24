package com.zack.test.domain;

import java.io.Serializable;
import java.util.Date;

public class TestDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 989789858322996616L;

	private Long id;
	
	private String userName;
	
	private Date gmtCreate;
	
	private Date gmtUpdate;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtUpdate() {
		return gmtUpdate;
	}

	public void setGmtUpdate(Date gmtUpdate) {
		this.gmtUpdate = gmtUpdate;
	}

}
