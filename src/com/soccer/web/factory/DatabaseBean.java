package com.soccer.web.factory;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// import oracle.jdbc.OracleDriver;

import lombok.Data;
@Data
public class DatabaseBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Connection conn;	
	private String driver, url, userid, password;
	
	public DatabaseBean(String driver, String url, String userid, String password) {
		this.driver = driver;
		this.url = url;
		this.userid = userid;
		this.password = password;
	}
	public Connection getConnection(){	// 오라클 연결
	//	Connection conn = null; 있으면 메서드가 끝나면 conn이 유지되지 않고 사라지기때문에 
		// 오라클 드라이버가 관리하는 영역
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, userid, password);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;
	}
	
	
	
	
}
