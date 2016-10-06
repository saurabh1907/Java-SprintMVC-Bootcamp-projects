package com.lab;

public class EmpKey implements Comparable<EmpKey> {
	private int empId;
	private String empGrade;
	private String empKey;
	Employee employee;

	public EmpKey(int empId, String grade) {
		this.empId = empId;
		this.empGrade = grade;
		empKey = empId + empGrade;
	}

	@Override
	public int compareTo(EmpKey ref) {
		if (this.empId > ref.empId)
			return 1;
		else if (this.empId > ref.empId)
			return -1;
		else
			return 0;
	}

}
