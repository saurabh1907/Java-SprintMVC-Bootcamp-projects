package com.flp.ems.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.flp.ems.domain.Employee;

public interface IEmployeeService {
	public void addEmployee(HashMap<String,Object> employeeData);
	public void modifyEmployee(HashMap<String,Object> employeeData);
	public void removeEmployee(int employeeID);
	public HashMap<String,Object> searchEmployee(String nameOrId);
	public ArrayList<HashMap<String, Object>> getAllEmployee();
}
