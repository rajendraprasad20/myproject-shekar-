package com.shekarpojo;

public class StudentPojo {
	
	@Override
	public String toString() {

		return id+" : "+name+" : "+study+" : "+location;
	}
	private int id;
	private String name;
	private String study;
	private String location;
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
	public String getStudy() {
		return study;
	}
	public void setStudy(String study) {
		this.study = study;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
