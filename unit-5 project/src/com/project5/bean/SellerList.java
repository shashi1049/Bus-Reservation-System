package com.project5.bean;

public class SellerList {
	
	private String seller_name;
	private String email;
	private int password;

	public SellerList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SellerList(String seller_name, String email, int password) {
		super();
		this.seller_name = seller_name;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "SellerListbean [seller_name=" + seller_name + ", email=" + email + ", password=" + password + "]";
	}

	public String getSeller_name() {
		return seller_name;
	}

	public void setSeller_name(String seller_name) {
		this.seller_name = seller_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

}
