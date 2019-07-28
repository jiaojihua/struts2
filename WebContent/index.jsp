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
this is the index page...<br>
<!-- jsp页面国际化 标签属性用s:property value="getText('key')" -->
<h1><s:text name="welcome">
	<s:param>admin</s:param>
</s:text></h1>

</body>
</html>