package com.examsystem.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.examsystem.po.Student;
import com.examsystem.po.Teacher;
import com.examsystem.service.StudentService;
import com.examsystem.service.StudentServiceImpl;
import com.examsystem.service.TeacherService;
import com.examsystem.service.TeacherServiceImpl;

public class LoginAction extends ActionSupport {
	private String id; 			// �����û����
	private String password;	// �����û�����
	
	private StudentService studentService = 
		new StudentServiceImpl();//ѧ��ҵ���߼��������
	private TeacherService teacherService = 
		new TeacherServiceImpl();//��ʦҵ���߼��������

	public String getId() {
		return id;
	}
                                                                                               
	public void setId(String id) {
		this.id = id;
	}
   
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public String execute() throws Exception {
		System.out.println("id:'"+id+"'; password:'"+ password+"'");
			if(studentService.allowLogin(id, password)) {
				Student studentInfo = studentService.getStudentInfo(id);
				//����ѧ����¼��session��Χ
				Map session = ActionContext.getContext().getSession();
				session.put("studentInfo", studentInfo);
				return "studentSuccess";
			}
			else if(teacherService.allowLogin(id, password)){
				Teacher teacherInfo=teacherService.getTeacherInfo(id);
				Map session = ActionContext.getContext().getSession();
				session.put("teacherInfo", teacherInfo);
				return "teacherSuccess";
			}
			
			else {
				addActionError("��ѧ����Ų����ڣ��������벻��ȷ!");
				return this.INPUT;
			}
		}
			
		
	}

