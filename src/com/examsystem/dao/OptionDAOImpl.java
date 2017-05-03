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
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Transaction  transaction = null;//声明一个事务对象
		try{
			transaction = session.beginTransaction();//开启事务
			session.persist(test);
			transaction.commit();//提交事务
		}catch(Exception ex) {
			ex.printStackTrace();
			//transaction.rollback();//事务回滚
		}
		HibernateSessionFactory.closeSession();//关闭Session对象
	}
	
	public Test findOptionByTitle(String questionTitle) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Test as sub where sub.title = ?");
		query.setString(0, questionTitle);
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();		//关闭Session对象
		if(list.size() == 0) {
			return null;							//返回null
		}else {
			return (Test) list.get(0);			//返回第一个试题
		}
	}
	
	public List<Test> findOptionByPage(Page page) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Test");
		query.setMaxResults(page.getEveryPage());//设置查询记录数
		query.setFirstResult(page.getBeginIndex());//设置查询记录起始位置
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list;
	}
	
	public int findOptionCount() {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Test");
		List list = query.list();					//查询结果保存到list中
		int count = list.size();
		HibernateSessionFactory.closeSession();//关闭Session对象
		return count;
	}
	
	public Test findOptionByID(int Id) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Test option = (Test) session.get(Test.class, Id);
		HibernateSessionFactory.closeSession();		//关闭Session对象
		return option;
	}
	
	public void updateOption(Test option) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Transaction  transaction = null;//声明一个事务对象
		try{
			transaction = session.beginTransaction();//开启事务
			session.update(option);//更新试题信息
			transaction.commit();//提交事务
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//事务回滚
		}
		HibernateSessionFactory.closeSession();//关闭Session对象
	}
	
	public void deleteOption(int id) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Test option = (Test) session.get(Test.class, id);
		Transaction  transaction = null;//声明一个事务对象
		try{
			transaction = session.beginTransaction();//开启事务
			session.delete(option);
			transaction.commit();//提交事务
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//事务回滚
		}
		HibernateSessionFactory.closeSession();//关闭Session对象
	}
	
	public List<Test> likeQueryByTitle(String title,Page page) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Test as sub where sub.title like :title ");
		query.setString("title","%"+title+"%");
		query.setMaxResults(page.getEveryPage());//设置查询记录数
		query.setFirstResult(page.getBeginIndex());//设置查询记录起始位置
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list;
	}
	
	public int findLinkQueryCount(String title) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Test as sub where sub.title like :title ");
		query.setString("title","%"+title+"%");
		List list = query.list();					//查询结果保存到list中
		int count = list.size();
		HibernateSessionFactory.closeSession();//关闭Session对象
		return count;
	}
	
	public List<Test> randomFindOption(int number) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Query query = session.createQuery("from Test as sub order by rand()");
		query.setMaxResults(number);//设置查询记录数
		List list = query.list();					//查询结果保存到list中
		HibernateSessionFactory.closeSession();//关闭Session对象
		return list;
	}

	public List<Question> findAllQuestion() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
