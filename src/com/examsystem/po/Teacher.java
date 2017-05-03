package com.examsystem.po;

public class Teacher {
	private String teacherID;
	private String password;
	private String teacherName;
	private String photo;
	private int tel;
	public String getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teahcerName) {
		this.teacherName = teacherName;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
}
