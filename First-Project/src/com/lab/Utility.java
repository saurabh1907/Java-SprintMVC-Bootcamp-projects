package com.lab;

public class Utility {
	
	public static void findEmployee(EmpKey empKey ) throws EmployeeNotFoundException{
		if(Entry.employeeList.get(empKey)!=null)
			System.out.println("found");
		else
			throw new EmployeeNotFoundException("Employee Not Found");
	}
	
	/*public static void findEmployee(int id) throws EmployeeNotFoundException{
	for(Employee tempEmp: employee){
		if(tempEmp != null){
			if(tempEmp.getID()==id)
			System.out.println("found");
	}
	}
	throw new EmployeeNotFoundException("Employee Not Found");
}*/
	
	
}
