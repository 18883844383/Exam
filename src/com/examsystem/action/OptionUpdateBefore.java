package com.examsystem.action;

import org.apache.struts2.ServletActionContext;

import com.examsystem.po.Question;
import com.examsystem.po.Test;
import com.examsystem.service.OptionService;
import com.examsystem.service.OptionServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class OptionUpdateBefore extends ActionSupport {
	private int id;
	private OptionService optionService=new OptionServiceImpl();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String execute() throws Exception {
		Test option = optionService.showOptionParticular(id);
		ServletActionContext.getRequest().setAttribute("option", option);
		return SUCCESS;
	}
}
