package com.soccer.web.factory;

import com.soccer.web.pool.Constants;

public class DatabaseFactory {
	
	public static Database createDadabase(String vender ) {
		Database db = null;
		switch (vender) {
		case "oracle": db = new Oracle(); break;
		case "mariadb" : db = new Mariadb(); break;
		case "mysql" : 	break;		
		case "h2" : break;		
		case "db2" : break;
		}	
		return db;
	}
}
