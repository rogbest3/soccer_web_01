package com.soccer.web.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceipls.PlayerServiceImpl;
import com.soccer.web.services.PlayerService;

@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	PlayerService pService = new PlayerServiceImpl();
		PlayerBean param = null;

		switch (request.getParameter("action")) {
		case "move": break;

		case "find2" :
            request.setAttribute("positions", 
            		PlayerServiceImpl.getInstance().findPositions());
			break;
			
		case "find4" :
			param = new PlayerBean();
			param.setTeamId(request.getParameter("teamId"));
			param.setPosition(request.getParameter("position"));
            request.setAttribute("players", PlayerServiceImpl.getInstance().findByTeamIdPosition(param));
			break;
				
		case "find5" :
			param = new PlayerBean();	
			param.setTeamId(request.getParameter("teamId"));
			param.setHeight(request.getParameter("height"));
			param.setPlayerName(request.getParameter("playerName"));
			request.setAttribute("players", PlayerServiceImpl.getInstance().findByTeamIdHeightPlayerName(param));
			break;
		}
		
		String page = request.getParameter("page");
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/" + page + ".jsp");
		rd.forward(request, response);
	}
}
