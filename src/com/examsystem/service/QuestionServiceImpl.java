package com.examsystem.service;

import java.util.List;

import com.examsystem.po.Question;
import com.examsystem.service.QuestionService;
import com.examsystem.dao.QuestionDAO;
import com.examsystem.dao.QuestionDAOImpl;
import com.examsystem.util.Page;
import com.examsystem.util.PageResult;
import com.examsystem.util.PageUtil;


public class QuestionServiceImpl implements QuestionService {
	private QuestionDAO questionDAO =  new QuestionDAOImpl();
	public boolean saveQuestion(Question question) {
		String questionTile = question.getTitle();
		 //如果该试题标题不存在，允许添加
			questionDAO.addQuestion(question);
			return true;
	}
	
	public PageResult queryQuestionByPage(Page page) {
		page = PageUtil.createPage(page.getEveryPage(),
				questionDAO.findQuestionCount(),page.getCurrentPage());//根据总记录数创建分页信息
		List<Question> list = questionDAO.findQuestionByPage(page);//通过分页信息取得试题
		PageResult result = new PageResult(page,list);//封装分页信息和记录信息，返回给调用处
		return result;
	}
	
	public Question showQuestionParticular(int id) {
		return questionDAO.findQuestionByID(id);
	}
	
	public void updateQuestion(Question question) {
		questionDAO.updateQuestion(question);
	}
	public void deleteQuestion(int id) {
		questionDAO.deleteQuestion(id);
	}
	
	public PageResult likeQueryByQuestionTitle(String title, Page page) {
		page = PageUtil.createPage(page.getEveryPage(),
				questionDAO.findLinkQueryCount(title),page.getCurrentPage());//根据总记录数创建分页信息
		List<Question> list = questionDAO.likeQueryByTitle(title, page);//通过分页信息模糊查询试题
		PageResult result = new PageResult(page,list);//封装分页信息和记录信息，返回给调用处
		return result;
	}
	

	public List<Question> randomFindQuestion(int number) {
		return questionDAO.randomFindQuestion(number);
	}
	public List<Question> findAllQuestion(){
		return questionDAO.findAllQuestion();
	}



}
