<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    
    <title>查找试题界面</title>
    


  </head>
  
  <body>
    	<form action="subjectLikeQuery.action" method="post">
			<table border="0" cellspacing="10" cellpadding="0">
				  <tr>
					<td>试题题目:</td>
					<td><input name="subjectTitle" size="50" ></td>
				  </tr>
				  <tr>
				    <td colspan="2"><div align="center">
				      <input type="submit" name="Submit" value="查询">
				      <input type="reset" name="Submit2" value="重置">
			        </div></td>
			    </tr>
			</table>
			</form>
  </body>
</html>
