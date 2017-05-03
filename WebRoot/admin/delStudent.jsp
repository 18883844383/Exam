<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
</head>

<body>
<h1>学生管理</h1>
    <p>删除学生</p>
    <hr width="20%" align="left" color="#CCCCCC"/>
<form action="" method="get">
<table width="20%" border="1" cellspacing="0" align="center">
  <tr>
    <td>学号：<input name="ID" type="text" /></td>
    <td align="right"><input name="" type="button" value="查找" /></td>
  </tr>
</table>
</form>
<form action="" method="get">
<table width="20%" border="1" cellspacing="0" align="center">
  <tr>
    <td>班级：<input name="class" type="text"/></td>
    <td align="right"><input name="" type="button" value="查找" /></td>
  </tr>
  </table>
</form>
<hr width="70%" align="center" color="#CCCCCC"/>
<table width="70%" border="1" cellspacing="0" align="center">
  <tr align="center">
    <td width="20%">选择</td>
    <td>学号</td>
    <td>姓名</td>
  </tr>
  <tr align="center">
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td colspan="3" align="right"><input name="" type="button" value="删除" /></td>
  </tr>
</table>

</body>
</html>