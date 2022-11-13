package com.project5UseCaseSeller;

import java.util.Scanner;

import com.project5.bean.Item;
import com.project5.dao.Sellerdao;
import com.project5.dao.Sellerdaoimpl;

public class ListProducts {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the seller id");
		int seller_id = sc.nextInt();
		System.out.println("Enter the name of Item");
		String item_name = sc.next();
		System.out.println("Enter the category of product");
		String category = sc.next();
		System.out.println("Enter the price of item");
		int price = sc.nextInt();
		System.out.println("Enter the quantity");
		int qty = sc.nextInt();

		// create the object and pass the data
		Item l1 = new Item();
		l1.setSeller_id(seller_id);
		l1.setItem_name(item_name);
		l1.setCategory(category);
		l1.setPrice(price);
		l1.setQty(qty);
		l1.setTotal_price(price * qty);

		Sellerdao s1 = new Sellerdaoimpl();
		String result = s1.listItems(l1);// pass the object
		System.out.println(result);

	}

}
