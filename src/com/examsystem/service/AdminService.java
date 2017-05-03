package com.examsystem.service;

import java.util.List;

import com.examsystem.po.Admin;

public interface AdminService {
	//判断是否为合法学生，从而决定是否允许登录
	public boolean allowLogin(String number,String pwd);
	public boolean saveAdmin(Admin admin);
	public Admin getAdminInfo(String number);
}