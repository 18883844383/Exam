<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
  <head>
    
    <title>ѡ����������</title>
    


  </head>
  
  <body>
  <div id="manageSubject" align="center"><!--��������-->
			<table width="95%" cellspacing="10">
				  <tr align="center">
					<td>������</td>
					<td>�������</td>
					<td>��ȷ��</td>
					<td>�Ѷ�</td>
					
					<td>����</td>
					<td>�鿴����</td>
					<td>��������</td>
					<td>ɾ������</td>
				  </tr>
				  <s:iterator value="#request.options" var="option">
				  	 <tr align="center">
							<td>${option.id}</td>
							<td align="left">${option.title}</td>
							<td>${option.answer}</td>
							<td>${option.diffculty} </td>
							<td>${option.testCenter}</td>
							<td><a href="optionParticular.action?id=${option.id}">�鿴</a></td>
							<td><a href="optionUpadateBefore.action?id=${option.id}">����</a></td>
							<td><a href="optionDelete?id=${option.id}">ɾ��</a></td>
					  </tr>
				  </s:iterator>	
				  <tr>
				  	<td colspan="6" align="center">
				  		��${page.totalCount}����¼����ǰ��${page.currentPage}/${page.totalPage}ҳ��ÿҳ${page.everyPage}����¼
				  	<s:if test="#request.page.hasPrePage">
                		<a href="OptionQuery.action?currentPage=1">��ҳ</a> | 
                		<a href="OptionQuery.action?currentPage=${page.currentPage - 1}">��һҳ</a> | 
               		</s:if>
               		<s:else>
               		��ҳ | ��һҳ | 
               		</s:else>
               		<s:if test="#request.page.hasNextPage">
                		<a href="OptionQuery.action?currentPage=${page.currentPage + 1}">��һҳ</a> | 
                		<a href="OptionQuery.action?currentPage=${page.totalPage}">βҳ</a>
               		</s:if>
               		<s:else>
               		��һҳ | βҳ
               		</s:else>
				  	</td>
				  </tr>	  
			</table>	
			</div>
  
  </body>
</html>
