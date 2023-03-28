package com.student;
import java.util.Scanner;
import com.course.Course;
import com.course.CourseDB;

public class StudentTest {
	static CourseDB c1 = new CourseDB();
	static Course c = new Course();
//	Course c3[] = new Course[2];
	
     static Scanner scan = new Scanner(System.in);
     
    public static void addStudent(Student stud) {
    	
    	System.out.println("Enter Student Id");
    	stud.setId(scan.nextInt());
    	System.out.println("Enter Student Name");
    	stud.setName(scan.next());
    	System.out.println("Enter Student Age");
    	stud.setAge(scan.nextInt());
    	
        
    	
    	
    }
     public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
		
		StudentTest s1 = new StudentTest();
		Student stud[] = new Student[10];
		for(int i=0;i<stud.length;i++) {
			stud[i] = new Student();
		}
		int ch;
		do {
			System.out.println("##################");
    		System.out.println("### Enter Choice #####");
    		System.out.println("1. Add Student");
    		System.out.println("2. Dtelee Student");
    		System.out.println("3. Update Student");
    		System.out.println("4. View Student");
    		System.out.println("5. View By Id");
    		System.out.println("##################");
    		ch = scan.nextInt();
    		
    		switch(ch) {
    		
    		case 1: for(int i=0;i<stud.length;i++) {
    					
    			s1.addStudent(stud[i]);
		    		}
    		break;
    		
    		}
    		System.out.println("You want to perform more operation Yes -> 1 / No -> 0");
    		ch = scan.nextInt();
        }while(ch==1);
	}
	

}
