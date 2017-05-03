package com.examsystem.action;

import org.apache.struts2.ServletActionContext;

import com.examsystem.po.Test;
import com.examsystem.service.OptionService;
import com.examsystem.service.OptionServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class OptionUpdateAction extends ActionSupport{
	private int id;
	private String title;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String answer;
	private String prase;
	private String diffculty;
	private int objectId;
	private String testCenter;
	private OptionService optionService=new OptionServiceImpl();
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
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	public String getOptionD() {
		return optionD;
	}
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getPrase() {
		return prase;
	}
	public void setPrase(String prase) {
		this.prase = prase;
	}
	public String getDiffculty() {
		return diffculty;
	}
	public void setDiffculty(String diffculty) {
		this.diffculty = diffculty;
	}
	public int getObjectId() {
		return objectId;
	}
	public void setObjectId(int objectId) {
		this.objectId = objectId;
	}
	public String getTestCenter() {
		return testCenter;
	}
	public void setTestCenter(String testCenter) {
		this.testCenter = testCenter;
	}
	
	public String execute() throws Exception {
		Test option=new Test();
		option.setAnswer(answer);
		option.setDiffculty(diffculty);
		option.setId(id);
		option.setObjectId(objectId);
		option.setOptionA(optionA);
		option.setOptionB(optionB);
		option.setOptionC(optionC);
		option.setOptionD(optionD);
		option.setPrase(prase);
		option.setTestCenter(testCenter);
		option.setTitle(title);
		optionService.updateOption(option);
		ServletActionContext.getRequest().setAttribute("option", option);
		this.addActionMessage("更新成功!");
		return SUCCESS;
		
		
		
	}
}
