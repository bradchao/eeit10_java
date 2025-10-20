window.onload = function(){
	let canvas, ctx;
	let webSocket = new WebSocket("ws://10.0.103.238:8080/BradWeb/mycenter");
	let isConnect = false;
	
	webSocket.onopen = function(){
		isConnect = true;
	};
	webSocket.onmessage = function(event){
		if (isConnect){
			let mesgObj = JSON.parse(event.data);
			if (mesgObj.isClear){
				clear();
			}else{
				if (mesgObj.isNewline){
					newLine(mesgObj.x, mesgObj.y);
				}else{
					drawLine(mesgObj.x, mesgObj.y);
				}
			}
		}
	}
	webSocket.onclose = function(){
		isConnect = false;
	};
	webSocket.onerror = function(e){
		console.log("ERROR:" + e.data);
	};
	
	canvas = document.getElementById("myDrawer");
	ctx = canvas.getContext("2d");
	
	function clear(){
		ctx.clearRect(0,0,canvas.width, canvas.height);
	}
	function newLine(x,y){
		ctx.beginPath();
		ctx.lineWidth = 4;
		ctx.moveTo(x, y);		
	}
	function drawLine(x,y){
		ctx.lineTo(x, y);
		ctx.stroke();		
	}
	
}