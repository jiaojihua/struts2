<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello world</h1>
<s:actionmessage/>

<br>
<s:text name="welcome">
	<s:param>administrator</s:param>
</s:text>
</body>
</html>