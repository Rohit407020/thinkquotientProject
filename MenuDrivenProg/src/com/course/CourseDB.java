package com.course;

import java.util.Scanner;

public class CourseDB {
    static Scanner scan = new Scanner(System.in);
    
    public void addCourse(Course c) {
    	System.out.println("Enter Course Id");
		int id = scan.nextInt();
		c.setcId(id);
		System.out.println("Course Name");
		String name = scan.next();
		c.setName(name);
		System.out.println("Enter Fees");
		float f = scan.nextFloat();
		c.setFees(f);
		
//		System.out.println(c.toString());
    }
    public void updateCourse(Course c[],int id) {
    	for(int i=0;i<c.length;i++) {
    		if(c[i].getcId()==id) {
    			System.out.println(c[i].getName()+" "+c[i].getFees());
    			System.out.println("Enter Course Name");
    			String name = scan.next();
    			c[i].setName(name);
    			System.out.println("Enter Fees");
    			float fees = scan.nextFloat();
    			c[i].setFees(fees);
    			break;
    		}
    		
    	}
    }
    public void viewAllCourses(Course[] c) {
        for(int i=0; i<c.length; i++) {
            System.out.println(c[i].toString());
        }
    }
    //view by id
    public void viewByID(Course[] c,int vId) {
        for(int i=0; i<c.length; i++) {
        	if(c[i].getcId()==vId)
        		System.out.println(c[i].toString());
        }
    }
    ///delete
    public void deleteCourse(Course[] c, int dId) {
    	//0 1 2 3 // 0 1=>2 2=>3  3fail 3=>null
		for(int i=0;i<c.length;i++) {
			if(c[i].getcId() == dId) {
				System.out.println(c[i].getcId()+" "+c[i].getName()+" "+c[i].getFees());
				for(int j=i;j<c.length-1;j++) {
					c[j] = c[j+1];
				}
//				c[c.length-1]=null;
				System.out.println("Course "+dId+" delete successfully");
				break;
			}
		}
		
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CourseDB db = new CourseDB();
        //using array
        Course c[] = new Course[3];
        for(int i=0;i<c.length;i++) {
        	c[i] = new Course();
        }
//      
        
        
        int ch;
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
    		
    		case 1: for(int i=0;i<c.length;i++) {
    					
		    			db.addCourse(c[i]);
		    		}
    		break;
    		case 3: // select i
	    			db.viewAllCourses(c);
	    			 	System.out.println("Select ID for Update");
	    				int id = scan.nextInt();
	    			   
	    				    db.updateCourse(c, id);
    				
    	    break;
    		case 4: db.viewAllCourses(c);
			break;
    		case 2:	db.viewAllCourses(c);
    				System.out.println("Enter Id for delete");
    				int dId = scan.nextInt();
	    			   
				    db.deleteCourse(c, dId);
				    
				    break;
    	
    		case 5: System.out.println("Enter Id for View Course");
					int vId = scan.nextInt();
					db.viewByID(c,vId);			
    		
    		}
    		System.out.println("You want to perform more operation Yes -> 1 / No -> 0");
    		ch = scan.nextInt();
        }while(ch==1);
	}
	

}
