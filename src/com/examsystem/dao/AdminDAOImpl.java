package com.examsystem.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.examsystem.hibernate.HibernateSessionFactory;
import com.examsystem.po.Admin;

public class AdminDAOImpl implements AdminDAO{
	public Admin findByAdminNumber(String number) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Admin admin = (Admin) session.get(Admin.class, number);
		HibernateSessionFactory.closeSession();//�ر�Session����
//		System.out.println("test  number:"+admin.getNumber());
		return admin;
	}
	
	public void addAdmin(Admin admin){
		Session session = HibernateSessionFactory.getSession();//���Session����
		System.out.println("4444444444444444444");
		Transaction  transaction = null;//����һ���������
		try{
			transaction = session.beginTransaction();//��������
			session.save(admin);//����������Ϣ
			transaction.commit();//�ύ����
		}catch(Exception ex) {
			ex.printStackTrace();
			transaction.rollback();//����ع�
		}
		HibernateSessionFactory.closeSession();//�ر�Session����
	}
	
}
