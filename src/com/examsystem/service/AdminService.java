package com.examsystem.service;

import java.util.List;

import com.examsystem.po.Admin;

public interface AdminService {
	//�ж��Ƿ�Ϊ�Ϸ�ѧ�����Ӷ������Ƿ������¼
	public boolean allowLogin(String number,String pwd);
	public boolean saveAdmin(Admin admin);
	public Admin getAdminInfo(String number);
}