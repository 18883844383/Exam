<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>���⵼��-ѡ����</title>
    

  </head>
  
  <body>
    	
     <s:form action="addOptionTest" method="post">
     <s:select name="diffculty" label="�����Ѷ�" labelposition="left"
	 list="#{'easy':'��','middle':'�е�','diffcult':'����'}"
	 listKey='value' listValue="value"/>
	 <s:select name="subject" label="������Ŀ"labelposition="left"
	 list="#{'1':'��ѧ','2':'����'}"
	 listKey='key' listValue="value"/>
 	<s:textfield name="testCenter" label="����" escape="false"/>
 
	 <s:textfield name="title" label="������Ŀ" size="80"/>
	 <s:textfield name="OptionA" label="ѡ��A"/>
	 <s:textfield name="OptionB" label="ѡ��B"/>
	 <s:textfield name="OptionC" label="ѡ��C"/>
	 <s:textfield name="OptionD" label="ѡ��D"/>
	
	 	<s:select name="answer" label="��ȷ��" labelposition="left"
	 list="#{'A':'A','B':'B','C':'C','D':'D'}"
	 listKey='key' listValue="value"/>
	 <s:textarea cols="76" rows="10" label="�𰸽���" name="prase"/>
	<s:submit value="¼��"/> 
	<s:submit type="reset" value="����"/>
	 </s:form>
  </body>
</html>
