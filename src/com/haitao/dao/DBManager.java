package com.haitao.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBManager {
	
	public static Connection getconnection(){
		Connection con =null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/haitaowang","root","maihe");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void CloseAll(ResultSet rs,PreparedStatement ps,Connection con ) throws SQLException{
		if(rs!=null){
			rs.close();
		}
		if(ps!= null){
			ps.close();
		}
		if(con!=null){
			con.close();
		}
	}
	

}
