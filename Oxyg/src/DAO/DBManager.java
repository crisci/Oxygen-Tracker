package DAO;

import java.sql.*;

public class DBManager {

	
	
	
	
	public DBManager() {
		super();
		
		
	}
	
	
	public static DBManager getInstance() {
		if (DBManager.instance == null) {
			instance = new DBManager();
		}
		return instance;
	}
	
	
	public void openConnection() {
		try {
			
			this.conn = DriverManager.getConnection(this.databaseURL, this.username, this.password);
			System.out.println("Database connection enstablished.");
		} catch (SQLException e) {
			System.err.println("Connection error." + e);
			this.conn = null;
		}
	}
	
	public void closeConnection() {
		try {
			conn.close();
			System.out.println("Database connection closed.");
		} catch (SQLException e) {
			System.err.println("Close connection error." + e);
		}
	}
	
	public Connection getConnection () {
		return this.conn;
	}
	
	
    private final String databaseURL = "jdbc:mysql://localhost:3306/oxyg?serverTimezone=Europe/Rome";
    private String username = "root";
    private String password = "root";
    
    private Connection conn = null;
    private static DBManager instance = null;
		
	
}
