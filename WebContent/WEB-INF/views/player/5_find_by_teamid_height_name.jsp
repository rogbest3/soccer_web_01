<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 5. 쿼리 -->
<h2>5. 수원팀(ID: K02)키가 170 이상이면서 성이 고씨인 선수 </h2>
	<form id="link3" action="${ctx}/player.do">
		팀ID <input type="text" name="teamId"/><br />
		키 <input type="text" name="height"/><br />
		성 <input type="text" name="playerName"/><br />
		<input type="hidden" name="action" value="find5"/>
		<input type="hidden" name="page" value="5_find_by_teamid_height_name"/>
		<input type="submit" value="전 송"/>
	</form>
	
<!-- 5. 결과 -->	
팀 아이디 ${ players.teamId }이고  키 ${ players.height }이상인 성이 ${ players.playerName }씨 선수
