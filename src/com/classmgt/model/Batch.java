package com.classmgt.model;

public class Batch {

	private int bid;
	private String bname;
	private Course course;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Batch [bid = " + bid + ", bname = " + bname + ", course = " + course + "]";
	}

}
