<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%
    	String path = request.getContextPath();
    	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script src="<%=basePath %>js/jquery-3.3.1.js"></script>
</head>
<body>
<h2>Hello World!</h2>
<a href="<%=basePath %>a">toA</a>
<a href="<%=basePath %>getUsers">getUsers</a>
<a href="<%=basePath %>trans">trans</a>
<form action="<%=basePath %>add">
	<input type="text" name="userName">
	<input type="text" name="password">
	<input type="text" name="age">
	<input type="submit" value="submit">
</form>
</body>
</html>