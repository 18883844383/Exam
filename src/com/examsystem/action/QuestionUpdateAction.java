package com.examsystem.action;

import org.apache.struts2.ServletActionContext;

import com.examsystem.po.Question;
import com.examsystem.service.QuestionService;
import com.examsystem.service.QuestionServiceImpl;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
public class QuestionUpdateAction extends ActionSupport {
	private int id;
	private String title;
	private String answer;
	private String diffculty;
	private String testCenture;
	private QuestionService questionService=new QuestionServiceImpl();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getDiffculty() {
		return diffculty;
	}
	public void setDiffculty(String diffculty) {
		this.diffculty = diffculty;
	}
	public String getTestCenture() {
		return testCenture;
	}
	public void setTestCenture(String testCenture) {
		this.testCenture = testCenture;
	}

	public String execute() throws Exception {
		Question question=new Question();
		
		question.setId(id);
		question.setAnswer(answer);
		question.setDiffculty(diffculty);
		question.setTestCenture(testCenture);
		question.setTitle(title);
		questionService.updateQuestion(question);
		ServletActionContext.getRequest().setAttribute("question", question);
		this.addActionMessage("更新成功!");
		return SUCCESS;
	}
	
}
