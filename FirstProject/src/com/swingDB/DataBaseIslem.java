package com.swingDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseIslem {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection(ConDB.dbConnection(),ConDB.USERNAME.getValue(), 
					ConDB.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			String sql = "select * from";

			if(!statement.execute(sql));
			System.out.println("gösterildi");
		} catch (SQLException e1) {

			e1.printStackTrace();
		}
	}
}
