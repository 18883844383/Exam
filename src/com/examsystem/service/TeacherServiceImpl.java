package com.examsystem.service;

import com.examsystem.dao.TeacherDAO;
import com.examsystem.dao.TeacherDAOImpl;
import com.examsystem.po.Student;
import com.examsystem.po.Teacher;

public class TeacherServiceImpl implements TeacherService{
	private TeacherDAO teacherDAO = new TeacherDAOImpl();
	
	public boolean allowLogin(String teacherID, String password) {
		Teacher teacher = teacherDAO.findByTeacherID(teacherID);
		if(teacher == null) {//判断是否存在该ID的教师
			return false;
		}else {
			if(password.equals(teacher.getPassword())) {//判断密码是否相同
				return true;
			}else{
				return false;
			}
		}
	}

	@Override
	public Teacher getTeacherInfo(String teacherId) {
		return teacherDAO.findByTeacherID(teacherId);
		
	}
}
