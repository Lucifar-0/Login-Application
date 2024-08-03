package com.userDao;

import java.sql.Connection;

import com.database.DatabaseConnector;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class UserDao 
{
	public static boolean userRegistration(String uname, String uid, String upass, String ucity, String umob) 
	{
		// USER LOGIN
		
		Connection con=null;
		boolean flag=false;
		Statement st=null;
		
		try 
		{
			con=DatabaseConnector.getConnection();
			
			st=(Statement) con.createStatement();
			String query="insert into m_user(u_name,u_id,u_pass,u_city,u_mob) values('"+uname+"','"+uid+"','"+upass+"','"+ucity+"','"+umob+"')";
			int n=st.executeUpdate(query);
			
			if(n!=0) {
				flag=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
		
		
	}
	public static boolean userLogin(String aid, String apass) {
		Connection con=null;
		boolean flag=false;
		Statement st=null;
		ResultSet rs=null;
		try {
			con=DatabaseConnector.getConnection();
			st=(Statement) con.createStatement();
			String query="select * from m_user where u_id='"+aid+"' and u_pass='"+apass+"'  ";
			
			rs=(ResultSet) st.executeQuery(query);
			
			if(rs.next()) {
				flag=true;
			}
					
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
		
	}
	
	

}
