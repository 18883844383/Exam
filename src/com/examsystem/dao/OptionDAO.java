package com.examsystem.dao;


import java.util.List;

import com.examsystem.po.Question;
import com.examsystem.po.Test;
import com.examsystem.util.Page;

public interface OptionDAO {
	public void addOption(Test test);//���淽����������������
	
	public Test findOptionByTitle(String title);//������������������
	public List<Test> findOptionByPage(Page page);//��ҳ��ѯ����
	public int findOptionCount();//��ѯ��������
	public Test findOptionByID(int id);//��������ID��������
	public void updateOption(Test option);//���·�����������������
	public void deleteOption(int id);//��������IDɾ������
	public List<Test> likeQueryByTitle(String title,Page page);//�����������ģ����ѯ����
	public int findLinkQueryCount(String title);//��ѯģ����¼��
	public List<Test> randomFindOption(int number);//��ʱȡ����¼
	public List<Question> findAllQuestion();
}
