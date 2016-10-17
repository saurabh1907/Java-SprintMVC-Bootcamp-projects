package com.flp.ems.dao;

import java.io.BufferedInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

import javax.sql.DataSource;

import com.flp.ems.domain.Employee;
import com.flp.ems.util.DBUtility;

public class EmployeeDaoImplForDB implements IemployeeDao {
	private DataSource dataSource;

	{
			dataSource= DBUtility.getDataSource("jdbc/MyDataSource");
	}

	@Override
	public void addEmployee(Employee employee) {
		try (Connection con = dataSource.getConnection();
				PreparedStatement ps = con.prepareStatement(
						"insert into employee(name,kinID,phoneNo,dateOfBirth,dateOfJoining,address,departmentID,projectID,rolesID) values(?,?,?,?,?,?,?,?,?)")) {
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getKinID());
			ps.setLong(3, employee.getPhoneNo());
			ps.setDate(4, employee.getDateOfBirth());
			ps.setDate(5, employee.getDateOfJoining());
			ps.setString(6, employee.getAddress());
			ps.setInt(7, employee.getDepartmentID());
			ps.setInt(8, employee.getProjectID());
			ps.setInt(9, employee.getRolesID());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void modifyEmployee(Employee employee) {
		try (Connection con = dataSource.getConnection();
				PreparedStatement ps = con.prepareStatement("update employee set name = ?, phoneNo= ?, dateOfBirth = ?, dateOfJoining = ?, address = ?, departmentID=?, projectID=?, rolesID=? where kinID=?")){
			ps.setString(1, employee.getName());
			ps.setLong(2, employee.getPhoneNo());
			ps.setDate(3, employee.getDateOfBirth());
			ps.setDate(4, employee.getDateOfJoining());
			ps.setString(5, employee.getAddress());
			ps.setInt(6, employee.getDepartmentID());
			ps.setInt(7, employee.getProjectID());
			ps.setInt(8, employee.getRolesID());
			ps.setString(9, employee.getKinID());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeEmployee(int empID) {

		try (Connection con = dataSource.getConnection();
				PreparedStatement ps = con.prepareStatement("delete from employee where id=?")) {
			ps.setInt(1, empID);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Employee searchEmployee(String nameOrId) {
		String query;
		String regexInteger = "[0-9]+";
		Employee employee = null;

		if (nameOrId.matches(regexInteger))
			query = "select * from employee where id=?";
		else
			query = "select * from employee where kinID= ?";

		try (Connection con = dataSource.getConnection();
				PreparedStatement ps = con.prepareStatement(query)) {
			ps.setString(1, nameOrId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				employee = new Employee();
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setKinID(rs.getString(3));
				employee.setPhoneNo(rs.getLong(4));
				employee.setDateOfBirth(rs.getDate(5));
				employee.setDateOfJoining(rs.getDate(6));
				employee.setAddress(rs.getString(7));
				employee.setDepartmentID(rs.getInt(8));
				employee.setProjectID(rs.getInt(9));
				employee.setRolesID(rs.getInt(10));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public ArrayList<Employee> getAllEmployee() {
		Employee employee = null;
		ArrayList<Employee> employeeList = new ArrayList<>();
		try (Connection con = dataSource.getConnection();
				PreparedStatement ps = con.prepareStatement("select * from employee")) {
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				employee = new Employee();

				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setKinID(rs.getString(3));
				employee.setPhoneNo(rs.getLong(4));
				employee.setDateOfBirth(rs.getDate(5));
				employee.setDateOfJoining(rs.getDate(6));
				employee.setAddress(rs.getString(7));
				employee.setDepartmentID(rs.getInt(8));
				employee.setProjectID(rs.getInt(9));
				employee.setRolesID(rs.getInt(10));
				employeeList.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employeeList;
	}
}
