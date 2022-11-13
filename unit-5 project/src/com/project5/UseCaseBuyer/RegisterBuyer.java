package com.project5.UseCaseBuyer;

import java.util.Scanner;

import com.project5.bean.Buyer;
import com.project5.dao.Buyerdao;
import com.project5.dao.Buyerdaoimpl;

public class RegisterBuyer {
	
	public static void main(String[] args) {
		// details from buyer
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter the email id");
		String email = sc.next();
		System.out.println("Enter the password");
		int password = sc.nextInt();
		
		// use Buyerimpl class to send the data received above to database for registration
		
		Buyerdao bi = new Buyerdaoimpl();
		//String result = bi.registerBuyer(name, email, password);
		//System.out.println(result);
		
		
		Buyer b1 = new Buyer();
		b1.setName(name);
		b1.setEmail(email);
		b1.setPassword(password);
		String result = bi.registerBuyer2(b1);
		System.out.println(result);
		

	}

}
