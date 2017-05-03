<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
</head>

<body>
<h1>科目管理</h1>
    <p>查找科目</p>
    <hr width="20%" align="left" color="#CCCCCC"/>
<form action="" method="get">
<table width="30%" border="1" align="center" cellspacing="0">
  <tr>
    <td>科号：<input name="" type="text" /></td>
  </tr>
  <tr>
    <td align="right"><input name="" type="button" value="查找" /></td>
  </tr>
</table>
</form>
<hr width="50%" align="center"/>
            <table width="50%"  height="100" border="1" align="center" cellspacing="0" >
        <tr>
          <td>科号:
            <input type="text" name="ID" id="ID" height="20" width="150" readonly="readonly"/></td>
          <td>名称:
          <input type="text" name="name" id="name" height="20" width="150" readonly="readonly"/></td>
        </tr>
        <tr>
          <td>标准:
            <input type="text" name="age" id="age" height="20" width="150" readonly="readonly"/></td>
          <td>时间:
            <input type="text" name="sex" id="sex" height="20" width="150" readonly="readonly"/></td>
        </tr>
      </table>
</body>
</html>