package com.project5.dao;

import com.project5.bean.Item;
import com.project5.bean.Seller;

public interface Sellerdao {
	
public String registerSeller(Seller s1 );
	
	public String listItems(Item i1);
	
	public String updatelistItems(Item i1,String item_name,int seller_id);
	
	public String addItem(Item i1);
	
	public String removeItem(String item_name, int seller_id);

}
