package com.menudrivencourse;

import java.util.Scanner;

import com.course.Course;

public class CourseTest {
    static Scanner scan = new Scanner(System.in); 
    static int n = 0;
    static int ns = 0;
    //add
    public void addCourse(Course crr) {
    	System.out.println("Enter Course Id");
    	int id = scan.nextInt();
    	crr.setcId(id);
    	System.out.println("Enter Course Name");
    	String name = scan.next();
    	crr.setName(name);
    	System.out.println("Enter Course Fees");
    	float fees = scan.nextFloat();
    	crr.setFees(fees);
    }
    //update
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
    // update student updateStudent
    public void updateStudent(Student s[],int id) {
    	for(int i=0;i<s.length;i++) {
    		if(s[i].getId()==id) {
    			System.out.println(s[i].getId()+" "+s[i].getName()+" "+s[i].getAge());
    			System.out.println("Enter Student Name");
    			String name = scan.next();
    			s[i].setName(name);
    			System.out.println("Enter Student Age");
    			int age = scan.nextInt();
    			s[i].setAge(age);
    			break;
    		}
    		
    	}
    }
    // view
    public void viewAllCourses(Course[] c) {
      for(int i=0; i<n; i++) {
//          System.out.println(c[i].toString());
          if (c[i].getcId() != 0) {
              System.out.println(c[i].toString());
          }
       }
        
//        if (n < c.length) {
//		    
//        	System.out.println(c.toString());
//		    n++;
//		}
    }
    public void addStudent(Student s,Course c[]) {
    	System.out.println("Enter Student id");
    	int id = scan.nextInt();
  
    	System.out.println("Enter Student Name");
    	String name = scan.next();
    	
    	System.out.println("Enter Student Age");
    	int age = scan.nextInt();
    	
    	 s.setId(id);
    	    s.setName(name);
    	    s.setAge(age);
    	    s.setC(c);
    }
    
    public void viewStudent(Student s[]) {
        for(int i=0; i<ns; i++) {
        	if(s[i].getC()!=null && s[i].getC().length > 0) {
            System.out.println(s[i].toString());
         }
        }
          
//          if (n < c.length) {
//  		    
//          	System.out.println(c.toString());
//  		    n++;
//  		}
      }
    ///delete
    public void deleteCourse(Course[] c, int dId) {
    	//0 1 2 3 // 0 1=>2 2=>3  3fail 3=>null
    	n--;
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
    /// delete student    deleteStudent
    public void deleteStudent(Student[] s, int dId2) {
    	//0 1 2 3 // 0 1=>2 2=>3  3fail 3=>null
    	ns--;
		for(int i=0;i<s.length;i++) {
			if(s[i].getId() == dId2) {
				System.out.println(s[i].getId()+" "+s[i].getName()+" "+s[i].getAge());
				for(int j=i;j<s.length-1;j++) {
					s[j] = s[j+1];
				}
				s[s.length-1]=null;
				System.out.println("Course "+dId2+" delete successfully");
				break;
			}
		}
		
	}
    public void viewByID(Course[] c,int vId) {
        for(int i=0; i<c.length; i++) {
        	if(c[i].getcId()==vId)
        		System.out.println(c[i].toString());
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		CourseTest c = new CourseTest();
		
		Course crr[] = new Course[3];
		Student srr[] = new Student[2];
		
		 for(int i=0;i<crr.length;i++) {
			 crr[i] = new Course();
	        }
		 for(int i=0;i<srr.length;i++) {
			 srr[i] = new Student();
		 }
//		 if(n<crr.length) {
//			 crr[n] = new Course();
//			    n++;
//		}
		 int ch;
		 boolean innerloop = true;
	        do {
	        	System.out.println("##################");
	    		System.out.println("### Enter Choice #####");
	    		System.out.println("1. Add Course");
	    		System.out.println("2. Delete Course");
	    		System.out.println("3. Update Course");
	    		System.out.println("4. View Course");
	    		System.out.println("5. View By Id");
	    		System.out.println("6. Next");
	    		System.out.println("##################");
	    		System.out.println(n);
	    		ch = scan.nextInt();
	    		
	    		switch(ch) {
	    		
	    		case 1:if (n < crr.length) {
	    		    
	    		    c.addCourse(crr[n]);
	    		    n++;
	    		}else {
                    System.out.println("Cannot add more courses. Course array is full.");
                }
	    		break;
	    		
	    		case 3: // select i
	//	    			db.viewAllCourses(c);
		    			 	System.out.println("Select ID for Update");
		    				int id = scan.nextInt();
		    			   
		    				    c.updateCourse(crr, id);
	    				
	    	    break;
	    	   
	    		case 4: c.viewAllCourses(crr);
    	         break;
	    		case 2:	c.viewAllCourses(crr);
				System.out.println("Enter Id for delete");
				int dId = scan.nextInt();
    			   
			    c.deleteCourse(crr, dId);
			    
			    break;
	    		case 5: System.out.println("Enter Id for View Course");
				int vId = scan.nextInt();
				c.viewByID(crr,vId);			
		
		
	    		break;
	    		case 6: 
	    			int innerCh;
	    			do {
		        	System.out.println("##################");
		    		System.out.println("### Enter Choice #####");
		    		System.out.println("1. Add Student");
		    		System.out.println("2. Delete Student");
		    		System.out.println("3. Update Student");
		    		System.out.println("4. View Student");
		    		System.out.println("5. Exit");
		    		System.out.println("##################");
		    		System.out.println(n);
		    		innerCh = scan.nextInt();
		    		
		    		switch(innerCh) {
		    		case 1: if (ns < srr.length) {
		    		    
		    		    c.addStudent(srr[ns],crr);
		    		    ns++;
		    		}else {
	                    System.out.println("Cannot add more Stuent. Student array is full.");
	                }
		    		break;
		    		case 2:	c.viewStudent(srr);
					System.out.println("Enter Id for delete");
					int dId2 = scan.nextInt();
	    			   
				    c.deleteStudent(srr, dId2);
		    		case 4: c.viewStudent(srr);
		    		break;
		    		case 3: // select i
		    				    			c.viewStudent(srr);
		    				    			 	System.out.println("Select ID for Update");
		    				    				int id2 = scan.nextInt();
		    				    			   
		    				    				    c.updateStudent(srr, id2);
		    			    				
		    			    	    break;
		    		
		    		}System.out.println("You want to perform more operation Yes -> 1 / No -> 0");
		    		innerloop = (scan.nextInt() == 1);
		    		
		    		}while(innerloop);
	    		break;
	    		
	        }System.out.println("You want to perform more operation Yes -> 1 / No -> 0");
    		ch = scan.nextInt();
		}while(ch==1 && n < crr.length);
	        
	}
}
