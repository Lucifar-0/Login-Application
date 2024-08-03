package com.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;

import com.userDao.UserDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserLogin extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("uid");
	String pass=req.getParameter("upass");
	
	System.out.println(name);
	System.out.println(pass);
	
	boolean flag=UserDao.userLogin(name, pass);
		if(flag) {
			jakarta.servlet.RequestDispatcher rd=req.getRequestDispatcher("Uuserhome.jsp");
			rd.forward(req, resp);
			
		}
		else {
			jakarta.servlet.RequestDispatcher rd=req.getRequestDispatcher("index.jsp?no=1");
			rd.forward(req, resp);
		}
		
	}
	}


