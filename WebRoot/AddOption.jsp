<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>试题导入-选择题</title>
    

  </head>
  
  <body>
    	
     <s:form action="addOptionTest" method="post">
     <s:select name="diffculty" label="试题难度" labelposition="left"
	 list="#{'easy':'简单','middle':'中等','diffcult':'困难'}"
	 listKey='value' listValue="value"/>
	 <s:select name="subject" label="所属科目"labelposition="left"
	 list="#{'1':'数学','2':'网络'}"
	 listKey='key' listValue="value"/>
 	<s:textfield name="testCenter" label="考点" escape="false"/>
 
	 <s:textfield name="title" label="试题题目" size="80"/>
	 <s:textfield name="OptionA" label="选项A"/>
	 <s:textfield name="OptionB" label="选项B"/>
	 <s:textfield name="OptionC" label="选项C"/>
	 <s:textfield name="OptionD" label="选项D"/>
	
	 	<s:select name="answer" label="正确答案" labelposition="left"
	 list="#{'A':'A','B':'B','C':'C','D':'D'}"
	 listKey='key' listValue="value"/>
	 <s:textarea cols="76" rows="10" label="答案解析" name="prase"/>
	<s:submit value="录入"/> 
	<s:submit type="reset" value="重置"/>
	 </s:form>
  </body>
</html>
