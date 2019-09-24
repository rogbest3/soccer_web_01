package com.soccer.web.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConnTest {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe", 
				username = "c##kmk", 
				password = "4683";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, username, password);
			if(conn != null) {
				System.out.println("연결 성공");
				stmt = conn.createStatement(); // statement 한장 만들기
				rs = stmt.executeQuery("SELECT  \r\n" + 
						"    p.*\r\n" + 
						"FROM ( SELECT *\r\n" + 
						"       FROM PLAYER\r\n" + 
						"       WHERE POSITION IN ('GK', 'MF')) P \r\n" + 
						"    JOIN (SELECT\r\n" + 
						"            TEAM_ID, \r\n" + 
						"            TEAM_NAME\r\n" + 
						"          FROM TEAM\r\n" + 
						"          WHERE TEAM_ID IN ('K07', 'K09', 'K08')) T\r\n" + 
						"        ON P.TEAM_ID LIKE T.TEAM_ID\r\n" + 
						"ORDER BY 1, 2, 3 \r\n");	//	쿼리문 붙여넣기
				List<String> list = new ArrayList<>();

				while(rs.next()) {
					list.add(rs.getString("PLAYER_NAME"));
				}
				System.out.println("팀명 : "+ list);
			}else {
				System.out.println("연결 실패");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
