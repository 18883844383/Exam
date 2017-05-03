package com.examsystem.action;

import com.examsystem.po.Test;
import com.examsystem.service.OptionService;
import com.examsystem.service.OptionServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
public class getRandomOption extends ActionSupport {
	private OptionService optionService=new OptionServiceImpl();
	
	public String execute() throws Exception {
			List<Test> options=optionService.randomFindOption(15);
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("options", options);
			return SUCCESS;
	}
}
