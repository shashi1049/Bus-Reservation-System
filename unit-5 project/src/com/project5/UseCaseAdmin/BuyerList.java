package com.project5.UseCaseAdmin;

import java.util.List;

import com.project5.dao.Admindaoimpl;

public class BuyerList {
	
	public static void main(String[] args) {
		// we can get the list of all the buyers in one click
		
		Admindaoimpl a1 = new Admindaoimpl();
		List list = a1.buyerList();// call the method and it will return an object

		if (list.size() != 0) {
			// iterate the list
			list.forEach(l -> System.out.println(l));

		} else {

			System.out.println("No buyer exists");
		}

	}


}
