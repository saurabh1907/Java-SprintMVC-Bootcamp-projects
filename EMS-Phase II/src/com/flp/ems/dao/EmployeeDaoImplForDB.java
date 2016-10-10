package com.flp.ems.dao;

import java.io.BufferedInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import com.flp.ems.domain.Employee;

public class EmployeeDaoImplForDB implements IemployeeDao {
	private Properties props;
	private String url ;

	{
		try {
			props = new Properties();
			FileInputStream fls;
			fls = new FileInputStream("dbDetails.properties");

			props.load(fls);

			String driver = props.getProperty("jdbc.driver");
			Class.forName(driver);
			
			url = props.getProperty("jdbc.url");

		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} catch (ClassNotFoundException e) {
		}
	}

	@Override
	public void addEmployee(Employee employee) {
		try (Connection con = DriverManager.getConnection(url);
				PreparedStatement ps = con.prepareStatement(props.getProperty("jdbc.query.addEmployee"))) {
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getKinID());
			ps.setLong(3, employee.getPhoneNo());
			ps.setDate(4, employee.getDateOfBirth());
			ps.setDate(5, employee.getDateOfJoining());
			ps.setString(6, employee.getAddress());
			ps.setInt(7, employee.getDepartmentID());
			ps.setInt(8, employee.getProjectID());
			ps.setInt(9, employee.getRolesID());
			ps.executeQuery();
		} catch (SQLException e) {
		}
	}

	@Override
	public void modifyEmployee(Employee employee) {
		try (Connection con = DriverManager.getConnection(url);
				PreparedStatement ps = con.prepareStatement(props.getProperty("jdbc.query.modifyEmployee"))) {
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getKinID());
			ps.setLong(3, employee.getPhoneNo());
			ps.setDate(4, employee.getDateOfBirth());
			ps.setDate(5, employee.getDateOfJoining());
			ps.setString(6, employee.getAddress());
			ps.setInt(7, employee.getDepartmentID());
			ps.setInt(8, employee.getProjectID());
			ps.setInt(9, employee.getRolesID());
			ps.executeQuery();
		} catch (SQLException e) {
		}
	}

	@Override
	public void removeEmployee(int empID) {
		try (Connection con = DriverManager.getConnection(url);
				PreparedStatement ps = con.prepareStatement(props.getProperty("jdbc.query.removeEmployee"))) {
			ps.setInt(1, empID);
			ps.executeQuery();
		} catch (SQLException e) {
		}
	}

	@Override
	public Employee searchEmployee(String nameOrId) {
		String query;
		String regexInteger = "[0-9]+";
		Employee employee=null;
		
		if (nameOrId.matches(regexInteger))
			query = props.getProperty("jdbc.query.searchByID");
		else 
			query = props.getProperty("jdbc.query.searchByKinID");
		
		try (Connection con = DriverManager.getConnection(url);
			PreparedStatement ps = con.prepareStatement(query)) {
			ps.setString(1, nameOrId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				employee  = new Employee();
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setKinID(rs.getString(3));
				employee.setPhoneNo(rs.getLong(4));
				employee.setDateOfBirth(rs.getDate(5));
				employee.setDateOfJoining(rs.getDate(6));
				employee.setAddress(rs.getString(7));
				employee.setDepartmentID(rs.getInt(8));
				employee.setProjectID(rs.getInt(9));
				employee.setProjectID(rs.getInt(10));
			}
		} catch (SQLException e) {
		}
		return employee;
	}

	@Override
	public ArrayList<Employee> getAllEmployee() {
		Employee employee = null;
		ArrayList<Employee> employeeList = new ArrayList<>();
		try (Connection con = DriverManager.getConnection(url);
				PreparedStatement ps = con.prepareStatement(props.getProperty("jdbc.query.displayAll"))) {
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					employee =new Employee();

					employee.setId(rs.getInt(1));
					employee.setName(rs.getString(2));
					employee.setKinID(rs.getString(3));
					employee.setPhoneNo(rs.getLong(4));
					employee.setDateOfBirth(rs.getDate(5));
					employee.setDateOfJoining(rs.getDate(6));
					employee.setAddress(rs.getString(7));
					employee.setDepartmentID(rs.getInt(8));
					employee.setProjectID(rs.getInt(9));
					employee.setProjectID(rs.getInt(10));
					employeeList.add(employee);
				}
		} catch (SQLException e) {
		}
		return employeeList;
	}
}
