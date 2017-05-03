package com.examsystem.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.examsystem.hibernate.HibernateSessionFactory;
import com.examsystem.po.Question;

import com.examsystem.util.Page;


public class QuestionDAOImpl implements  QuestionDAO{
	public void addQuestion(Question question){
		Session session = HibernateSessionFactory.getSession();//���Session����
		Transaction  transaction = null;//����һ���������
		try{
			transaction = session.beginTransaction();//��������
			session.save(question);//����������Ϣ
			transaction.commit();//�ύ����
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//����ع�
		}
		HibernateSessionFactory.closeSession();//�ر�Session����
	}
	
	public Question findQuestionByTitle(String questionTitle) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Query query = session.createQuery("from Question as sub where sub.title = ?");
		query.setString(0, questionTitle);
		List list = query.list();					//��ѯ������浽list��
		HibernateSessionFactory.closeSession();		//�ر�Session����
		if(list.size() == 0) {
			return null;							//����null
		}else {
			return (Question) list.get(0);			//���ص�һ������
		}
	}
	
	public List<Question> findQuestionByPage(Page page) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Query query = session.createQuery("from Question");
		query.setMaxResults(page.getEveryPage());//���ò�ѯ��¼��
		query.setFirstResult(page.getBeginIndex());//���ò�ѯ��¼��ʼλ��
		List list = query.list();					//��ѯ������浽list��
		HibernateSessionFactory.closeSession();//�ر�Session����
		return list;
	}
	
	public int findQuestionCount() {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Query query = session.createQuery("from Question");
		List list = query.list();					//��ѯ������浽list��
		int count = list.size();
		HibernateSessionFactory.closeSession();//�ر�Session����
		return count;
	}
	public Question findQuestionByID(int Id) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Question question = (Question) session.get(Question.class, Id);
		HibernateSessionFactory.closeSession();		//�ر�Session����
		return question;
	}
	public void updateQuestion(Question question) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Transaction  transaction = null;//����һ���������
		try{
			transaction = session.beginTransaction();//��������
			session.update(question);//����������Ϣ
			transaction.commit();//�ύ����
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//����ع�
		}
		HibernateSessionFactory.closeSession();//�ر�Session����
	}
	
	public void deleteQuestion(int id) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Question question = (Question) session.get(Question.class, id);
		Transaction  transaction = null;//����һ���������
		try{
			transaction = session.beginTransaction();//��������
			session.delete(question);
			transaction.commit();//�ύ����
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//����ع�
		}
		HibernateSessionFactory.closeSession();//�ر�Session����
	}
	public List<Question> likeQueryByTitle(String title,Page page) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Query query = session.createQuery("from Question as sub where sub.title like :title ");
		query.setString("title","%"+title+"%");
		query.setMaxResults(page.getEveryPage());//���ò�ѯ��¼��
		query.setFirstResult(page.getBeginIndex());//���ò�ѯ��¼��ʼλ��
		List list = query.list();					//��ѯ������浽list��
		HibernateSessionFactory.closeSession();//�ر�Session����
		return list;
	}
	public int findLinkQueryCount(String title) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Query query = session.createQuery("from Question as sub where sub.title like :title ");
		query.setString("title","%"+title+"%");
		List list = query.list();					//��ѯ������浽list��
		int count = list.size();
		HibernateSessionFactory.closeSession();//�ر�Session����
		return count;
	}
	public List<Question> randomFindQuestion(int number) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Query query = session.createQuery("from Question as sub order by rand()");
		query.setMaxResults(number);//���ò�ѯ��¼��
		List list = query.list();					//��ѯ������浽list��
		HibernateSessionFactory.closeSession();//�ر�Session����
		return list;
	}
	public List<Question> findAllQuestion(){
		Session session = HibernateSessionFactory.getSession();//���Session����
		Query query=session.createQuery("from Question");
		List list=query.list();
		HibernateSessionFactory.closeSession();//�ر�Session����
		return list;
	}






}
