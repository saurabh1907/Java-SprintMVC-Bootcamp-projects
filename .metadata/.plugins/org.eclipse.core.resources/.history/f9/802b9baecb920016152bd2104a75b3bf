package com.flp.ems.domain;

import java.sql.Date;

public class Employee {
private int id;
private String name;
private String kinID;
//private String emailID;
private long phoneNo;
private Date dateOfBirth;
private Date dateOfJoining;
private String address;
private int departmentID;
private int projectID;
private int rolesID;

public Employee(String name,String kinID, long phoneNo, Date dob, Date doj, String address, int deptID, int projectID, int rolesID){
	this.name=name;
	this.kinID=kinID;
	this.phoneNo= phoneNo;
	this.dateOfBirth= dob;
	this.dateOfJoining=doj;
	this.address=address;
	this.departmentID=deptID;
	this.projectID=projectID;
	this.rolesID=rolesID;	
}
public Employee (){
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getKinID() {
	return kinID;
}
public void setKinID(String kinID) {
	this.kinID = kinID;
}
//public String getEmailID() {
//	return emailID;
//}
//public void setEmailID(String emailID) {
//	this.emailID = emailID;
//}
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public Date getDateOfJoining() {
	return dateOfJoining;
}
public void setDateOfJoining(Date dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getDepartmentID() {
	return departmentID;
}
public void setDepartmentID(int departmentID) {
	this.departmentID = departmentID;
}
public int getProjectID() {
	return projectID;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", kinID=" + kinID + ", phoneNo=" + phoneNo + ", dateOfBirth="
			+ dateOfBirth + "]";
}
public void setProjectID(int projectID) {
	this.projectID = projectID;
}
public int getRolesID() {
	return rolesID;
}
public void setRolesID(int rolesID) {
	this.rolesID = rolesID;
}
@Override
	public boolean equals(Object obj) {
		if(obj!=null)
			return this.id == ((Employee)obj).id;
		else return false;
			
	}


}
