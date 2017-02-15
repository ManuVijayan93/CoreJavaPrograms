package com.insertdata;

import java.sql.*;
public class InsertData 
{

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("org.h2.Driver");
			Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","user1","");
			
			PreparedStatement psmt=conn.prepareStatement("insert into Student values(?,?,?)");
			
			int sid;
			String sname,course;
			
			sid=1004;
			sname="Shruthi";
			course="DT Java";
			
			psmt.setInt(1,sid);
			psmt.setString(2, sname);
			psmt.setString(3, course);
			
			int row_eff=psmt.executeUpdate();
			
			System.out.println(row_eff+"  row effected");
			
			psmt.close();
			conn.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}

	}

}