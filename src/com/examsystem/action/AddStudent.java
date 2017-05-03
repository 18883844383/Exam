package com.examsystem.action;

import com.examsystem.po.Admin;
import com.examsystem.service.AdminService;
import com.examsystem.service.AdminServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class AddStudent extends ActionSupport{
	private String number;
	private String pwd;
	private String name;
	
	private AdminService adminService=new AdminServiceImpl();

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String execute() throws Exception {
		Admin admin = new Admin();
		admin.setName(name);
		admin.setNumber(number);
		admin.setPwd(number);
		System.out.println("111111111111");
		if(adminService.saveAdmin(admin)) {
			System.out.println("22222222222222222222");
			return SUCCESS;
		}else {
			System.out.println("33333333333333333");
			this.addActionError("该试题已经添加过了，请不要重复添加!");
			return INPUT;
		}
	}
}
