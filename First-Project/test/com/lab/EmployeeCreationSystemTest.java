package com.lab;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeCreationSystemTest {

	@Test
	public void shouldReturnTrue() {

		Date date = new Date(10, 10, 2015);
		Employee employee = new Employee("saurabh", "prasad", 1000000, "A1", date);
		String actualFName = "saurabh";
		assertEquals(actualFName, employee.getFirstName());
		String actualLName = "prasad";
		assertEquals(actualLName, employee.getLastName());
		double actualSal = 1000000;
		assertEquals(actualSal, employee.getSalary(), 0);
		Date actualDate = new Date(10, 10, 2015);
		assertEquals(actualDate.toString(), employee.getJoining());

	}

}
