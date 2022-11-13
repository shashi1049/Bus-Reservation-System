package com.project5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project5.bean.Buyer;
import com.project5.bean.SellerList;
import com.project5.utility.DButil;

public class Admindaoimpl implements Admindao {
	
	@Override
	public List buyerList() {
		List<Buyer> list = new ArrayList<>();

		try (Connection conn = DButil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from buyer;");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				// int serialNo = rs.getInt("serialNo");
				String name = rs.getString("name");
				String email = rs.getString("email");
				int password = rs.getInt("password");

				// Value will come from above create use object and store in the object 				list.add(new Buyer(name, email, password));

			}

		} catch (SQLException e) {
			e.getMessage();
		}

		return list;

	}

	@Override
	public List sellerList() {
		List<SellerList> list = new ArrayList<>();

		try (Connection conn = DButil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from seller");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				//int seller_id = rs.getInt("seller_id");
				String seller_name = rs.getString("seller_name");
				String email = rs.getString("email");
				int password = rs.getInt("password");

				// Value will come from above create use object and store in the object 				list.add(new Buyer(name, email, password));
				list.add(new SellerList(seller_name, email, password));

			}

		} catch (SQLException e) {
			e.getMessage();
		}

		return list;

	}

}
