<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
</head>

<body>
 <h1>学生管理</h1>
    <p>新增学生</p>
    <hr width="20%" align="left" color="#CCCCCC"/>
    <form action="addStudent.action" method="post" name="addStu">
      <table width="50%"  height="150" border="1" align="center" cellspacing="0">
        <tr>
          <td>学号:
          <input type="text" name="number"  height="20" width="150"/></td>
          <td>姓名:
          <input type="text" name="name"  height="20" width="150"/></td>
        </tr>
        <tr>
          <td>年龄:
          <input type="text" name="age" id="age" height="20" width="150"/></td>
          <td>性别:
          <input type="text" name="sex" id="sex" height="20" width="150"/></td>
        </tr>
        <tr>
          <td>班级:
          <select name="选择班级" style="width:150px">
            <option>1</option>
            <option>2</option>
          </select></td>
          <td>电话:
          <input type="text" name="TEL" id="TEL" height="20" width="150"/></td>
        </tr>
      </table>
      <hr align="center" width="50%" color="#CCCCCC"/>
      <table width="50%" border="0" align="center">
  <tr>
    <td>照片</td>
  </tr>
  <tr>
    <td><input type="image" name="icon" id="icon" width="90" height="120" src="image/icon.jpg"/></td>
  </tr>
  <tr>
    <td><label for="address"></label>
      <input type="file" name="address" id="address"/></td>
  </tr>
  <tr>
    <td align="right"><input name="save" type="submit" value="提交"/></td>
  </tr>
      </table>
    </form>
</body>
</html>