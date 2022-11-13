package com.project5.bean;

public class Buyer {
	
	private String name;
	private String email;
	private int password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "buyerdetails [name=" + name + ", email=" + email + ", password=" + password + "]";
	}

	public Buyer(String name, String email, int password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public Buyer() {
		super();

	}

	public static void main(String[] args) {

	}

}
