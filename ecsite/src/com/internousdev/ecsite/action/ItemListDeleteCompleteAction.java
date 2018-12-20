package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dao.ItemListDeleteCompleteDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListDeleteCompleteAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;
	private ItemListDAO itemListDAO=new ItemListDAO();
	private ItemListDeleteCompleteDAO itemListDeleteCompleteDAO=new  ItemListDeleteCompleteDAO();
	private List<ItemInfoDTO> itemList=new ArrayList<ItemInfoDTO>();
	private String message;

	public String execute() throws SQLException{

	    itemList=itemListDAO.getItemListItemInfo();

		int res=itemListDeleteCompleteDAO.itemListDelete();

		if(res>0){
			itemList=null;
			setMessage("商品情報を正しく削除しました。");
		}else if(res==0){
			setMessage("商品情報の削除に失敗しました。");
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
	public List<ItemInfoDTO> getItemList(){
		return this.itemList;
	}
	public void setItemList(List<ItemInfoDTO> itemList){
		this.itemList=itemList;
	}
	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message=message;
	}

}
