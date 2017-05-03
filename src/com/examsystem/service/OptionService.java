package com.examsystem.service;

import java.util.List;


import com.examsystem.po.Question;
import com.examsystem.po.Test;

import com.examsystem.util.Page;
import com.examsystem.util.PageResult;
public interface OptionService {
	public boolean saveOption(Test test) ;
	
	public PageResult queryOptionByPage(Page page);
	// 查看试题详细信息
	public Test showOptionParticular(int id);
	// 更新试题信息
	public void updateOption(Test question);
	// 删除试题信息
	public void deleteOption(int id);
	//模糊查询试题信息
	public PageResult likeQueryByOptionTitle(String title,Page page);
	//随机查询试题记录
	public List<Test> randomFindOption(int number);
	//计算学生得分
	public List<Test> findAllOption();
	
}
