package com.soccer.web.services;

import java.util.List;

import com.soccer.web.domains.PlayerBean;

public interface PlayerService {
	// 1. 로그인
	public PlayerBean login(PlayerBean param);
	/**
	 * 2. 포지션 종류(중복제거, 없으면 빈공간)
	 * 	return 타입이 한 column만이면 List<String>
	 */
	public List<String> findPositions();

	/**
	 * 4. 팀아이디로 해당 팀의 포지션별 선수 검색 기능 예)수원팀(ID: K02), 골키퍼
	 * 	return 타입이 인스턴스이기때문에 List<PlayerBean>
	 */
	public List<PlayerBean> findByTeamIdPosition(PlayerBean param);
	
	/**
	 * 5. 수원팀(ID: K02)키가 170 이상 선수이면서 성이 고씨인 선수
	 * 	return 타입이 인스턴스이기때문에 List<PlayerBean>
	 */
	public List<PlayerBean> findByTeamIdHeightPlayerName(PlayerBean param);
}
