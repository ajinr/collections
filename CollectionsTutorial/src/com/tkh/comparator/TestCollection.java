package com.tkh.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCollection {

	public static void main(String[] args) {
		List<Student> students= new ArrayList<Student>();
		students.add(new Student(1, "ajin"));
		students.add(new Student(5, "steve"));
		students.add(new Student(6, "tom"));
		students.add(new Student(3, "mat"));
		students.add(new Student(4, "jack"));
		
		/*
		 * Comparator<Student> comp= new Comparator<Student>() {
		 * 
		 * @Override public int compare(Student o1, Student o2) {
		 * 
		 * return o1.rollNo.compareTo(o2.rollNo); } };
		 */
		
		
		Collections.sort(students);
		for(Student s: students)
			System.out.println(s);

	}

}
