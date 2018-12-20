package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dao.UserListDeleteCompleteDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListDeleteCompleteAction extends ActionSupport implements SessionAware{
public Map<String,Object> session;
private UserListDAO userListDAO=new UserListDAO();
private UserListDeleteCompleteDAO userListDeleteCompleteDAO=new UserListDeleteCompleteDAO();
private List<UserInfoDTO> userList=new ArrayList<UserInfoDTO>();
private String message;

public String execute() throws SQLException{

	userList=userListDAO.getUserListUserInfo();

	int res=userListDeleteCompleteDAO.userListDelete();

	if(res>0){
		userList=null;
		setMessage("利用者情報を正しく削除しました。");
	}else if(res==0){
		setMessage("利用者情報の削除に失敗しました.");
	}

	String result=SUCCESS;
	return result;
}
@Override
public void setSession(Map<String,Object> session){
	this.session=session;
}
public Map<String,Object> getSession(){
	return session;
}
public List<UserInfoDTO> getItemList(){
	return this.userList;
}
public void setUserList(List<UserInfoDTO> userList){
	this.userList=userList;
}
public String getMessage(){
	return this.message;
}
public void setMessage(String message){
	this.message=message;
}

}
