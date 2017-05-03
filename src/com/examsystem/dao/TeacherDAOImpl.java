package com.examsystem.dao;

import org.hibernate.Session;

import com.examsystem.hibernate.HibernateSessionFactory;
import com.examsystem.po.Teacher;

public class TeacherDAOImpl implements TeacherDAO{
	public Teacher findByTeacherID(String teacherID) {
		Session session = HibernateSessionFactory.getSession();//获得Session对象
		Teacher teacher = (Teacher) session.get(Teacher.class, teacherID);
		HibernateSessionFactory.closeSession();//关闭Session对象
		return teacher;
	}
}
