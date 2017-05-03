package com.examsystem.service;

import java.util.List;

import com.examsystem.po.Question;
import com.examsystem.po.Test;

import com.examsystem.service.OptionService;
import com.examsystem.dao.OptionDAO;
import com.examsystem.dao.OptionDAOImpl;

import com.examsystem.util.Page;
import com.examsystem.util.PageResult;
import com.examsystem.util.PageUtil;



public class OptionServiceImpl implements OptionService {
	private OptionDAO optionDAO =  new OptionDAOImpl();
	public boolean saveOption(Test test) {
	
		 //如果该试题标题不存在，允许添加
			optionDAO.addOption(test);
			return true;
	}
	
	public PageResult queryOptionByPage(Page page) {
		page = PageUtil.createPage(page.getEveryPage(),
				optionDAO.findOptionCount(),page.getCurrentPage());//根据总记录数创建分页信息
		List<Test> list = optionDAO.findOptionByPage(page);//通过分页信息取得试题
		PageResult result = new PageResult(page,list);//封装分页信息和记录信息，返回给调用处
		return result;
	}

	public 	Test showOptionParticular(int id) {
		return optionDAO.findOptionByID(id);
	}
	
	public void updateOption(Test question) {
		optionDAO.updateOption(question);
	}
	
	public void deleteOption(int id) {
		optionDAO.deleteOption(id);
	}
	
	public PageResult likeQueryByOptionTitle(String title, Page page) {
		page = PageUtil.createPage(page.getEveryPage(),
				optionDAO.findLinkQueryCount(title),page.getCurrentPage());//根据总记录数创建分页信息
		List<Test> list = optionDAO.likeQueryByTitle(title, page);//通过分页信息模糊查询试题
		PageResult result = new PageResult(page,list);//封装分页信息和记录信息，返回给调用处
		return result;
	}
	
	public List<Test> randomFindOption(int number) {
		return optionDAO.randomFindOption(number);
	}

	@Override
	public List<Test> findAllOption() {
		// TODO Auto-generated method stub
		return null;
	}
	}
	

	
		

