<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>



<html>
  <head>


  </head>
  
  <body>
  <form action="optionUpadate.action" method="post">
				<table border="0" cellspacing="10" cellpadding="0">
					<tr>
						<td colspan="2"><s:actionmessage/></td>
					</tr>
				  <tr>
					<td>������Ŀ:</td>
					<td>
						<input name="id" type="hidden" value="${option.id}">
						<input name="title" type="text" size="80"  value="${option.title}">
					</td>
				  </tr>
				    <tr>
					<td>ѡ��A:</td>
					<td>
						
						<input name="optionA" type="text" size="80"  value="${option.optionA}">
					</td>
				  </tr>
					<td>ѡ��B:</td>
					<td>
						
						<input name="optionB" type="text" size="80"  value="${option.optionB}">
					</td>
					<tr>
					<td>ѡ��C:</td>
					<td>
						
						<input name="optionC" type="text" size="80"  value="${option.optionC}">
					</td>
				  </tr>
				  <tr>
				  	<td>ѡ��D:</td>
					<td>
						
						<input name="optionD" type="text" size="80"  value="${option.optionD}">
					</td>
				  </tr>
				  
				  <tr>
					<td>�𰸣�</td>
					<td><input type="text" name="answer" size="20" value="${option.answer}"></td>
				  </tr>
				    <tr>
					<td>������</td>
					<td><input type="text" name="prase" size="60" value="${option.prase}"></td>
				  </tr>
				   <tr>
					<td>�Ѷȣ�</td>
					<td><input type="text" name="diffculty" size="20" value="${option.diffculty}"></td>
				  </tr>
				   <tr>
					<td>����:</td>
					<td><input type="text" name="testCenter" size="20" value="${option.testCenter}"></td>
				  </tr>
				 				  <tr>
				  	<td colspan="2"><div align="center">
				  	  <input type="submit" value="¼��">				  	  
				  	  <input type="reset" value="����">
			  	  </div>
				</td>
				  </tr>
			</table>
			</form>	
  </body>
</html>
