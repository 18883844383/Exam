package com.examsystem.action;
import com.examsystem.service.QuestionService;
import com.examsystem.service.QuestionServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class QuestionDelete  extends ActionSupport{
	private int id;
	private QuestionService questionService=new QuestionServiceImpl();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String execute() throws Exception {
		questionService.deleteQuestion(id);
		return SUCCESS;
	}
}
