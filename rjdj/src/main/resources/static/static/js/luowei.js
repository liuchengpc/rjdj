function cnmd(){
			nimabide();
		}
		function nimabide(){			
			$("[name=goodskc] tbody").html("");
			var kc=$("[name=goodkuchun]").val();
			if(kc==""){
				kc=1;
			}
			$("#tab_none tbody tr").each(function(){
				var yanshe=$(this).find("input").eq(1).val();
				if(yanshe!=""){
					$.each($("[name=chimaya] a"),function(a,b){					
						if($(b).attr("name")=="noundefined"){
							
							var shuijima="";
							for(var i=0;i<12;i++){
								var j=parseInt(Math.random()*10);
								if(i==0&&j==0){
									j++;
								}
								shuijima+=j;
							}
							
							$("[name=goodskc] tbody").append("<tr><td><span>"+yanshe+"</span><span>——</span><span>"+$(b).html()+"</span></td><td><input type='text' style='width: 137px;text-align:center;	' class='form-control' placeholder='请输入数量' value='"+kc+"'></td><td>"+shuijima+"</td></tr>");
						}
						})
				}
			})
		
		}
		$("#shopgoods").mouseover(function(){
			$("[name=chimaya] a").unbind("click");
			niubi();
		})
		
			function niubi(){

			$("[name=chimaya] a").click(function(){		

				if($(this).attr("name")=="noundefined"){
					$(this).attr("name","undefined");
					$(this).attr("style","color:black");
					nimabide();
					
					
				}else{
					$(this).attr("style","color:red");
					$(this).attr("name","noundefined");
						nimabide();
					}
			
		
			})
		
			}
			
			
				$("[name=colorbao] input").click(function(){	
					var color=$(this).next().find("span").eq(0).attr("style");
					var colorname=$(this).next().find("span").eq(1).html();
					
					if($(this).attr("checked")=="checked"){
						$(this).removeAttr("checked");
						var index=0;
						$("#tab_none tbody tr").each(function(a,b){					
							index+=a;
						})
						$("#tab_none tbody tr").each(function(a,b){
							var yanshe=$(b).find("input").eq(1).val();						
							if(colorname==yanshe){	
								$(b).remove();
								
							}
						})
						
						if(index==0){
							$("#tab_none").hide();
						}
						nimabide();
					}else{
						$("#tab_none tbody").append(`
								<tr>
															<td>
																<span style="margin-left: 4px;">1</span>
																<span>.</span>
																<span style="margin-left: 4px;"><input type="checkbox" /></span>
																<span style="display: inline-block;margin-left: 4px;width: 50%;"><input type="text" onblur="cnmd()" class="form-control" placeholder="请输入颜色" value="${colorname}"  /></span>
																<span style="margin-left: 9px;" class="glyphicon glyphicon-remove" onclick="yichu(this)"></span>
															</td>
															<td>
																<span style="display: inline-block;width: 50%"><input style="${color}" type="text" class="form-control" disabled="disabled" /></span>
																<span><button type="button" class="btn btn-primary active">上传图片</button></span>
															</td>
														</tr>
							`);
						$("#tab_none").show();
						$(this).attr("checked","checked");
						nimabide();
					}
				})
			
			$("#addColor").click(function(){
				$("#tab_none tbody").append(`
					<tr>
												<td>
													<span style="margin-left: 4px;">1</span>
													<span>.</span>
													<span style="margin-left: 4px;"><input type="checkbox" /></span>
													<span style="display: inline-block;margin-left: 4px;width: 50%;"><input type="text" onblur="cnmd()" class="form-control" placeholder="请输入颜色"  /></span>
													<span style="margin-left: 9px;" class="glyphicon glyphicon-remove" onclick="yichu(this)"></span>
												</td>
												<td>
													<span style="display: inline-block;width: 50%"><input type="text" class="form-control" disabled="disabled" /></span>
													<span><button type="button" class="btn btn-primary active">上传图片</button></span>
												</td>
											</tr>
				`);
				$("#tab_none").show();
			});
			function sc(a){
				var name=$(a).prev().html();
				$(a).parent().remove();
				nimabide();
			}
			
			function enen(){
				var name=$("[name=bjcm]").html();
				if(name=="编辑尺码"){
					$("[name=chima]").show();
				$(".fpsize").append(`
					<li><input name="lw" style="width: 147.33px; height: 34px;"></li>
				`);
				$("[name=bjcm]").html("保存修改");
				$("[name=chimaya] a").unbind("click");
				niubi();
				}else{
					var nima=$("[name=lw]").val();
					$(".fpsize input").parent().remove();
					$("[name=bjcm]").html("编辑尺码");
					if(nima!=""){
					$(".fpsize").append("<li><a href='javascript:;'>"+nima+"</a><span style='float: right;' name='chima' class='glyphicon glyphicon-remove' onclick='sc(this)'></span></li>");
					$("[name=chimaya] a").unbind("click");
					niubi();
					}
					$("[name=chima]").hide();
				}
				
			}
			
			function yichu(a){
			
				var tr = $(a).parent().parent();
				var inpu=tr.find("input").eq(1).val();
				$("[name=colorbao] input").each(function(a,b){
				
					if($(b).next().find("span").eq(1).html()==inpu){
						$(this).removeAttr("checked");
					}
				})
				var index=0;
				$("#tab_none tbody tr").each(function(a,b){					
					index+=a;
				})
				tr.remove();
				if(index==0){
					$("#tab_none").hide();
				}
				nimabide();
			}
		