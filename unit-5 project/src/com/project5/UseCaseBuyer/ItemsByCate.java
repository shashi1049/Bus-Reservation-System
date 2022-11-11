package com.project5.UseCaseBuyer;

import java.util.List;
import java.util.Scanner;

import com.project5.dao.Buyerdao;
import com.project5.dao.Buyerdaoimpl;

public class ItemsByCate {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the category of your choice. mobile/furniture/home appliance/stationary");
		String category = sc.next();
		
		Buyerdao b1 = new Buyerdaoimpl();
		List list = b1.getitemsByCategory(category);
		list.forEach(i-> System.out.println(i));
	}

}
