<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <title>�鿴����</title>
    

  </head>
  
  <body>
   <table border="0" cellspacing="10" cellpadding="0">
				  <tr>
				    <td>������:</td>
				    <td>${question.id}</td>
			    </tr>
				  <tr>
					<td>������Ŀ:</td>
					<td>${question.title}</td>
				  </tr>
				  <tr>
					<td>��</td>
					<td>${question.answer}</td>
				  </tr>
				   <tr>
					<td>�Ѷ�</td>
					<td>${question.diffculty}</td>
				  </tr>
				   <tr>
					<td>����</td>
					<td>${question.testCenture}</td>
				  </tr>
				
			</table>
  </body>
</html>
