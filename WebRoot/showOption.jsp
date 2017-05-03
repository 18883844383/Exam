<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>



<html>
  <head>
    
    
    <title>题目具体信息</title>
    


  </head>
  
  <body>
   <div id="showSubject" align="center"><!--显示试题-->
			<table border="0" cellspacing="10" cellpadding="0">
				  <tr>
				    <td>试题编号:</td>
				    <td>${option.id}</td>
			    </tr>
				  <tr>
					<td>试题题目:</td>
					<td>${option.title}</td>
				  </tr>
				  <tr>
					<td>选项A:</td>
					<td>${option.optionA}</td>
				  </tr>
				   <tr>
					<td>选项B:</td>
					<td>${option.optionB}</td>
				  </tr>
				   <tr>
					<td>选项C:</td>
					<td>${option.optionC}</td>
				  </tr>
				   <tr>
					<td>选项D:</td>
					<td>${option.optionD}</td>
				  </tr>
				   <tr>
					<td>答案:</td>
					<td>${option.answer}</td>
				  </tr>
				   <tr>
					<td>难度:</td>
					<td>${option.diffculty}</td>
				  </tr>
				   <tr>
					<td>考点:</td>
					<td>${option.testCenter}</td>
				  </tr>
				  <tr>
					<td valign="top">答案解析:</td>
					<td valign="top">${option.prase}</td>
				  </tr>
			</table>
			</div>
  </body>
</html>
