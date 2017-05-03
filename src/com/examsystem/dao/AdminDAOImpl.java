package com.examsystem.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.examsystem.hibernate.HibernateSessionFactory;
import com.examsystem.po.Admin;

public class AdminDAOImpl implements AdminDAO{
	public Admin findByAdminNumber(String number) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Admin admin = (Admin) session.get(Admin.class, number);
		HibernateSessionFactory.closeSession();//关闭Session对象
//		System.out.println("test  number:"+admin.getNumber());
		return admin;
	}
	
	public void addAdmin(Admin admin){
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		System.out.println("4444444444444444444");
		Transaction  transaction = null;//声明一个事务对象
		try{
			transaction = session.beginTransaction();//开启事务
			session.save(admin);//保存试题信息
			transaction.commit();//提交事务
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//事务回滚
		}
		HibernateSessionFactory.closeSession();//关闭Session对象
	}
	
}
