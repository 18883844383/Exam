<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <title>查看试题</title>
    

  </head>
  
  <body>
   <table border="0" cellspacing="10" cellpadding="0">
				  <tr>
				    <td>试题编号:</td>
				    <td>${question.id}</td>
			    </tr>
				  <tr>
					<td>试题题目:</td>
					<td>${question.title}</td>
				  </tr>
				  <tr>
					<td>答案</td>
					<td>${question.answer}</td>
				  </tr>
				   <tr>
					<td>难度</td>
					<td>${question.diffculty}</td>
				  </tr>
				   <tr>
					<td>考点</td>
					<td>${question.testCenture}</td>
				  </tr>
				
			</table>
  </body>
</html>
