package com.examsystem.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.examsystem.hibernate.HibernateSessionFactory;

import com.examsystem.po.Question;
import com.examsystem.po.Test;
import com.examsystem.util.Page;


public class OptionDAOImpl implements OptionDAO {
	public void addOption(Test test){
		Session session = HibernateSessionFactory.getSession();//���Session����
		Transaction  transaction = null;//����һ���������
		try{
			transaction = session.beginTransaction();//��������
			session.persist(test);
			transaction.commit();//�ύ����
		}catch(Exception ex) {
			ex.printStackTrace();
			//transaction.rollback();//����ع�
		}
		HibernateSessionFactory.closeSession();//�ر�Session����
	}
	
	public Test findOptionByTitle(String questionTitle) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Query query = session.createQuery("from Test as sub where sub.title = ?");
		query.setString(0, questionTitle);
		List list = query.list();					//��ѯ������浽list��
		HibernateSessionFactory.closeSession();		//�ر�Session����
		if(list.size() == 0) {
			return null;							//����null
		}else {
			return (Test) list.get(0);			//���ص�һ������
		}
	}
	
	public List<Test> findOptionByPage(Page page) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Query query = session.createQuery("from Test");
		query.setMaxResults(page.getEveryPage());//���ò�ѯ��¼��
		query.setFirstResult(page.getBeginIndex());//���ò�ѯ��¼��ʼλ��
		List list = query.list();					//��ѯ������浽list��
		HibernateSessionFactory.closeSession();//�ر�Session����
		return list;
	}
	
	public int findOptionCount() {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Query query = session.createQuery("from Test");
		List list = query.list();					//��ѯ������浽list��
		int count = list.size();
		HibernateSessionFactory.closeSession();//�ر�Session����
		return count;
	}
	
	public Test findOptionByID(int Id) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Test option = (Test) session.get(Test.class, Id);
		HibernateSessionFactory.closeSession();		//�ر�Session����
		return option;
	}
	
	public void updateOption(Test option) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Transaction  transaction = null;//����һ���������
		try{
			transaction = session.beginTransaction();//��������
			session.update(option);//����������Ϣ
			transaction.commit();//�ύ����
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//����ع�
		}
		HibernateSessionFactory.closeSession();//�ر�Session����
	}
	
	public void deleteOption(int id) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Test option = (Test) session.get(Test.class, id);
		Transaction  transaction = null;//����һ���������
		try{
			transaction = session.beginTransaction();//��������
			session.delete(option);
			transaction.commit();//�ύ����
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//����ع�
		}
		HibernateSessionFactory.closeSession();//�ر�Session����
	}
	
	public List<Test> likeQueryByTitle(String title,Page page) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Query query = session.createQuery("from Test as sub where sub.title like :title ");
		query.setString("title","%"+title+"%");
		query.setMaxResults(page.getEveryPage());//���ò�ѯ��¼��
		query.setFirstResult(page.getBeginIndex());//���ò�ѯ��¼��ʼλ��
		List list = query.list();					//��ѯ������浽list��
		HibernateSessionFactory.closeSession();//�ر�Session����
		return list;
	}
	
	public int findLinkQueryCount(String title) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Query query = session.createQuery("from Test as sub where sub.title like :title ");
		query.setString("title","%"+title+"%");
		List list = query.list();					//��ѯ������浽list��
		int count = list.size();
		HibernateSessionFactory.closeSession();//�ر�Session����
		return count;
	}
	
	public List<Test> randomFindOption(int number) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Query query = session.createQuery("from Test as sub order by rand()");
		query.setMaxResults(number);//���ò�ѯ��¼��
		List list = query.list();					//��ѯ������浽list��
		HibernateSessionFactory.closeSession();//�ر�Session����
		return list;
	}

	public List<Question> findAllQuestion() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
