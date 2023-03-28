package com.menudrivencourse;

import java.util.Arrays;

import com.course.Course;

public class Student {
       private int id;
       private String name;
       private int age;
       private Course c[];
       
       public Student() {
   		
   	}
	public Student(int id, String name, int age, Course[] c) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.c = c;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Course[] getC() {
		return c;
	}
	public void setC(Course[] c) {
		this.c = c;
	}
	@Override
	public String toString() {
	    if(c.length == 1) {
	        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", c=" + c[0].toString() + "]";
	    } else {
	        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", c=" + Arrays.toString(c) + "]";
	    }
	}
}
