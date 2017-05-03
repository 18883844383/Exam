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
		 //�����������ⲻ���ڣ��������
			questionDAO.addQuestion(question);
			return true;
	}
	
	public PageResult queryQuestionByPage(Page page) {
		page = PageUtil.createPage(page.getEveryPage(),
				questionDAO.findQuestionCount(),page.getCurrentPage());//�����ܼ�¼��������ҳ��Ϣ
		List<Question> list = questionDAO.findQuestionByPage(page);//ͨ����ҳ��Ϣȡ������
		PageResult result = new PageResult(page,list);//��װ��ҳ��Ϣ�ͼ�¼��Ϣ�����ظ����ô�
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
				questionDAO.findLinkQueryCount(title),page.getCurrentPage());//�����ܼ�¼��������ҳ��Ϣ
		List<Question> list = questionDAO.likeQueryByTitle(title, page);//ͨ����ҳ��Ϣģ����ѯ����
		PageResult result = new PageResult(page,list);//��װ��ҳ��Ϣ�ͼ�¼��Ϣ�����ظ����ô�
		return result;
	}
	

	public List<Question> randomFindQuestion(int number) {
		return questionDAO.randomFindQuestion(number);
	}
	public List<Question> findAllQuestion(){
		return questionDAO.findAllQuestion();
	}



}
