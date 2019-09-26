package com.soccer.web.daoimpls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.soccer.web.daos.PlayerDao;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.factory.DatabaseFactory;
import com.soccer.web.pool.Constants;

public class PlayerDaoImpl implements PlayerDao{
	// 싱글턴 패턴
	private static PlayerDaoImpl instance = new PlayerDaoImpl();
	public static PlayerDaoImpl getInstance() {	return instance; }
	private PlayerDaoImpl() {}
	
	@Override
	public List<String> selectPositions() {
		List<String> positions = new ArrayList<>();
		try {										// as 생략 가능
			String sql = "SELECT DISTINCT POSITION as position \n" + 
						"FROM PLAYER";
			ResultSet rs = DatabaseFactory
							.createDadabase(Constants.VENDER)
							.getConnection()
							.prepareStatement(sql)
							.executeQuery();
			while(rs.next()) {
				positions.add(rs.getString("position"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return positions;
	}

	@Override
	public List<PlayerBean> selectByTeamIdPosition(PlayerBean param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerBean> selectByTeamIdHeightPlayerName(PlayerBean param) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public PlayerBean selectByPlayerIdSolar(PlayerBean param) {
		System.out.println("6. PlayerDaoImpl");
		System.out.println(String.format("param 값 출력 : %s, %s", 
				param.getPlayerId(),
				param.getSolar()));
		
		PlayerBean pb = new PlayerBean();
		String sql = "SELECT *\r\n" + 
					"FROM PLAYER\r\n" + 
					"WHERE PLAYER_ID LIKE ? \r\n" + 
					"    AND SOLAR LIKE ?";
		
		try {	//	?가 있기 때문에 PreparedStatement stmt 으로 끊어서 코딩
			PreparedStatement stmt = DatabaseFactory
									.createDadabase(Constants.VENDER)
									.getConnection()
									.prepareStatement(sql);
			
			stmt.setString(1, param.getPlayerId());
			stmt.setString(2, param.getSolar());
			ResultSet rs = stmt.executeQuery();
			
			// index가 없기 때문에 while 사용
			while(rs.next()) {	// rs.next() - 한 column씩 읽음 , row가 여러개이기 때문에 while이지만 row가 1개여도 while 사용
				pb = new PlayerBean();	//	있으면 저장장소 만들고 저장
			
				pb.setBackNo(rs.getString("BACK_NO"));
				pb.setBirthDate(rs.getString("BIRTH_DATE"));
				pb.setEPlayerName(rs.getString("E_PLAYER_NAME"));
				pb.setHeight(rs.getString("HEIGHT"));
				pb.setJoinYyyy(rs.getString("JOIN_YYYY"));
				pb.setNation(rs.getString("NATION"));
				pb.setNickName(rs.getString("NICKNAME"));
				pb.setPlayerId(rs.getString("PLAYER_ID"));
				pb.setPlayerName(rs.getString("PLAYER_NAME"));
				pb.setPosition(rs.getString("POSITION"));
				pb.setSolar(rs.getString("SOLAR"));
				pb.setTeamId(rs.getString("TEAM_ID"));
				pb.setWeight(rs.getString("WEIGHT"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("7. 반환된 결과값 : " + pb.toString() );
		
		return pb;
	}
	@Override
	public List<PlayerBean> selectByMany(PlayerBean param) {
		List<PlayerBean> p = new ArrayList<>();
		String sql = "";
		try {
			PreparedStatement stmt = DatabaseFactory
									.createDadabase(Constants.VENDER)
									.getConnection()
									.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
	}
}
