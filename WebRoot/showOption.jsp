<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>



<html>
  <head>
    
    
    <title>��Ŀ������Ϣ</title>
    


  </head>
  
  <body>
   <div id="showSubject" align="center"><!--��ʾ����-->
			<table border="0" cellspacing="10" cellpadding="0">
				  <tr>
				    <td>������:</td>
				    <td>${option.id}</td>
			    </tr>
				  <tr>
					<td>������Ŀ:</td>
					<td>${option.title}</td>
				  </tr>
				  <tr>
					<td>ѡ��A:</td>
					<td>${option.optionA}</td>
				  </tr>
				   <tr>
					<td>ѡ��B:</td>
					<td>${option.optionB}</td>
				  </tr>
				   <tr>
					<td>ѡ��C:</td>
					<td>${option.optionC}</td>
				  </tr>
				   <tr>
					<td>ѡ��D:</td>
					<td>${option.optionD}</td>
				  </tr>
				   <tr>
					<td>��:</td>
					<td>${option.answer}</td>
				  </tr>
				   <tr>
					<td>�Ѷ�:</td>
					<td>${option.diffculty}</td>
				  </tr>
				   <tr>
					<td>����:</td>
					<td>${option.testCenter}</td>
				  </tr>
				  <tr>
					<td valign="top">�𰸽���:</td>
					<td valign="top">${option.prase}</td>
				  </tr>
			</table>
			</div>
  </body>
</html>
