package com.soccer.web.command;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.pool.Constants;
import com.soccer.web.serviceipls.PlayerServiceImpl;

public class LoginCommand extends Command {

	public LoginCommand(HttpServletRequest request) {
		System.out.println("4. LoginCommand");
		System.out.println(String.format("request 값 출력 : %s, %s, %s, %s", 
				request.getParameter("playerId"),
				request.getParameter("solar"),
				request.getParameter("action"),
				request.getParameter("page")));
		
		setRequest(request);
		setDomain(request.getServletPath()
				.substring(1, request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		execute();
	}

	@Override
	public void execute() {
		String playerId = request.getParameter("playerId");
		String solar = request.getParameter("solar");
		PlayerBean pb = new PlayerBean();
		pb.setPlayerId(playerId);
		pb.setSolar(solar);
		pb = PlayerServiceImpl.getInstance().login(pb);
		
		System.out.println("8. DB에서 커맨드로 전달된 로그인 객체 : " + pb.toString());
		
		String main_folder = "";
		if ( pb.getPlayerId() == null ) {
			setPage("fail");
			System.out.println("로그인 실패");
			main_folder = "facade";
		}else {
			setPage(request.getParameter("page"));

			System.out.println("로그인 성공");
			System.out.println("page : " + request.getParameter("page"));
			main_folder = "player";
		} 
		
		this.view = String.format(Constants.DOUBLE_PATH, main_folder, page);
		
	//	setPage(( pb.getPlayerId() == null ) ? "fail" :	request.getParameter("page"));
		
	//	super.execute();
	}
}
