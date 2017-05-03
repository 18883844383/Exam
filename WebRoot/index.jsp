<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
</head>
<body>
	<form name="myform" action="login.action" method="post">
		<table width="50%" border="0" cellspacing="0" align="center">
		  <tr>
		    <td width="30%" align="right">用户名：</td>
		    <td>
		      <input type="text" name="id" size="20" /></td>
		  </tr>
		  <tr>
		    <td width="30%" align="right">密码：</td>
		    <td><input type="password" name="password" size="20"/></td>
		  </tr>
		  <tr>
		    <td colspan="2" align="center"><input name="save" type="submit" value="登录" /></td>
		  </tr>
		</table>
	</form>
</body>
</html>