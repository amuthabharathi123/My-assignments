package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("studentName");
	}
	public void studentDept() {
		System.out.println("studentDept");
	}
	public void studentId() {
		System.out.println("studentId");
	}

	public static void main(String[] args)
	{
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.departmentName();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
	}

}
