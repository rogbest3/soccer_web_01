package com.soccer.web.domains;

import java.io.Serializable;

import lombok.Data;
@Data
public class StadiumBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private String stadiumId, stadiumName, homeTeamId, address, ddd, tel;
	private int seatCount;
}
