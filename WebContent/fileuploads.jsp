<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>文件上传</title>
</head>
<body>
<form action="uploads" method="post" enctype="multipart/form-data">
	<input type="file" name="upload"><br>
	<input type="file" name="upload"><br>
	<input type="file" name="upload"><br>
	<input type="file" name="upload"><br>
	<input type="file" name="upload"><br>
	<input type="submit" value="上传">
</form>
</body>
</html>