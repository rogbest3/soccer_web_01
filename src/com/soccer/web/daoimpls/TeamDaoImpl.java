package com.soccer.web.daoimpls;

import com.soccer.web.services.TeamService;

public class TeamDaoImpl implements TeamService{
	private static TeamDaoImpl instance = new TeamDaoImpl();

	public static TeamDaoImpl getInstance() {
		return instance;
	}
	private TeamDaoImpl() {}
	
}
