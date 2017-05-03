package com.examsystem.po;

public class Question {
	private int id;
	private String title;
	private String answer;
	private String diffculty;
	private int objectId;
	private String testCenture;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getDiffculty() {
		return diffculty;
	}
	public void setDiffculty(String diffculty) {
		this.diffculty = diffculty;
	}
	public int getObjectId() {
		return objectId;
	}
	public void setObjectId(int objectId) {
		this.objectId = objectId;
	}
	public String getTestCenture() {
		return testCenture;
	}
	public void setTestCenture(String testCenture) {
		this.testCenture = testCenture;
	}

}
