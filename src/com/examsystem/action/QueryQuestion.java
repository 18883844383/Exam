package com.examsystem.action;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.examsystem.po.Question;
import com.examsystem.service.QuestionService;
import com.examsystem.service.QuestionServiceImpl;
import com.examsystem.util.PageUtil;
import com.opensymphony.xwork2.ActionSupport;

import com.examsystem.util.Page;
import com.examsystem.util.PageResult;


public class QueryQuestion extends ActionSupport {
	private int currentPage;
	private QuestionService questionService=new QuestionServiceImpl();
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
		PageResult pageResult = questionService.queryQuestionByPage(page);
		List<Question> questions = pageResult.getList();//获得试题记录
		page = pageResult.getPage();//获得分页信息
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("questions", questions);
		request.setAttribute("page", page);
		return SUCCESS;
	}

}
