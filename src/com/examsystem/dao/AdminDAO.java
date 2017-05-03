package com.examsystem.dao;

import com.examsystem.po.Admin;

public interface AdminDAO {
	public Admin findByAdminNumber(String number);//查询方法，根据学生ID查询
	public void addAdmin(Admin admin);
}
