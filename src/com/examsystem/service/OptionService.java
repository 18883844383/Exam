package com.examsystem.service;

import java.util.List;


import com.examsystem.po.Question;
import com.examsystem.po.Test;

import com.examsystem.util.Page;
import com.examsystem.util.PageResult;
public interface OptionService {
	public boolean saveOption(Test test) ;
	
	public PageResult queryOptionByPage(Page page);
	// �鿴������ϸ��Ϣ
	public Test showOptionParticular(int id);
	// ����������Ϣ
	public void updateOption(Test question);
	// ɾ��������Ϣ
	public void deleteOption(int id);
	//ģ����ѯ������Ϣ
	public PageResult likeQueryByOptionTitle(String title,Page page);
	//�����ѯ�����¼
	public List<Test> randomFindOption(int number);
	//����ѧ���÷�
	public List<Test> findAllOption();
	
}
