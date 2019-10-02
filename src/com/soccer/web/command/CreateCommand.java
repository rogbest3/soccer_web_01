package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceipls.PlayerServiceImpl;

public class CreateCommand extends Command{
	
	public CreateCommand(HttpServletRequest request) {
		setRequest(request);
		setDomain(request.getServletPath()
				.substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		execute();

	}
	@Override
	public void execute() {

		PlayerBean param = new PlayerBean();
		param.setBackNo(request.getParameter("backNo"));
		param.setBirthDate(request.getParameter("birthDate"));
		param.setEPlayerName(request.getParameter("ePlayerName"));
		param.setHeight(request.getParameter("height"));
		param.setJoinYyyy(request.getParameter("joinYyyy"));
		param.setNation(request.getParameter("nation"));
		param.setNickName(request.getParameter("nickName"));
		param.setPlayerId(request.getParameter("playerId"));
		param.setPlayerName(request.getParameter("playerName"));
		param.setPosition(request.getParameter("position"));
		param.setSolar(request.getParameter("solar"));
		param.setTeamId(request.getParameter("teamId"));
		param.setWeight(request.getParameter("weight"));
				
		if(PlayerServiceImpl.getInstance().joinPlayer(param)) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}
		setPage(request.getParameter("page"));
		System.out.println("setpage : " + request.getParameter("page"));
		
		super.execute();
	}
}
