package com.langmore.DAO;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class OracleConnection{
	
		protected Connection conn = null;
		protected PreparedStatement ps = null;
		protected ResultSet rs = null;
		
		public Connection getConnection() {
			
			final Properties prop = new Properties();
			final InputStream inputStream = OracleConnection.class
											.getClassLoader()
											.getResourceAsStream("com/langmore/resources/db.properties");
			
			try {
				prop.load(inputStream);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				Class.forName(prop.getProperty("driver"));
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			try {
				conn = DriverManager.getConnection(prop.getProperty("url"), 
														 prop.getProperty("user"), 
														 prop.getProperty("password"));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return conn;
		}
		
		
		public void closeConn() {
			try {
				if(rs!=null) {
					if(!rs.isClosed()) {
						rs.close();
					}
				}
				if(ps!=null) {
					if(!ps.isClosed()) {
						ps.close();
					}
				}
				if(conn!=null) {
					if(!conn.isClosed()) {
						conn.close();
					}
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
}
