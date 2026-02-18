package com.ranjan;

public class Main {
	public static void main(String[] args) {
	
	Student s1 = new Student();
	s1.name = "Akash";
	s1.id = 101;
	s1.marks = 99;
	System.out.println("Student Details: ");
	System.out.println(s1.name);
	System.out.println(s1.id);
	System.out.println(s1.marks);
	s1.study(s1.name);
	s1.prepareInterview(s1.name);
	
	
	Student s2 = new Student();
	s2.name = "Sachin";
	s2.id = 102;
	s2.marks = 97;
	System.out.println("Student Details: ");
	System.out.println(s2.name);
	System.out.println(s2.id);
	System.out.println(s2.marks);
	s2.study(s2.name);
	s2.prepareInterview(s2.name);
	}
}
