package com.project5.bean;

public class Seller {
	
	private int seller_id;
	private String seller_name;
	private String email;
	private int password;

	public int getSeller_id() {
		return seller_id;
	}

	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
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

	@Override
	public String toString() {
		return "Seller [seller_id=" + seller_id + ", seller_name=" + seller_name + ", email=" + email + ", password="
				+ password + "]";
	}

	public Seller(int seller_id, String seller_name, String email, int password) {
		super();
		this.seller_id = seller_id;
		this.seller_name = seller_name;
		this.email = email;
		this.password = password;
	}

	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}

}
