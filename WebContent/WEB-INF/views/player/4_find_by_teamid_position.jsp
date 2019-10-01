<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 4. 팀아이디로 해당 팀의 포지션별 선수 검색 기능 예)수원팀(ID: K02), 골키퍼  -->
	<h2>4.팀아이디로 해당 팀의 포지션별 선수 검색</h2>
	<form id="link2" action="${ctx}/player.do">
		팀ID <input type="text" name="teamId"/><br />
		포지션 <input type="text" name="position"/><br />
		<input type="hidden" name="action" value="find4"/>
		<input type="hidden" name="page" value="4_find_by_teamid_position"/>
		<input type="submit" value="전 송"/>
	</form>	
	
<!-- 4. 결과 -->
해당 ID가 ${ players.teamId }팀의 포지션 ${ players.position }이 일치하는 선수는 입니다.
