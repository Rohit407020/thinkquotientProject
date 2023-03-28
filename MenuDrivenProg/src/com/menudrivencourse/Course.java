package com.menudrivencourse;

import java.util.Arrays;

public class Course {
    private int cId;
    private String name;
    private float fees;
   
    
    public Course() {
		
	}
    
	public Course(int cId, String name, float fees) {
		super();
		this.cId = cId;
		this.name = name;
		this.fees = fees;
		
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	

	@Override
	public String toString() {
		return "Course [cId=" + cId + ", name=" + name + ", fees=" + fees 
				+ "]";
	}
	
	
    
}
