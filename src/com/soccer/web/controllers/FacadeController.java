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

		// session.setAttribute("img", request.getContextPath() + "/resources/img");
/**		if(request.getParameter("page") == null) {
			request.setAttribute("page", "login");
		}else {
			request.setAttribute("page", request.getParameter("page"));
		}
*/
		String page = request.getParameter("page") == null
					  ? "login"
					  : request.getParameter("page");
		
		request.setAttribute("page", page);
				
		System.out.println("fcon" + request.getServletPath());
		

		String mainFolder = request.getParameter("main_folder") == null
				  ? "facade"
				  : request.getParameter("main_folder");
	
		request.setAttribute("main_folder", mainFolder);

		System.out.println("main_folder : " + request.getAttribute("main_folder"));
		
		switch (request.getAttribute("main_folder").toString()) {
		case "facade":
			System.out.println("facade 이동");
			request
			.getRequestDispatcher(String.format(Constants.DOUBLE_PATH, 
												request.getServletPath()
												.substring(1, request.getServletPath().indexOf(".")),
												"main"))
			.forward(request, response);
			break;
			
		case "player":
			System.out.println("player 이동");
			request
			.getRequestDispatcher(String.format(Constants.DOUBLE_PATH, 
												"player",
												"main"))
			.forward(request, response);
			break;
		default:
			break;
		}

	}
}
