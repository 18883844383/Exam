<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
  <head>
    
    <title>选择题管理界面</title>
    


  </head>
  
  <body>
  <div id="manageSubject" align="center"><!--管理试题-->
			<table width="95%" cellspacing="10">
				  <tr align="center">
					<td>试题编号</td>
					<td>试题标题</td>
					<td>正确答案</td>
					<td>难度</td>
					
					<td>考点</td>
					<td>查看试题</td>
					<td>更新试题</td>
					<td>删除试题</td>
				  </tr>
				  <s:iterator value="#request.options" var="option">
				  	 <tr align="center">
							<td>${option.id}</td>
							<td align="left">${option.title}</td>
							<td>${option.answer}</td>
							<td>${option.diffculty} </td>
							<td>${option.testCenter}</td>
							<td><a href="optionParticular.action?id=${option.id}">查看</a></td>
							<td><a href="optionUpadateBefore.action?id=${option.id}">更新</a></td>
							<td><a href="optionDelete?id=${option.id}">删除</a></td>
					  </tr>
				  </s:iterator>	
				  <tr>
				  	<td colspan="6" align="center">
				  		共${page.totalCount}条纪录，当前第${page.currentPage}/${page.totalPage}页，每页${page.everyPage}条纪录
				  	<s:if test="#request.page.hasPrePage">
                		<a href="OptionQuery.action?currentPage=1">首页</a> | 
                		<a href="OptionQuery.action?currentPage=${page.currentPage - 1}">上一页</a> | 
               		</s:if>
               		<s:else>
               		首页 | 上一页 | 
               		</s:else>
               		<s:if test="#request.page.hasNextPage">
                		<a href="OptionQuery.action?currentPage=${page.currentPage + 1}">下一页</a> | 
                		<a href="OptionQuery.action?currentPage=${page.totalPage}">尾页</a>
               		</s:if>
               		<s:else>
               		下一页 | 尾页
               		</s:else>
				  	</td>
				  </tr>	  
			</table>	
			</div>
  
  </body>
</html>
