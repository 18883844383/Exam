package com.examsystem.service;

import java.util.List;

import com.examsystem.dao.StudentDAO;
import com.examsystem.dao.StudentDAOImpl;
import com.examsystem.po.Student;

public class StudentServiceImpl implements StudentService{
	private StudentDAO studentDAO = new StudentDAOImpl();
	
	public boolean allowLogin(String studentID, String password) {
		
		Student student = studentDAO.findByStudentID(studentID);
		if(student == null) {//�ж��Ƿ���ڸ�ID��ѧ��
			return false;
		}else {
			if(password.equals(student.getPassword())) {//�ж������Ƿ���ͬ
				return true;
			}else{
				return false;
			}
			
		}
	}

	public Student getStudentInfo(String studentID) {
		return studentDAO.findByStudentID(studentID);
	}

	/*public void setStudentResult(String studentID, int result) {
		Student student = studentDAO.findByStudentID(studentID);//����ID���ҵ���ѧ��
		student.setResult(result);//������ɼ�
		studentDAO.updateStudent(student);//����ѧ����Ϣ
	}*/

	public List<Student> getStudentByName(String studentName) {
		return studentDAO.findByStudentName(studentName);
	}

	public List<Student> getStudentByClass(String sclass) {
		return studentDAO.findByStudentClass(sclass);
	}
}
