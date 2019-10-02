package com.soccer.web.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.daoimpls.PlayerDaoImpl;
import com.soccer.web.pool.Constants;
import com.soccer.web.serviceipls.PlayerServiceImpl;

public class SearchCommand extends Command{

	public SearchCommand(HttpServletRequest request) {
		setRequest(request);
		setAction(request.getParameter("action"));
		setDomain(request.getServletPath()
				.substring(1, request.getServletPath().indexOf(".")));
		
		execute();
	}

	@Override
	public void execute() {
		setPage(request.getParameter("page"));
		
		System.out.println("searchcmd page : " + request.getParameter("page"));

		request.setAttribute("positions", PlayerServiceImpl.getInstance().findPositions());
		view = String.format(Constants.DOUBLE_PATH, "player", "main");
	//	super.execute();
	}
}
