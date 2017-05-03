package com.examsystem.dao;

import java.util.List;

import com.examsystem.po.Question;

import com.examsystem.util.Page;



public interface QuestionDAO {
	public void addQuestion(Question question);//���淽����������������
	public Question findQuestionByTitle(String title);//������������������
	public List<Question> findQuestionByPage(Page page);//��ҳ��ѯ����
	public int findQuestionCount();//��ѯ��������
	public Question findQuestionByID(int id);//��������ID��������
	public void updateQuestion(Question question);//���·�����������������
	public void deleteQuestion(int id);//��������IDɾ������
	public List<Question> likeQueryByTitle(String title,Page page);//�����������ģ����ѯ����
	public int findLinkQueryCount(String title);//��ѯģ����¼��
	public List<Question> randomFindQuestion(int number);//��ʱȡ����¼
	public List<Question> findAllQuestion();
}
