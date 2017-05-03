package com.examsystem.service;

import java.util.List;

import com.examsystem.po.Question;
import com.examsystem.util.Page;
import com.examsystem.util.PageResult;

public interface QuestionService {
	public boolean saveQuestion(Question question) ;
	
	public PageResult queryQuestionByPage(Page page);
	// 查看试题详细信息
	public Question showQuestionParticular(int id);
	// 更新试题信息
	public void updateQuestion(Question question);
	// 删除试题信息
	public void deleteQuestion(int id);
	//模糊查询试题信息
	public PageResult likeQueryByQuestionTitle(String title,Page page);
	//随机查询试题记录
	public List<Question> randomFindQuestion(int number);
	//计算学生得分
	public List<Question> findAllQuestion();
	//查找所有简单题信息
	//public int accountResult(List<Integer> ids,List<String> studentAnswers);
}
