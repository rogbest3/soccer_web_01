package com.soccer.web.controllers;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import com.soccer.web.pool.Constants;

@WebServlet("/facade.do")
public class FacadeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	enum Resources{	//	facadecontroller에서만 사용할 enum 생성
		CTX, CSS, JS, IMG
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("퍼사드로 들어옴");

		for(Resources r : Resources.values()) { // [ CONTEXT, CSS, JS, IMG ] 가져옴 // toString하면 ""붙음
			System.out.println(r.toString().toLowerCase());
			request.getSession().setAttribute(r.toString().toLowerCase(), 
											request.getContextPath() 
											+ (r.toString().toLowerCase().equals("ctx")
											? "" 
											: "/resources/" + r.toString().toLowerCase()));

		}	
		System.out.println(request.getContextPath());
		// session.setAttribute("img", request.getContextPath() + "/resources/img");

		request
		.getRequestDispatcher(String.format(Constants.DOUBLE_PATH, 
											request.getServletPath()
											.substring(1, request.getServletPath().indexOf(".")),
											"login"))
		.forward(request, response);
		
	}
	
}
