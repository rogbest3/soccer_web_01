package com.soccer.web.domains;

import java.io.Serializable;

import lombok.Data;
@Data
public class PlayerBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	// ID : playerId, PW : solar
	private String playerId, playerName, ePlayerName, nickName, teamId,
					joinYyyy, position, nation, birthDate, solar;
	private String backNo, height, weight;
}
