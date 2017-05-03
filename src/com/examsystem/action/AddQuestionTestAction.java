package com.examsystem.action;
import java.util.Map;

import com.examsystem.po.Question;
import com.examsystem.service.QuestionService;
import com.examsystem.service.QuestionServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class AddQuestionTestAction extends ActionSupport {
	private String test_diffculty;
	private int subject;

	private String testCenter;

	private String test_type;
	private String answer;
	private String title;
	private QuestionService questionService = new QuestionServiceImpl();

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTest_type() {
		return test_type;
	}

	public void setTest_type(String test_type) {
		this.test_type = test_type;
	}

	public String getTestCenter() {
		return testCenter;
	}

	public void setTestCenter(String testCenter) {
		this.testCenter = testCenter;
	}

	public int getSubject() {
		return subject;
	}

	public void setSubject(int subject) {
		this.subject = subject;
	}

	public String getTest_diffculty() {
		return test_diffculty;
	}

	public void setTest_diffculty(String test_diffculty) {
		this.test_diffculty = test_diffculty;
	}


	
	public String execute() throws Exception {
		Map session = ActionContext.getContext().getSession();
		//session.put("testtype", test_type);
		Question question=new Question();
		question.setDiffculty(test_diffculty);
		question.setObjectId(subject);
		question.setTestCenture(testCenter);
		question.setAnswer(answer);
		question.setTitle(title);
		//System.out.println("ss:"+testCenter+"sss:"+answer+"qq:"+title);
		if(questionService.saveQuestion(question)) {
			return SUCCESS;}
		else
			return INPUT;
	}

}
	
	
	
	
	
	
	
	
	
	
	

