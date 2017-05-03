<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
>
    
    <title>试题管理!</title>
    


  </head>
  
  <body>
    This is my JSP page. <br>
    <table width="95%" cellspacing="10">
				  <tr align="center">
					<td>试题编号</td>
					<td>试题标题</td>
					
					<td>查看试题</td>
					<td>更新试题</td>
					<td>删除试题</td>
				  </tr>
				  <s:iterator value="#request.questions" var="question">
				  	 <tr align="center">
							<td>${question.id}</td>
							<td align="left">${question.title}</td>
							
							<td><a href="questionParticular.action?id=${question.id}">查看</a></td>
							<td><a href="questionUpadateBefore.action?id=${question.id}">更新</a></td>
							<td><a href="questionDelete?id=${question.id}">删除</a></td>
					  </tr>
				  </s:iterator>	
				  <tr>
				  	<td colspan="6" align="center">
				  		共${page.totalCount}条纪录，当前第${page.currentPage}/${page.totalPage}页，每页${page.everyPage}条纪录
				  	<s:if test="#request.page.hasPrePage">
                		<a href="questionQuery.action?currentPage=1">首页</a> | 
                		<a href="questionQuery.action?currentPage=${page.currentPage - 1}">上一页</a> | 
               		</s:if>
               		<s:else>
               		首页 | 上一页 | 
               		</s:else>
               		<s:if test="#request.page.hasNextPage">
                		<a href="questionQuery.action?currentPage=${page.currentPage + 1}">下一页</a> | 
                		<a href="questionQuery.action?currentPage=${page.totalPage}">尾页</a>
               		</s:if>
               		<s:else>
               		下一页 | 尾页
               		</s:else>
				  	</td>
				  </tr>	  
			</table>	
  </body>
</html>
