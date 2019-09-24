package com.soccer.web.domains;

import java.io.Serializable;

import lombok.Data;
@Data
public class TeamBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String teamIdm, regionName, teamName, eTeamName, origYyyy,
				zipCode1, zipCode2, address, ddd, tel, fax, homepage, owner;
}
