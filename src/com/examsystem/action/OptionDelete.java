package com.examsystem.action;

import com.examsystem.service.OptionService;
import com.examsystem.service.OptionServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class OptionDelete extends ActionSupport{
	private int id;
	private OptionService optionService=new OptionServiceImpl();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String execute() throws Exception {
		optionService.deleteOption(id);
		return SUCCESS;
	}

}
