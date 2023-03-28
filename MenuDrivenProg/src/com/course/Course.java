package com.course;

public class Course {
    private int cId;
    private String name;
    private float fees;
    
    
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
		return "Course [cId=" + cId + ", name=" + name + ", fees=" + fees + "]";
	}
    
	
    
}
