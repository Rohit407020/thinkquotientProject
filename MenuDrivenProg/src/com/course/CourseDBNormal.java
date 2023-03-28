package com.course;

import java.util.Scanner;
 
public class CourseDBNormal {
	static Course c1 = new Course();
	static Scanner scan = new Scanner(System.in);
	public void addCourse() {
		System.out.println("Enter Course Id");
		int id = scan.nextInt();
		c1.setcId(id);
		System.out.println("Course Name");
		String name = scan.next();
		c1.setName(name);
		System.out.println("Enter Fees");
		float f = scan.nextFloat();
		c1.setFees(f);
		
		System.out.println(c1.toString());
	}
	public void updateCourse() {
		System.out.println(c1.toString());
		System.out.println("Enter Course Id");
		int id = scan.nextInt();
		c1.setcId(id);
		System.out.println("Course Name");
		String name = scan.next();
		c1.setName(name);
		System.out.println("Enter Fees");
		float f = scan.nextFloat();
		c1.setFees(f);
		
		System.out.println(c1.toString());
	}
	
	
    public static void main(String arg[] ) {
    	
//    	System.out.println("hello");
    	int ch;
    	CourseDBNormal db = new CourseDBNormal();
    	do {
    		
    		System.out.println("##################");
    		System.out.println("### Enter Choise #####");
    		System.out.println("1. Add Course");
    		System.out.println("2. Delete Course");
    		System.out.println("3. Update Course");
    		System.out.println("4. View Course");
    		System.out.println("5. View By Id");
    		System.out.println("##################");
    		ch = scan.nextInt();
    		switch(ch) {
    		case 1: db.addCourse();
    				break;
    		case 3: db.updateCourse();		
    		
    		}
    		System.out.println("You Want To Do More Operatopn 1> Yes 0> No");
    		ch = scan.nextInt();
    	}while(ch!=0);
    }
}
