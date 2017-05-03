<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
</head>

<body>
<h1>班级管理</h1>
    <p>新增班级</p>
    <hr width="20%" align="left" color="#CCCCCC"/>
    <form action="" method="post" enctype="multipart/form-data" name="form1" style=" border-color:#CCC">
      <table width="50%"  height="100" border="1" align="center" cellspacing="0" >
        <tr>
          <td>班级号:
            <input type="text" name="ID" id="ID" height="20" width="150"/></td>
          <td>名  称:
          <input type="text" name="name" id="name" height="20" width="150"/></td>
        </tr>
        <tr>
          <td align="right" colspan="2"><input name="save" type="button" value="提交"/></td>
        </tr>
      </table>
    </form>
</body>
</html>