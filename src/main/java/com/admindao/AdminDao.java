package com.admindao;

import java.sql.Connection;
import java.sql.ResultSet;

import com.database.DatabaseConnector;
import com.mysql.jdbc.Statement;

public class AdminDao {
	public static boolean adminLogin(String aid, String apass) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		boolean flag=false;
		
		try 
		{
			con=DatabaseConnector.getConnection();
			st=(Statement) con.createStatement();
			String query="select * from m_user where u_id='"+aid+"'  and u_pass='"+apass+"' ";
			rs=st.executeQuery(query);
			if(rs.next()) {
				flag=true;
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		return flag;
	}

}
