package com.examsystem.action;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import com.examsystem.po.Question;
import com.examsystem.service.QuestionService;
import com.examsystem.service.QuestionServiceImpl;
public class QuestionParticularAction extends ActionSupport{
	private int id;
	private QuestionService questionService=new QuestionServiceImpl();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String execute() throws Exception {
		Question question = questionService.showQuestionParticular(id);
		ServletActionContext.getRequest().setAttribute("question", question);
		return SUCCESS;
	}
}	
