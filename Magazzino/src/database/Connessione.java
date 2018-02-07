package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	
	private final String URL = "jdbc:mysql://localhost:3306/tss_2018";
	private final String USERNAME = "root";
	 private final String PASSWORD = "";
	 Connection connessione = null;
   public void openConnection() {
	   try {
		connessione = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
   }
   public void closeConnection() {
	   try {
		if(connessione!=null) {
			connessione.close();
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
   }
   public Connection returnConnection() {
	   return connessione;
   }
   public static void main(String[] args) {
	Connessione conn = new Connessione();
	conn.openConnection();
	
	
}
}
