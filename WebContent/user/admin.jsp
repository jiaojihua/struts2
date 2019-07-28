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
admin login success
<s:property value="#session.user"/><br>
<s:date name="currentTime" format="yyyy-MM-dd HH:mm:ss"/>
<s:debug></s:debug>
</body>
</html>