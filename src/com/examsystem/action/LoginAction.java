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
	private String id; 			// 接受用户编号
	private String password;	// 接受用户密码
	
	private StudentService studentService = 
		new StudentServiceImpl();//学生业务逻辑组件引用
	private TeacherService teacherService = 
		new TeacherServiceImpl();//教师业务逻辑组件引用

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
				//保存学生记录到session范围
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
				addActionError("该学生编号不存在，或者密码不正确!");
				return this.INPUT;
			}
		}
			
		
	}

