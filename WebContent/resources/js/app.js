var app = (()=>{
	return {
		init : (ctx)=>{
			
			playerService.login();
			
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

var user = (()=>{
	var _playerId, _playerName, _ePlayerName, _nickName, 
	_teamId, _joinYyyy, _position, _nation, _birthDate, _solar,
	_backNo, _height, _weight
	
	var setPlayerId = (playerId)=>{this._playerId = playerId;}
	var setSolar = (solar)=>{this._solar = solar;}
	var getPlayerId = ()=>{return this._playerId;}
	var getSolar = ()=>{return this._solar;}
	
	return{
		setPlayerId : setPlayerId,
		setSolar : setSolar,
		getPlayerId : getPlayerId,
		getSolar : getSolar,
	};
})();

var playerService = (()=>{
	return{
		login : ()=>{
			$('#login_btn').click(()=>{
				if($('#username').val() === '' || $('#userpassword').val() === ''){
					alert('필수 값이 없습니다.');
				}else{
					$('#login_form').attr('action', '/jee-soccer/player.do');
					$('#login_form').submit();
				}
			});
		}
	};
})();

