package com.flp.ems.dao;

import java.io.BufferedInputStream;
import java.util.ArrayList;

import com.flp.ems.domain.Employee;

public class EmployeeDaoImplForList implements IemployeeDao{
private static ArrayList<Employee> employeeList = new ArrayList<>();
	@Override
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}

	@Override
	public void modifyEmployee(Employee employee) {
		
	}

	@Override
	public void removeEmployee(int empID) {
		employeeList.remove(searchEmployee(empID));
		
	}

	@Override
	public Employee searchEmployee(int empID) {
		for(Employee currentEmp : employeeList){
			if(currentEmp.getId()== empID)
				return currentEmp;
		}
		return null;
	}
	
	public Employee searchEmployee(String kinID) {
		for(Employee currentEmp : employeeList){
			if(currentEmp.getKinID().equals(kinID))
				return currentEmp;
		}
		return null;
	}

	@Override
	public ArrayList<Employee> getAllEmployee() {
		return employeeList;
	}
}
