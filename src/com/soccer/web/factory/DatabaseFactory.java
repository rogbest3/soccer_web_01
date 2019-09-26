package com.soccer.web.factory;

import com.soccer.web.enums.DB;
import com.soccer.web.pool.Constants;

public class DatabaseFactory {
	
	public static Database createDadabase(String vender ) {
		Database db = null;
		switch (DB.valueOf(vender)) {
		case ORACLE : db = new Oracle(); break;
		case MARIADB : db = new Mariadb(); break;
		case MYSQL : break;		
		case H2 : break;		
		case DB2 : break;
		}	
		return db;
	}
}
