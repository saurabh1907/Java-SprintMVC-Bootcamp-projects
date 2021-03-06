package com.flp.ems.view;

import java.util.Date;
import java.util.HashMap;

import com.flp.ems.domain.Employee;
import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.util.Validate;

public class UserInteraction {
	private EmployeeServiceImpl employeeService = new EmployeeServiceImpl() ;

	public void addEmployee(String name, String kinID, long phoneNo, String dob, String doj, String address, int deptID,
			int projectID, int rolesID) {
		HashMap<String, Object> employeeData = new HashMap<>();

		if (Validate.validateName(name))
			employeeData.put("name", name);
		else
			System.out.println("Invalid Name Format");

		if (Validate.validateKinID(kinID))
			employeeData.put("kinID", kinID);
		else
			System.out.println("KinID not unique");

		if (Validate.validatePhoneNo(phoneNo))
			employeeData.put("phoneNo", phoneNo);
		else
			System.out.println("Phone No invalid");

		if (Validate.validateDate(dob))
			employeeData.put("dob", dob);
		else
			System.out.println("Enter date in dd/mm/yyyy");

		if (Validate.validateDate(doj))
			employeeData.put("doj", doj);
		else
			System.out.println("Enter date in dd/mm/yyyy");

		employeeData.put("address", address);
		employeeData.put("deptID", deptID);
		employeeData.put("projectID", projectID);
		employeeData.put("rolesID", rolesID);

		employeeService.addEmployee(employeeData);
	}

	public void modifyEmployee(String name, String kinID, long phoneNo, String dob, String doj, String address,
			int deptID, int projectID, int rolesID) {
		HashMap<String, Object> employeeData = new HashMap<>();

		if (Validate.validateName(name))
			employeeData.put("name", name);
		else
			System.out.println("Invalid Name Format");

		if (Validate.validateKinID(kinID))
			employeeData.put("kinID", kinID);
		else
			System.out.println("KinID not unique");

		if (Validate.validatePhoneNo(phoneNo))
			employeeData.put("phoneNo", phoneNo);
		else
			System.out.println("Phone No invalid");

		if (Validate.validateDate(dob))
			employeeData.put("dob", dob);
		else
			System.out.println("Enter date in dd/mm/yyyy");

		if (Validate.validateDate(doj))
			employeeData.put("doj", doj);
		else
			System.out.println("Enter date in dd/mm/yyyy");

		employeeData.put("address", address);
		employeeData.put("deptID", deptID);
		employeeData.put("projectID", projectID);
		employeeData.put("rolesID", rolesID);

		employeeService.modifyEmployee(employeeData);
	}

	public void removeEmployee(int employeeID) {
		employeeService.removeEmployee(employeeID);
	}

	public Employee searchEmployee(int employeeID) {
		return employeeService.searchEmployee(employeeID);
	}

	public Employee searchEmployee(String kinID) {
		return employeeService.searchEmployee(kinID);
	}

	public void getAllEmployee() {
		System.out.println("\nNAME\tKINID\tPHONENO\t\tDOB\n------------------------------------------------------");
		for(HashMap<String, Object> empData: employeeService.getAllEmployee()){
			System.out.println(empData.get("name")+ " " + empData.get("kinID")+ " "+ empData.get("phoneNo") + " " + empData.get("dob") );
			
		}
	}
}
