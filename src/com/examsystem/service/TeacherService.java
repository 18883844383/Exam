package com.examsystem.service;

import com.examsystem.po.Student;
import com.examsystem.po.Teacher;

public interface TeacherService {
	//�ж��Ƿ�Ϊ�Ϸ���ʦ���Ӷ������Ƿ������¼
	public boolean allowLogin(String teacherID,String password);
	public Teacher getTeacherInfo(String teacherId);
}
