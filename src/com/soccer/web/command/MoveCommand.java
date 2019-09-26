package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.pool.Constants;

public class MoveCommand extends Command{
						// 파라미터 request 주는 이유
	public MoveCommand(HttpServletRequest request) {
		System.out.println("4. MoveCommand");
		System.out.println(String.format("request 값 출력 : %s, %s, %s, %s", 
				request.getParameter("playerId"),
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		
		setRequest(request);
		setDomain(request.getServletPath()
				.substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		execute();
	}
	
	@Override
	public void execute() {
		setPage(request.getParameter("page"));
		super.execute();
	}
}
