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
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Transaction  transaction = null;//声明一个事务对象
		try{
			transaction = session.beginTransaction();//开启事务
			session.save(question);//保存试题信息
			transaction.commit();//提交事务
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//事务回滚
		}
		HibernateSessionFactory.closeSession();//关闭Session对象
	}
	
	public Question findQuestionByTitle(String questionTitle) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Question as sub where sub.title = ?");
		query.setString(0, questionTitle);
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();		//关闭Session对象
		if(list.size() == 0) {
			return null;							//返回null
		}else {
			return (Question) list.get(0);			//返回第一个试题
		}
	}
	
	public List<Question> findQuestionByPage(Page page) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Question");
		query.setMaxResults(page.getEveryPage());//设置查询记录数
		query.setFirstResult(page.getBeginIndex());//设置查询记录起始位置
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list;
	}
	
	public int findQuestionCount() {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Question");
		List list = query.list();					//查询结果保存到list中
		int count = list.size();
		HibernateSessionFactory.closeSession();//关闭Session对象
		return count;
	}
	public Question findQuestionByID(int Id) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Question question = (Question) session.get(Question.class, Id);
		HibernateSessionFactory.closeSession();		//关闭Session对象
		return question;
	}
	public void updateQuestion(Question question) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Transaction  transaction = null;//声明一个事务对象
		try{
			transaction = session.beginTransaction();//开启事务
			session.update(question);//更新试题信息
			transaction.commit();//提交事务
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//事务回滚
		}
		HibernateSessionFactory.closeSession();//关闭Session对象
	}
	
	public void deleteQuestion(int id) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Question question = (Question) session.get(Question.class, id);
		Transaction  transaction = null;//声明一个事务对象
		try{
			transaction = session.beginTransaction();//开启事务
			session.delete(question);
			transaction.commit();//提交事务
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//事务回滚
		}
		HibernateSessionFactory.closeSession();//关闭Session对象
	}
	public List<Question> likeQueryByTitle(String title,Page page) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Question as sub where sub.title like :title ");
		query.setString("title","%"+title+"%");
		query.setMaxResults(page.getEveryPage());//设置查询记录数
		query.setFirstResult(page.getBeginIndex());//设置查询记录起始位置
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list;
	}
	public int findLinkQueryCount(String title) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Question as sub where sub.title like :title ");
		query.setString("title","%"+title+"%");
		List list = query.list();					//查询结果保存到list中
		int count = list.size();
		HibernateSessionFactory.closeSession();//关闭Session对象
		return count;
	}
	public List<Question> randomFindQuestion(int number) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Question as sub order by rand()");
		query.setMaxResults(number);//设置查询记录数
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list;
	}
	public List<Question> findAllQuestion(){
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query=session.createQuery("from Question");
		List list=query.list();
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list;
	}






}
