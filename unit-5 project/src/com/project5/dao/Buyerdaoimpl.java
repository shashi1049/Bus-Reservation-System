package com.project5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project5.bean.Buyer;
import com.project5.bean.Item;
import com.project5.utility.DButil;

public class Buyerdaoimpl implements Buyerdao{
	
	@Override
	public String registerBuyer(String name, String email, int password) {
		String message = "NOT INSERTED.."; 
		// take the DB connection using pre-written logic

		try (Connection conn = DButil.provideConnection()) {
			// prepared statement
			PreparedStatement ps = conn.prepareStatement("insert into buyer(name,email,password) values(?,?,?)");

			ps.setString(1, name);
			ps.setString(2, email);
			ps.setInt(3, password);

			int x = ps.executeUpdate();

			if (x > 0)
				message = "Buyer registered successfull";

		} catch (SQLException e) {
			e.getMessage();
		}

		return message;
	}

	@Override
	public String registerBuyer2(Buyer buyer) {

		String message = "NOT INSERTED.."; // initial value because of return type
		// take the DB connection using pre-written logic

		try (Connection conn = DButil.provideConnection()) {
			// prepared statement
			PreparedStatement ps = conn.prepareStatement("insert into buyer(name,email,password) values(?,?,?)");

			ps.setString(1, buyer.getName());
			ps.setString(2, buyer.getEmail());
			ps.setInt(3, buyer.getPassword());

			int x = ps.executeUpdate();

			if (x > 0)
				message = "Buyer registered successfull";

		} catch (SQLException e) {
			e.getMessage();
		}

		return message;

	}

	@Override
	public List getitemsByCategory(String category) {
		List<Item> list = new ArrayList<>();

		try (Connection conn = DButil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("select * from items where category = ?");

			ps.setString(1, category);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int serialNo = rs.getInt("serialNo");
				int seller_id = rs.getInt("seller_id");
				String item_name = rs.getString("item_name");
				String cate = rs.getString("category");
				int price = rs.getInt("price");
				int qty = rs.getInt("qty");
				int total_price = rs.getInt("total_price");

				list.add(new Item(serialNo, seller_id, item_name, cate, price, qty, total_price));

			}

		} catch (SQLException e) {
			e.getMessage();
		}

		return list;

	}

}
