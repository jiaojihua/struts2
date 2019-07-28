<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="./js/jquery-3.4.1.js"></script>
<meta charset="UTF-8">
<title>ajax</title>
</head>
<body>
hello
<div id="msg"></div>
<button></button>
<div id="test"></div>
<script type="text/javascript">
	$(function(){
		var person = {"name":"张三","age":"30","wife":"null"};
		$("#msg").append("姓名："+ person.name+"<br>").
		append("年龄："+ person.age+"<br>").
		append("配偶："+ person.wife+"<br>");
		$("button").click(){
			$.ajax({
				url:"getData",
				type:"post",
				data:person,
				dataType:"json",//接收结果类型
				sucess:function(data){
					$("#test").append(data);
				},
				error:function(data){
					
				}
			});
		}
		
		
	});
	
</script>
</body>
</html>