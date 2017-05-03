package com.examsystem.action;

import java.util.Map;


import com.examsystem.po.Test;

import com.examsystem.service.OptionService;
import com.examsystem.service.OptionServiceImpl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;



public class AddOptionTestAction extends ActionSupport  {
	private String diffculty;
	private int subject;
	private String testCenter;
	
	private String answer;
	private String title;
	private String prase;// ‘Ã‚Ω‚Œˆ
	private String OptionA;
	private String OptionB;
	private String OptionC;
	private String OptionD;
	
	private OptionService optionService = new OptionServiceImpl();

	

	public String getDiffculty() {
		return diffculty;
	}
	public void setDiffculty(String diffculty) {
		this.diffculty = diffculty;
	}
	public int getSubject() {
		return subject;
	}
	public void setSubject(int subject) {
		this.subject = subject;
	}
	public String getTestCenter() {
		return testCenter;
	}
	public void setTestCenter(String testCenter) {
		this.testCenter = testCenter;
	}

	

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
	public String getPrase() {
		return prase;
	}
	public void setPrase(String prase) {
		this.prase = prase;
	}
	public String getOptionA() {
		return OptionA;
	}
	public void setOptionA(String optionA) {
		OptionA = optionA;
	}
	public String getOptionB() {
		return OptionB;
	}
	public void setOptionB(String optionB) {
		OptionB = optionB;
	}
	public String getOptionC() {
		return OptionC;
	}
	public void setOptionC(String optionC) {
		OptionC = optionC;
	}
	public String getOptionD() {
		return OptionD;
	}
	public void setOptionD(String optionD) {
		OptionD = optionD;
	}
	public String execute() throws Exception {
		Test test=new Test();
		test.setAnswer(answer);
		test.setDiffculty(diffculty);
		test.setObjectId(subject);
		test.setOptionA(OptionA);
		test.setOptionB(OptionB);
		test.setOptionC(OptionC);
		test.setOptionD(OptionD);
		test.setPrase(prase);
		test.setTestCenter(testCenter);
		test.setTitle(title);
			
		/*System.out.println("1:"+answer);
		System.out.println("2:"+diffculty);
		System.out.println("3:"+OptionA);
		System.out.println("4:"+OptionB);
		System.out.println("5:"+OptionC);
		System.out.println("6:"+OptionD);
		System.out.println("7:"+prase);
		System.out.println("8:"+subject);
		System.out.println("9:"+testCenter);
		System.out.println("10:"+title);*/
		if(optionService.saveOption(test))
			return SUCCESS;
		else
		return INPUT;
		
		
	}

}
