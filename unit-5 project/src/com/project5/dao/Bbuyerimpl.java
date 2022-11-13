package com.project5.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.project5.utility.DButil;

public class Bbuyerimpl implements Bbuyer {
	
	@Override
	public String registerBuyer(String name, String email, int password) {
		String message = "NOT INSERTED.."; 
		// take the DB connection using logic

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

}
