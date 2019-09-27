var app = (()=>{
	return {
		init : (ctx)=>{
			$('#login_form').submit(()=>{
				alert('form태그 ok');	
			});
			$('#a_join').click(()=>{
				alert('회원가입 이동');
				location.assign(ctx + '/player.do?action=move&page=join');
			});
			$('#a_back').click(()=>{
				location.assign(ctx + '/player.do?action=move&page=login');
			});
		}
	};
})();

