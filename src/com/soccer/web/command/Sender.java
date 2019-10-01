package com.soccer.web.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sender {

	public static void forward(HttpServletRequest request, HttpServletResponse response) {
		try {
			System.out.println("10. Sender");
			System.out.println(String.format("request 값 출력 : %s, %s, %s, %s", 
					request.getParameter("playerId"),
					request.getParameter("solar"),
					request.getParameter("action"),
					request.getParameter("page")));
			
			System.out.println("도착지::"+Receiver.cmd.getView());
					
			request.setAttribute("page", "login");
			
			request
			.getRequestDispatcher(Receiver.cmd.getView())	//	.jsp
			.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void redirect(HttpServletRequest request, HttpServletResponse response) {
		try {
			response
			.sendRedirect("");			//	.do로 다시 보냄
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
