package com.classmgt.controller;

import java.util.Scanner;

import com.classmgt.serviceimple.ClassMgtServiceImple;

public class ControllerClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		ClassMgtServiceImple classmgtserviceimple = new ClassMgtServiceImple();

		System.out.println("**** WELCOME TO CLASS MANAGEMENT PROJECT ****");

		while (flag) {
			System.out.println();
			System.out.println("========== MENU ==========");
			System.out.println("1. Add Course");
			System.out.println("2. Display Course");
			System.out.println("3. Add Faculty");
			System.out.println("4. Display Faculty");
			System.out.println("5. Add Batch");
			System.out.println("6. Display Batch");
			System.out.println("7. Add Student");
			System.out.println("8. Display Student");
			System.out.println("9. Exit");
			System.out.println("============================");

			System.out.println();
			System.out.println("Enter Your Choice: ");
			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				classmgtserviceimple.addCourse();
				break;

			case 2:
				classmgtserviceimple.displayCourse();
				break;

			case 3:
				classmgtserviceimple.addFaculty();
				break;

			case 4:
				classmgtserviceimple.displayFaculty();
				break;

			case 5:
				classmgtserviceimple.addBatch();
				break;

			case 6:
				classmgtserviceimple.displayBatch();
				break;

			case 7:
				classmgtserviceimple.addStudent();
				break;

			case 8:
				classmgtserviceimple.displayStudent();
				break;

			case 9:
				flag = false;
				break;

			default:
				System.out.println("Invaild Choice @@@@");
				break;
			}
		}

	}

}
