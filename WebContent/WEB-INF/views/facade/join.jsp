<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


회원가입 화면

<h3><a id="a_back" href="#">회원가입</a></h3>

<form id="join_form" style="width: 100%; height: 100%">	

	playerId<input id="join_playerId" type="text" name="playerId"/><br />
	playerName<input type="text" name="playerName"/><br />
	ePlayerName<input type="text" name="ePlayerName"/><br />
	nickName<input type="text" name="nickName"/><br />
	teamId<input type="text" name="teamId"/><br />
	joinYyyy<input type="text" name="joinYyyy"/><br />
	position<input type="text" name="position"/><br />	
	nation<input type="text" name="nation"/><br />
	birthDate<input type="text" name="birthDate"/><br />
	solar<input id="join_solar" type="text" name="solar"/><br />
	backNo<input type="text" name="backNo"/><br />
	height<input type="text" name="height"/><br />
	weight<input type="text" name="weight"/><br />

	<input type="hidden" name="action" value="create"/>
	<input type="hidden" name="page" value="main" />
	<input type="hidden" name="main_folder" value="facade"/>
	
	<input id="join_btn" type="button" value="가입"/>
</form>


<h3><a id="a_back" href="#">뒤로가기</a></h3>
<script>
app.init('${ctx}');
</script>

