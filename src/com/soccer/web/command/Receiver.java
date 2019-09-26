package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

public class Receiver {
	
	public static Command cmd = new Command();
	
	// commander에 전달
	public static void init(HttpServletRequest request) {
		System.out.println("2. Receiver.init");
		System.out.println(String.format("request 값 출력 : %s, %s, %s, %s", 
				request.getParameter("playerId"),
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		
		cmd = Commander.direct(request);
	}
}
