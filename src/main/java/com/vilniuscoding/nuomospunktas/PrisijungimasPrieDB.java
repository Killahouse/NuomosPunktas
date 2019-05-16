package com.vilniuscoding.nuomospunktas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PrisijungimasPrieDB {

	
	static Connection connect() {
		// SQLite connection string
		String url = "jdbc:sqlite:C:/Users/Vytautas/Desktop/Sarasas.db";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
}
