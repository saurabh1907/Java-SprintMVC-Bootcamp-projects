package com.flp.ems.domain;

public class Project {
private int projectID;
private String name;
private String description;
private int departmentID;

public Project(){
	
}
public int getProjectID() {
	return projectID;
}
public void setProjectID(int projectID) {
	this.projectID = projectID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getDepartmentID() {
	return departmentID;
}
public void setDepartmentID(int departmentID) {
	this.departmentID = departmentID;
}

}
