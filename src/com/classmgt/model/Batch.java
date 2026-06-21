package com.classmgt.model;

public class Batch {
	
	private int bid;
	private String bname;
	private Student student;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	@Override
	public String toString() {
		return "Batch [bid = " + bid + ", bname = " + bname + ", student = " + student + "]";
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

}
