window.onload = function(){
	let canvas, ctx, clear;
	
	clear = document.getElementById("clear");
	canvas = document.getElementById("myDrawer");
	ctx = canvas.getContext("2d");
	
	let isDrag = false;
	canvas.onmousedown = function(e){
		isDrag = true;
		let x = e.offsetX, y = e.offsetY;
		ctx.beginPath();
		ctx.lineWidth = 4;
		ctx.moveTo(x, y);
	}
	canvas.onmouseup = function(e){
		isDrag = false;
	}
	canvas.onmousemove = function(e){
		if (isDrag){
			let x = e.offsetX, y = e.offsetY;
			//console.log(x + " x " + y);
			ctx.lineTo(x, y);
			ctx.stroke();
		}
	}
	
	
}