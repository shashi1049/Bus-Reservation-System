package com.project5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.project5.bean.Item;
import com.project5.bean.Seller;
import com.project5.utility.DButil;

public class Sellerdaoimpl implements Sellerdao {
	
	@Override
	public String registerSeller(Seller s1) {

		String message = "NOT INSERTED..";

		try (Connection conn = DButil.provideConnection()) {
			// prepared statement
			PreparedStatement ps = conn.prepareStatement("insert into seller(seller_name,email,password) values(?,?,?)");
			ps.setString(1, s1.getSeller_name());
			ps.setString(2, s1.getEmail());
			ps.setInt(3, s1.getPassword());

			int x = ps.executeUpdate();

			if (x > 0)
				message = "Seller registered successfull";

		} catch (SQLException e) {
			e.getMessage();
		}

		return message;

	}

	@Override
	public String listItems(Item i1) {
		String message = "Item not found..";
//		logic
		try (Connection conn = DButil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement(
					"insert into items(seller_id,item_name,category,price,qty,total_price) values(?,?,?,?,?,?);");
			ps.setInt(1, i1.getSeller_id());
			ps.setString(2, i1.getItem_name());
			ps.setString(3, i1.getCategory());
			ps.setInt(4, i1.getPrice());
			ps.setInt(5, i1.getQty());
			ps.setInt(6, i1.getTotal_price());

			int x = ps.executeUpdate();

			if (x > 0)
				message = "Item successfully updates";

		} catch (SQLException e) {
			e.getMessage();

		}

		return message;
	}

	@Override
	public String updatelistItems(Item i1, String item_name, int seller_id) {
		String message = "NOT UPDATED..";
//		logic
		try (Connection conn = DButil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement(
					"update items Set item_name = ? ,category = ? , price = ?, qty = ?, total_price = ?  Where item_name = ? AND seller_id=?");
			ps.setString(1, i1.getItem_name());
			ps.setString(2, i1.getCategory());
			ps.setInt(3, i1.getPrice());
			ps.setInt(4, i1.getQty());
			ps.setInt(5, i1.getTotal_price());
			ps.setString(6, item_name);
			ps.setInt(7, seller_id);

			int x = ps.executeUpdate();// Check this

			if (x > 0)
				message = "Item updated successfully";

		} catch (SQLException e) {
			e.getMessage();

		}

		return message;

	}

	@Override
	public String addItem(Item i1) {
		String message = "NOT UPDATED..";
		// logic
		try (Connection conn = DButil.provideConnection()) {

			PreparedStatement ps = conn
					.prepareStatement("insert into items(item_name,price,qty,total_price) values(?,?,?,?)");
			ps.setString(1, i1.getItem_name());
			ps.setInt(2, i1.getPrice());
			ps.setInt(3, i1.getQty());
			ps.setInt(4, i1.getTotal_price());

			int x = ps.executeUpdate();

			if (x > 0)
				message = "item inserted successfully";

		} catch (SQLException e) {
			e.getMessage();
		}

		return message;
	}

	@Override
	public String removeItem(String item_name, int seller_id) {

		String message = "instruction failed";

		try (Connection conn = DButil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("delete from items where item_name = ? AND seller_id = ?");
			ps.setString(1, item_name);
			ps.setInt(2, seller_id);
			
			int x = ps.executeUpdate();
			
			if(x>0)
				message = "Item removed successfully";
					
		} catch (SQLException e) {
			e.getMessage();
		}

		//

		return message;
	}

}
