var app = (()=>{
	return {
		init : (ctx)=>{
			
			playerService.login(ctx);
			playerService.join(ctx);	
			playerService.moveJoin(ctx);
		
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
		login : (ctx)=>{
			$('#login_btn').click(()=>{
				if($('#username').val() === '' || $('#userpassword').val() === ''){
					alert('필수 값이 없습니다.');
				}else{
					$('#login_form').attr('action', ctx + '/player.do');
					$('#login_form').submit();
				}
			});
		},
		join : (ctx)=>{
			$('#join_btn').click(()=>{
				if($('#join_playerId').val() === '' || $('#join_solar').val() === ''){
					alert('필수 값이 없습니다.');
				}else{
					$('#join_form').attr('action', ctx + '/player.do');
					$('#join_form').submit();
				}
			});
		}, 
		moveJoin : (ctx)=>{
			$('#a_join').click(()=>{
				location.assign(ctx + '/facade.do?action=move&page=join');
			});
		} 
	};
})();

