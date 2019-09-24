package com.soccer.web.serviceipls;

import java.util.ArrayList;
import java.util.List;

import com.soccer.web.daoimpls.PlayerDaoImpl;
import com.soccer.web.daos.PlayerDao;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.services.PlayerService;import sun.net.www.content.text.plain;

public class PlayerServiceImpl implements PlayerService{

	private static PlayerServiceImpl instance = new PlayerServiceImpl();
	
	public static PlayerServiceImpl getInstance() {
		return instance;
	}
	private PlayerServiceImpl() {} // private 으로 바꿔서 new 못씀

	@Override
	public List<String> findPositions() {
	//	List<String> positions = PlayerDaoImpl.getInstance().selectPositions();
		return PlayerDaoImpl.getInstance().selectPositions();
	}

	@Override
	public List<PlayerBean> findByTeamIdPosition(PlayerBean param) {
		List<PlayerBean> players = PlayerDaoImpl.getInstance().selectByTeamIdPosition(param);
		
		return players;
	}

	@Override
	public List<PlayerBean> findByTeamIdHeightPlayerName(PlayerBean param) {
		List<PlayerBean> players = PlayerDaoImpl.getInstance().selectByTeamIdHeightPlayerName(param);
		
		return players;
	}
	
	
	
}
