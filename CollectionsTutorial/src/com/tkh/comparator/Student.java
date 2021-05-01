package com.tkh.comparator;

public class Student implements Comparable<Student> {
	
	Integer rollNo;
	String name;
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.name);
	}
	
	
	
}
