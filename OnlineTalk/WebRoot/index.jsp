<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	media="screen">
<script src="bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="CSS/registe.css">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<div class="container">
		<form class="form-horizontal" action="servlet/RegisteServlet" method="post">
			<fieldset>
				<legend>WL:注册页面</legend>
				<div class="control-group">
					<label class="control-label" for="name">用户名</label>
					<div class="controls">
						<input type="text"  id="input-Name" name="userName" placeholder="用户名" value="${userName}">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="inputPassword">Password</label>
					<div class="controls">
						<input type="password"  name="password" id="input-Pasword" placeholder="Password" value="${password}">
					</div>
				</div>
				<div class="control-group">
					<label class="control-label">账号</label>
					<div class="controls">
						<input type="text"  name="account" style="color:red"
						 id="input-ID" disabled="true" value="${userID}">
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<button type="submit" class="btn">Submit</button>
					</div>
				</div>
			</fieldset>
		</form>
	</div>
</body>
</html>
