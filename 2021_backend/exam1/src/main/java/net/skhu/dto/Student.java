package net.skhu.dto;

public class Student {
	String studentNumber;
	String name;

	public Student(String studentNumber, String name) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
