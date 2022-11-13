package com.project5.bean;

public class ItemsDTO {
	
	private String Item_name;
	private String category;
	private int price;
	private int qty;
	private int total_price;

	private String seller_name;
		public ItemsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
		public ItemsDTO(String item_name, String category, int price, int qty, int total_price, String seller_name) {
		super();
		Item_name = item_name;
		this.category = category;
		this.price = price;
		this.qty = qty;
		this.total_price = total_price;
		this.seller_name = seller_name;
	}
		public String getItem_name() {
		return Item_name;
	}
	public void setItem_name(String item_name) {
		Item_name = item_name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getTotal_price() {
		return total_price;
	}
	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}
	public String getSeller_name() {
		return seller_name;
	}
	public void setSeller_name(String seller_name) {
		this.seller_name = seller_name;
	}
		@Override
	public String toString() {
		return "itemsDTO [Item_name=" + Item_name + ", category=" + category + ", price=" + price + ", qty=" + qty
				+ ", total_price=" + total_price + ", seller_name=" + seller_name + "]";
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}


}
