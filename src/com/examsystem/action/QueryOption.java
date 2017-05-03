package com.examsystem.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.examsystem.po.Test;
import com.examsystem.service.OptionService;
import com.examsystem.service.OptionServiceImpl;
import com.examsystem.util.Page;
import com.examsystem.util.PageResult;
import com.opensymphony.xwork2.ActionSupport;

public class QueryOption extends ActionSupport{
	private int currentPage;
	private OptionService optionService=new OptionServiceImpl();
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public String execute() throws Exception {
		Page page = new Page();
		page.setEveryPage(10);//每页显示10条记录
		page.setCurrentPage(currentPage);//设置当前页
		PageResult pageResult = optionService.queryOptionByPage(page);
		List<Test> options = pageResult.getList();//获得试题记录
		page = pageResult.getPage();//获得分页信息
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("options", options);
		request.setAttribute("page", page);
		return SUCCESS;
	}

}
