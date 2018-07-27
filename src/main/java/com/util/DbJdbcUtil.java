package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbJdbcUtil {
	private static Connection con = null;

	private DbJdbcUtil() {

	}

	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shekar", "root", "Password");
		if (con == null) {
			return con;
		}
		return con;

	}

}
