package com.showcolumn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
public class ShowColumnName {

	public static void main(String[] args) 
	{
	
		try
		{
			Class.forName("org.h2.Driver");
			Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/MyDB","user1","user1");
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from Student");
			
			ResultSetMetaData rsmd=rs.getMetaData();
			int cc=rsmd.getColumnCount();
			
			for(int i=1;i<=cc;i++)
			{
				System.out.print(rsmd.getColumnName(i)+"	 ");
			}
			
			System.out.println();
			
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+"		");
				System.out.print(rs.getString(2)+"		");
				System.out.println(rs.getString(3)+"	");
			}
			
			stmt.close();
			conn.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
		

	}

}