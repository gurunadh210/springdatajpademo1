package com.javatechstack.datajpa;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Subject {
	
	@Id
	private int id;
	private String name;
	private String type;
	private String category;
	private int    credits;
	private String lecturername;
	private String year;
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(int id, String name, String type, String category, int credits, String lecturername, String year) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.category = category;
		this.credits = credits;
		this.lecturername = lecturername;
		this.year = year;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getLecturername() {
		return lecturername;
	}
	public void setLecturername(String lecturername) {
		this.lecturername = lecturername;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}

	
}
