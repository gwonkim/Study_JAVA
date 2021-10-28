package net.skhu.dto;

import lombok.Data;

@Data
public class Employee {
	int id;
	String employeeNo;
	String name;
	int departmentId;
	int salary;
	String sex;

	Department department;
}
