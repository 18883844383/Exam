package com.examsystem.action;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import com.examsystem.po.Question;
import com.examsystem.service.QuestionService;
import com.examsystem.service.QuestionServiceImpl;
import com.opensymphony.xwork2.ActionSupport;


public class getAllQuestion extends  ActionSupport {
	private QuestionService questionService=new QuestionServiceImpl();
	public String execute() throws Exception {
		List<Question> questions=questionService.findAllQuestion();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("questions", questions);
		return SUCCESS;
		
	}
	
}
