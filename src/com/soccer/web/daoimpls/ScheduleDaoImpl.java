package com.soccer.web.daoimpls;

import com.soccer.web.services.ScheduleService;

public class ScheduleDaoImpl implements ScheduleService {

	private static ScheduleDaoImpl instance = new ScheduleDaoImpl();

	public static ScheduleDaoImpl getInstance() {
		return instance;
	}
	private ScheduleDaoImpl() {}
}
