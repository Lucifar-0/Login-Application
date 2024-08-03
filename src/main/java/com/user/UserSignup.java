package com.user;

import java.io.IOException;
import com.userDao.UserDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserSignup extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("uname");
		String uid=req.getParameter("uid");
		String pass=req.getParameter("upass");
		String city=req.getParameter("ucity");
		String mobile=req.getParameter("umob");
		String usercpass=req.getParameter("ucpass");
		
		System.out.println("User Name:"+ name);
		System.out.println("User Id:"+uid);
		System.out.println("User Password:"+pass);
		System.out.println("User City:"+city);
		System.out.println( "User Mobile:"+mobile);
		System.out.println("User Confirm Password:"+usercpass);
		
		if(pass.equals(usercpass)) {
			
			boolean flag=UserDao.userRegistration(name, uid, pass, city, mobile);
			if(flag) 
			{
				
				
				jakarta.servlet.RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
				rd.forward(req, resp);
			}
			else 
			{
				jakarta.servlet.RequestDispatcher rd= req.getRequestDispatcher("usersignup.jsp");
				rd.forward(req, resp);
			}
		}
		else 
		{
			jakarta.servlet.RequestDispatcher rd= req.getRequestDispatcher("usersignup.jsp?no=2");
			rd.forward(req, resp);
		}
		
	}
}
