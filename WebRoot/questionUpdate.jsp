<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>更新试题</title>
    

  </head>
  
  <body>
  		<form action="questionUpadate.action" method="post">
				<table border="0" cellspacing="10" cellpadding="0">
					<tr>
						<td colspan="2"><s:actionmessage/></td>
					</tr>
				  <tr>
					<td>试题题目:</td>
					<td>
						<input name="id" type="hidden" value="${question.id}">
						<input name="title" type="text" size="80"  value="${question.title}">
					</td>
				  </tr>
				  <tr>
					<td>答案：</td>
					<td><input type="text" name="answer" size="20" value="${question.answer}"></td>
				  </tr>
				   <tr>
					<td>难度：</td>
					<td><input type="text" name="diffculty" size="20" value="${question.diffculty}"></td>
				  </tr>
				   <tr>
					<td>考点:</td>
					<td><input type="text" name="testCenture" size="20" value="${question.testCenture}"></td>
				  </tr>
				 				  <tr>
				  	<td colspan="2"><div align="center">
				  	  <input type="submit" value="录入">				  	  
				  	  <input type="reset" value="重置">
			  	  </div>
				</td>
				  </tr>
			</table>
			</form>	
  
  
  </body>
</html>
