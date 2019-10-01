package com.soccer.web.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soccer.web.command.Command;
import com.soccer.web.command.Commander;
import com.soccer.web.command.Receiver;
import com.soccer.web.command.Sender;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.enums.Action;
import com.soccer.web.serviceipls.PlayerServiceImpl;
import com.soccer.web.services.PlayerService;

@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
							// 파라미터도 지역변수이기 때문에 request, response도 use관계
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// playerId solar action page
		System.out.println("1. player 서블릿 들어옴");
		System.out.println(String.format("request 값 출력 : %s, %s, %s, %s", 
				request.getParameter("playerId"),
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		
		Receiver.init(request);
		switch (Action.valueOf(request.getParameter("action").toUpperCase())) {
		case CREATE : request.setAttribute("page", "login"); break;

		default:
			break;
		}
		Sender.forward(request, response);
		
	}
}
