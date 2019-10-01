<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<div>1<h2 style="width : 300px; margin: 0 auto">축구협회관리시스템</h2></div>
<div>
	<img id="soccer_intro" src="${img}/soccer_intro.jpg" alt="" />
</div>
<div>3</div>
<div>4</div>
<div>
	<form id="login_form" style="width: 100%; height: 100%">
		<div class="login_tab">
			<div id="login_tab_item1">
				USERNAME<input id="username" class="input_text" type="text" name="playerId"/>
			</div>
			<div id="login_tab_item2">
				<input id="login_btn" type="button" value="로그인"/>
			</div>
			<div id="login_tab_item3">
				PASSWORD<input id="userpassword" class="input_text" type="text" name="solar"/>
			</div>
			
		</div>
		<input type="hidden" name="action" value="login"/>
		<input type="hidden" name="page" value="main" />
		<input type="hidden" name="main_folder" value="player"/>
	</form>
</div>
<div>6</div>
<div>7</div>
<div>
	<h3 id="join_a">
		<a id="a_join" href="#">회원가입</a>
	</h3>
</div>
<div>9</div>

<script>
	app.init('${ctx}');
</script>