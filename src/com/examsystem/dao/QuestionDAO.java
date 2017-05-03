package com.examsystem.dao;

import java.util.List;

import com.examsystem.po.Question;

import com.examsystem.util.Page;



public interface QuestionDAO {
	public void addQuestion(Question question);//保存方法，用来保存试题
	public Question findQuestionByTitle(String title);//根据试题标题查找试题
	public List<Question> findQuestionByPage(Page page);//分页查询试题
	public int findQuestionCount();//查询试题总量
	public Question findQuestionByID(int id);//根据试题ID查找试题
	public void updateQuestion(Question question);//更新方法，用来更新试题
	public void deleteQuestion(int id);//根据试题ID删除试题
	public List<Question> likeQueryByTitle(String title,Page page);//根据试题标题模糊查询试题
	public int findLinkQueryCount(String title);//查询模糊记录数
	public List<Question> randomFindQuestion(int number);//随时取出记录
	public List<Question> findAllQuestion();
}
