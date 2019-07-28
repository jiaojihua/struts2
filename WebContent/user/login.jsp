<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form action="login" method="post">
	用户名：<input name="userName" type="text" ><s:fielderror fieldName="userName"></s:fielderror><br>
	密  码：<input name="password" type="password"><s:fielderror fieldName="password"></s:fielderror><br>
	<input type="submit" value="登录" > &nbsp;&nbsp;
	<input type="reset" value="重置">
</form>
</body>
</html>