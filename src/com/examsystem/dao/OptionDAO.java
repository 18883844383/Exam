package com.examsystem.dao;


import java.util.List;

import com.examsystem.po.Question;
import com.examsystem.po.Test;
import com.examsystem.util.Page;

public interface OptionDAO {
	public void addOption(Test test);//保存方法，用来保存试题
	
	public Test findOptionByTitle(String title);//根据试题标题查找试题
	public List<Test> findOptionByPage(Page page);//分页查询试题
	public int findOptionCount();//查询试题总量
	public Test findOptionByID(int id);//根据试题ID查找试题
	public void updateOption(Test option);//更新方法，用来更新试题
	public void deleteOption(int id);//根据试题ID删除试题
	public List<Test> likeQueryByTitle(String title,Page page);//根据试题标题模糊查询试题
	public int findLinkQueryCount(String title);//查询模糊记录数
	public List<Test> randomFindOption(int number);//随时取出记录
	public List<Question> findAllQuestion();
}
