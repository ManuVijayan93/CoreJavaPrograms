package com.dao;
import java.sql.*;
public class LoginDAO {
	Connection conn;
	public LoginDAO() throws Exception
	{
		Class.forName("org.h2.Driver");
		Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","user1","");
		
	}
	public ResultSet getCustomerDetail()throws Exception
	{
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from Customer");
		return rs;
		}

}
