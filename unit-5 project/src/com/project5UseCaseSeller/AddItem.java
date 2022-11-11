package com.project5UseCaseSeller;

import java.util.Scanner;

import com.project5.bean.Item;
import com.project5.dao.Sellerdao;
import com.project5.dao.Sellerdaoimpl;

public class AddItem {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of item");
		String item_name = sc.next();
		
		System.out.println("Enter the price of item");
		int price = sc.nextInt();
		
		System.out.println("Enter the quantity");
		int qty = sc.nextInt();
		
		Item i1 = new Item();
		Sellerdao s1 = new Sellerdaoimpl();
		String message = s1.addItem(i1);
		
		// print message
		System.out.println(message);

	}

}
