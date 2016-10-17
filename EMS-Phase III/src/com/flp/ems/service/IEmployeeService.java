package com.flp.ems.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.flp.ems.domain.Employee;

public interface IEmployeeService {
	public void addEmployee(HashMap<String, String> employeeData);
	public void modifyEmployee(HashMap<String, String> employeeData);
	public void removeEmployee(String employeeID);
	public ArrayList<HashMap<String,Object>> searchEmployee(String nameOrId);
	public ArrayList<HashMap<String, Object>> getAllEmployee();
}
