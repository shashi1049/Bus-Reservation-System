package com.project5.UseCaseAdmin;

import java.util.Iterator;
import java.util.List;

import com.project5.dao.Admindaoimpl;

public class SellerLists {
	
	public static void main(String[] args) {
		
		Admindaoimpl a1 = new Admindaoimpl();
		List list = a1.sellerList();// call the method and it will return an object

		if (list.size() != 0) {

			Iterator<SellerLists> itr = list.iterator();// creation of iterator

			while (itr.hasNext()) {
				SellerLists b1 = itr.next();
				System.out.println(b1);
			}

		} else {
			System.out.println("No seller exists");
		}

	}

}
