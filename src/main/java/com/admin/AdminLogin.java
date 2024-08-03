package com.admin;

import java.io.IOException;

import com.admindao.AdminDao;
import com.userDao.UserDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AdminLogin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("aid");
		String pass=req.getParameter("apass");
		
		System.out.println("Admin Name:"+name);
		System.out.println("Admin Password:"+pass);
		
		boolean flag=AdminDao.adminLogin(name, pass);
		if(flag) 
		{
			
			
			jakarta.servlet.RequestDispatcher rd=req.getRequestDispatcher("adminhome.jsp");
			rd.forward(req, resp);
		}
		else 
		{
			jakarta.servlet.RequestDispatcher rd= req.getRequestDispatcher("adminlogin.jsp?no=1");
			rd.forward(req, resp);
		}
	}

}
