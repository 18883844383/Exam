package com.examsystem.dao;

import com.examsystem.po.Admin;

public interface AdminDAO {
	public Admin findByAdminNumber(String number);//��ѯ����������ѧ��ID��ѯ
	public void addAdmin(Admin admin);
}
