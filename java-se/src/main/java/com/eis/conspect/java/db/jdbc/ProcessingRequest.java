package com.eis.conspect.java.db.jdbc;

import java.sql.*;

public class ProcessingRequest {

	public static void getInfoById(Connection con, String id) throws SQLException {
	    
	    PreparedStatement preStat = con.prepareStatement("SELECT * FROM test_table WHERE id = ?");
	    preStat.setString(1, id);

	    ResultSet resultSet = preStat.executeQuery();

	    while(resultSet.next()) {
	    	System.out.println("id:" + resultSet.getInt("id"));
	    	System.out.println("name: " + resultSet.getString("name"));
	    	System.out.println("surname: " + resultSet.getString("surname"));
	    	System.out.println("phone: " + resultSet.getString(4));
	    	System.out.println("_____________________");  
	    }
	}
}
