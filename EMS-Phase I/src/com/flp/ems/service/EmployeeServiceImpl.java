package com.flp.ems.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Employee;
import com.flp.ems.util.DateParser;
import com.flp.ems.util.Validate;

public class EmployeeServiceImpl implements IEmployeeService {
	private EmployeeDaoImplForList dao= new EmployeeDaoImplForList();

	@Override
	public void addEmployee(HashMap<String, Object> employeeData) {
		try {
			String name = (String) employeeData.get("name");
			String kinID = (String) employeeData.get("kinID");
			long phoneNo = (long) employeeData.get("phoneNo");
			Date dob = DateParser.dateParser((String) employeeData.get("dob"));
			Date doj = DateParser.dateParser((String) employeeData.get("doj"));

			String address = (String) employeeData.get("address");
			int deptID = (int) employeeData.get("deptID");
			int projectID = (int) employeeData.get("projectID");
			int rolesID = (int) employeeData.get("rolesID");

			Employee employee = new Employee(name, kinID, phoneNo, dob, doj, address, deptID, projectID, rolesID);
			dao.addEmployee(employee);
		} catch (java.text.ParseException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void modifyEmployee(HashMap<String, Object> employeeData) {
		Employee employee = searchEmployee((String) employeeData.get("kinID"));
		if (employee != null) {
			try {
				employee.setName((String) employeeData.get("name"));
				employee.setKinID((String) employeeData.get("kinID"));
				employee.setPhoneNo((long) employeeData.get("phoneNo"));
				employee.setDateOfBirth(DateParser.dateParser((String) employeeData.get("dob")));
				employee.setDateOfJoining(DateParser.dateParser((String) employeeData.get("doj")));
				employee.setAddress((String) employeeData.get("address"));
				employee.setDepartmentID((int) employeeData.get("deptID"));
				employee.setProjectID((int) employeeData.get("projectID"));
				employee.setRolesID((int) employeeData.get("rolesID"));

				dao.modifyEmployee(employee);
			} catch (java.text.ParseException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void removeEmployee(int employeeID) {
		dao.removeEmployee(employeeID);
	}

	@Override
	public Employee searchEmployee(int employeeID) {
		return dao.searchEmployee(employeeID);

	}

	public Employee searchEmployee(String kinID) {
		return dao.searchEmployee(kinID);

	}

	@Override
	public ArrayList<HashMap<String, Object>> getAllEmployee() {
		ArrayList<HashMap<String, Object>> employeeList = new ArrayList<>();
		HashMap<String,Object> tempEmpData;
		for( Employee currentEmployee: dao.getAllEmployee()){
			tempEmpData= new HashMap<>();
			tempEmpData.put("name", currentEmployee.getName());
			tempEmpData.put("kinID", currentEmployee.getKinID());
			tempEmpData.put("phoneNo", currentEmployee.getPhoneNo());
			tempEmpData.put("dob", currentEmployee.getDateOfBirth());
			tempEmpData.put("doj", currentEmployee.getDateOfJoining());
			tempEmpData.put("address", currentEmployee.getAddress());
			tempEmpData.put("deptID", currentEmployee.getDepartmentID());
			tempEmpData.put("projectID", currentEmployee.getPhoneNo());
			tempEmpData.put("rolesID", currentEmployee.getRolesID());
			employeeList.add(tempEmpData);
		}
			return employeeList;
	}

}
