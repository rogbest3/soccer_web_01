<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="../common/head.jsp"/>

	<h2><a id="link1" href="#">포지션 종류 보기</a></h2>
	<!-- 4. 팀아이디로 해당 팀의 포지션별 선수 검색 기능 예)수원팀(ID: K02), 골키퍼  -->
	<h2>4.팀아이디로 해당 팀의 포지션별 선수 검색</h2>
	<form id="link2" action="${ctx}/player.do">
		팀ID <input type="text" name="teamId"/><br />
		포지션 <input type="text" name="position"/><br />
		<input type="hidden" name="action" value="find4"/>
		<input type="hidden" name="page" value="4_find_by_teamid_position"/>
		<input type="submit" value="전 송"/>
	</form>
	
	<h2>5. 수원팀(ID: K02)키가 170 이상이면서 성이 고씨인 선수 </h2>
	<form id="link3" action="${ctx}/player.do">
		팀ID <input type="text" name="teamId"/><br />
		키 <input type="text" name="height"/><br />
		성 <input type="text" name="playerName"/><br />
		<input type="hidden" name="action" value="find5"/>
		<input type="hidden" name="page" value="5_find_by_teamid_height_name"/>
		<input type="submit" value="전 송"/>
	</form>
	
<script>
	$('#link1').click(function(){
		location.assign('${ctx}/player.do?action=find2&page=2_positions');
	});
	$('#link2').submit(function(){

	});
	$('#link3').submit(function(){

	});
</script>
<jsp:include page="../common/foot.jsp"/>