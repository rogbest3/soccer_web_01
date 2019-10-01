package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.pool.Constants;

import lombok.Data;
@Data
public class Command implements Order{

	protected String action, domain, page, view;
	protected HttpServletRequest request;
	
	@Override
	public void execute() {
		System.out.println("9. Command");
		System.out.println(String.format("request 값 출력 : %s, %s, %s, %s", 
				request.getParameter("playerId"),
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		
		this.view = String.format(Constants.DOUBLE_PATH, request.getParameter("main_folder"), page);
	}
}
