package com.examsystem.service;

import com.examsystem.dao.AdminDAO;
import com.examsystem.dao.AdminDAOImpl;
import com.examsystem.po.Admin;

public class AdminServiceImpl implements AdminService{
	private AdminDAO adminDAO = new AdminDAOImpl();
	
	public boolean allowLogin(String number, String pwd) {
		
		Admin admin = adminDAO.findByAdminNumber(number);
		if(admin == null) {//�ж��Ƿ���ڸ�ID��ѧ��
			return false;
		}else {
			System.out.println("number:"+admin.getNumber()+"  pwd:"+admin.getPwd());
			if(pwd.equals(admin.getPwd())) {//�ж������Ƿ���ͬ
				return true;
			}else{
				return false;
			}
			
		}
	}
	public Admin getAdminInfo(String number) {
		return adminDAO.findByAdminNumber(number);
	}
	
	public boolean saveAdmin(Admin admin){
		String number = admin.getNumber();
		System.out.println("5555555555555");
		System.out.println("number:"+number);
		if(adminDAO.findByAdminNumber(number) == null){ //�����������ⲻ���ڣ��������
			adminDAO.addAdmin(admin);
			return true;
		}else {
			return false;
		}
		
	}
}
