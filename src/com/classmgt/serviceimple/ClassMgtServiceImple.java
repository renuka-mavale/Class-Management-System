package com.classmgt.serviceimple;

import java.util.*;
import com.classmgt.model.*;
import com.classmgt.service.ClassMgtService;

public class ClassMgtServiceImple implements ClassMgtService {

	Scanner sc = new Scanner(System.in);

	List<Course> clist = new ArrayList<Course>();
	List<Faculty> flist = new ArrayList<Faculty>();
	List<Batch> blist = new ArrayList<Batch>();
	List<Student> slist = new ArrayList<Student>();

	@Override
	public void addCourse() {
		System.out.println("Enter how many course you want to enroll ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			Course course = new Course();

			System.out.println("Enter Course Id: ");
			int cid = sc.nextInt();
			course.setCid(cid);

			System.out.println("Enter Course Name	: ");
			course.setCname(sc.next());

			clist.add(course);
		}
		System.out.println("Course Added Successfully !!");

	}

	@Override
	public void displayCourse() {

		System.out.println("===== Course Details =====");

		for (Course courses : clist) {
			System.out.println(courses);
		}

	}

	@Override
	public void addFaculty() {
		System.out.println("How many Faculty you want to add ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			Faculty faculty = new Faculty();

			System.out.println("Enter Faculty Id:");
			faculty.setFid(sc.nextInt());

			System.out.println("Enter Faculty Name: ");
			String fname = sc.next();
			faculty.setFname(fname);

			displayCourse();
			System.out.println("Enter Course Id: ");
			int cid = sc.nextInt();

			for (Course co : clist) {
				if (cid == co.getCid()) {
					co.setCid(cid);
					faculty.setCourse(co);
				}
			}

			flist.add(faculty);
		}
		System.out.println("Faculty Added !!!!");

	}

	@Override
	public void displayFaculty() {
		System.out.println("===== Faculty Details =====");

		for (Faculty faculty : flist) {
			System.out.println(faculty);
		}

	}

	@Override
	public void addBatch() {

		System.out.println("Enter in which batch you want to enroll");
		int n = sc.nextInt();

		System.out.println("Enter Batch Deatils");
		for (int i = 1; i <= n; i++) {
			Batch batch = new Batch();

			System.out.println("Enter Batch Id:");
			int batchid = sc.nextInt();
			batch.setBid(batchid);

			System.out.println("Enter Batch Name: ");
			batch.setBname(sc.next());

			displayCourse();
			System.out.println("Enter Course Id: ");
			int cid = sc.nextInt();

			for (Course co : clist) {
				if (cid == co.getCid()) {
					co.setCid(cid);
					batch.setCourse(co);
				}
			}

			blist.add(batch);
		}
		System.out.println("Batch Added Successfully");
	}

	@Override
	public void displayBatch() {

		System.out.println("===== Batch Details ======");

		for (Batch batchlist : blist) {
			System.out.println(batchlist);
		}

	}

	@Override
	public void addStudent() {

		System.out.println("Enter how many students to add: ");
		int n = sc.nextInt();
		System.out.println("-- Enter Student Details --");

		for (int i = 1; i <= n; i++) {
			Student student = new Student();

			System.out.println("Enter Student Id: ");
			int stud_id = sc.nextInt();
			student.setSid(stud_id);

			System.out.println("Enter Student Name: ");
			student.setSname(sc.next());

			displayBatch();

			System.out.println("Enter Batch Id: ");
			int batchid = sc.nextInt();

			for (Batch batchlist : blist) {
				if(batchid == batchlist.getBid()) {
					batchlist.setBid(batchid);
					student.setBatch(batchlist);
				}				
			}

			slist.add(student);
		}

		System.out.println("Student Added Successfully !!!");
	}

	@Override
	public void displayStudent() {

		System.out.println("===== Student Details =====");

		for (Student stud : slist) {
			System.out.println(stud);
		}

	}

}
