package com.internousdev.ecsite.dto;

public class UserInfoDTO {
	public String loginPass;

	public String userName;

	public String id;

	public String loginId;

	public String insert_date;


	public String getLoginPass(){
		return loginPass;
	}

	public void setLoginPass(String loginPass){
		this.loginPass=loginPass;
	}

	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName=userName;
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id=id;
	}

	public String getLoginId(){
		return loginId;
	}

	public void setLoginId(String loginId){
		this.loginId=loginId;
	}

	public String getInsert_date(){
		return insert_date;
	}

	public void setInsert_date(String insert_date){
		this.insert_date=insert_date;
	}


	}

