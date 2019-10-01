package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.enums.Action;

public class Commander {

	public static Command direct(HttpServletRequest request) {
		
		System.out.println("3. Commander.direct");
		System.out.println(String.format("request 값 출력 : %s, %s, %s, %s", 
				request.getParameter("playerId"),
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		
		Command cmd = null;
		switch (Action.valueOf(request.getParameter("action").toUpperCase())) {
		case CREATE : cmd = new CreateCommand(request); break;
		case SEARCH : cmd = new SearchCommand(request); break;
		case UPDATE : cmd = new CreateCommand(request); break;
		case DELETE : cmd = new CreateCommand(request); break;
		case MOVE 	: cmd = new MoveCommand(request); break;
		case LOGIN  : cmd = new LoginCommand(request); break;
		}
		
		return cmd;
	}
}
 