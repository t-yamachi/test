package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport implements SessionAware {
	public Map<String,Object> session;
	private ItemListDAO itemListDAO=new ItemListDAO();
    private List<ItemInfoDTO> itemList=new ArrayList<ItemInfoDTO>();


	public String execute() throws SQLException{
		itemList=itemListDAO.getItemListItemInfo();
		String result = SUCCESS;
		return result;
		}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
	public List<ItemInfoDTO> getItemList(){
		return this.itemList;

	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setItemList(List<ItemInfoDTO> itemList) {
		this.itemList = itemList;
	}


}
