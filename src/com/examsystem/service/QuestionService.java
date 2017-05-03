package com.examsystem.service;

import java.util.List;

import com.examsystem.po.Question;
import com.examsystem.util.Page;
import com.examsystem.util.PageResult;

public interface QuestionService {
	public boolean saveQuestion(Question question) ;
	
	public PageResult queryQuestionByPage(Page page);
	// �鿴������ϸ��Ϣ
	public Question showQuestionParticular(int id);
	// ����������Ϣ
	public void updateQuestion(Question question);
	// ɾ��������Ϣ
	public void deleteQuestion(int id);
	//ģ����ѯ������Ϣ
	public PageResult likeQueryByQuestionTitle(String title,Page page);
	//�����ѯ�����¼
	public List<Question> randomFindQuestion(int number);
	//����ѧ���÷�
	public List<Question> findAllQuestion();
	//�������м�����Ϣ
	//public int accountResult(List<Integer> ids,List<String> studentAnswers);
}
