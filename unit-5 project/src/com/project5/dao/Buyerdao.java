package com.project5.dao;

import java.util.List;

import com.project5.bean.Buyer;

public interface Buyerdao {
	
	public String registerBuyer(String name,String email, int password);
	
	public String registerBuyer2(Buyer buyer );
	public List getitemsByCategory(String category);

}
