package com.soccer.web.serviceipls;

import com.soccer.web.services.ScheduleService;

public class ScheduleServiceImpl implements ScheduleService{

	private static ScheduleServiceImpl instance = new ScheduleServiceImpl();
	public static ScheduleServiceImpl getInstance() {
		return instance;
	}
	public ScheduleServiceImpl() {}
	
}
