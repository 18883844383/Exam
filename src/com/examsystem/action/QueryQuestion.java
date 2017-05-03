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
		page.setEveryPage(10);//ÿҳ��ʾ10����¼
		page.setCurrentPage(currentPage);//���õ�ǰҳ
		PageResult pageResult = questionService.queryQuestionByPage(page);
		List<Question> questions = pageResult.getList();//��������¼
		page = pageResult.getPage();//��÷�ҳ��Ϣ
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("questions", questions);
		request.setAttribute("page", page);
		return SUCCESS;
	}

}
