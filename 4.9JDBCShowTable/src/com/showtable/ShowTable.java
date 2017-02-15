package com.showtable;
import java.sql.*;

public class ShowTable {
public static void main(String args[])
{
	try{
		Class.forName("org.h2.Driver");
		Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from Student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"    ");
			System.out.println(rs.getString(2)+"   ");
			System.out.println(rs.getString(3)+"   ");
			
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

