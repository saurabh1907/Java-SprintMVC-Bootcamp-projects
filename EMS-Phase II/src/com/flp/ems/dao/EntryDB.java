package com.flp.ems.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import java.sql.ResultSetMetaData;

public class EntryDB {
public static void main2(String[] args) throws ClassNotFoundException, SQLException, IOException {
	
	Properties props= new Properties();
	FileInputStream fls= new FileInputStream("dbDetails.properties");
	props.load(fls);
	
	//TODO LOAD AND REGISTER 'JDBC DRIVER'
	String driver=props.getProperty("jdbc.driver");
	Class.forName(driver);
	// 	NOT REQUIRED SINCE JDBC 4
	
	//TODO GET DATABASE CONNECTION USING 'JDBC URL'
	String url=props.getProperty("jdbc.url");
	Connection con;
	con= DriverManager.getConnection(url);
	//System.out.println("connection successful?" + con!=null);
	
	Statement statement= con.createStatement();
	String insertQuery=props.getProperty("jdbc.query.insert");
	try{
	int rows = statement.executeUpdate(insertQuery);
	System.out.println(rows);
	
	}finally{
		statement.close();
	}
	
	try(PreparedStatement ps=con.prepareStatement(props.getProperty("jdbc.query.insert2"))){
	ps.setString(1, "ps");
	ps.executeUpdate();
	
		
	}
	try(Statement statement2 =con.createStatement()){
		ResultSet rs=null;
		String selectQuery=props.getProperty("jdbc.query.select");
		rs= statement2.executeQuery(selectQuery);
		ResultSetMetaData rsmd=rs.getMetaData();
		while(rs.next()){
			System.out.println(rs.getString(1));
			
		}
	}
	
	

}
}
