package com.lab;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Entry {
	static Map<EmpKey, Employee> employeeList;

	public static void main(String[] args) {
		Date date = new Date(19, 07, 2016);
		Contractor contractor = new Contractor("Barclays");
		Employee newEmployee;

		employeeList = new TreeMap<>();

		newEmployee = CreateEmployee.createProjectManager("saurabh", "prasad", "A1", date, 1000000);
		employeeList.put(newEmployee.getEmpKey(), newEmployee);

		newEmployee = CreateEmployee.createContractBasedTechAssociate("ram", "das", "A1", date, 100, contractor);
		employeeList.put(newEmployee.getEmpKey(), newEmployee);

		try {
			EmpKey key = new EmpKey(1, "A1");
			Utility.findEmployee(key);
		} catch (EmployeeNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}

