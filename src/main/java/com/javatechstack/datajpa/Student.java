package com.javatechstack.datajpa;

import java.time.LocalDate;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
  
	@Id
	private int       id;
	private String    fname;
	private String    lname;
	private LocalDate dob;
	private String    gender;
	private String    email;
	private long      phonenumber;
	private String    guardianfname;
	private String    guardianlname;
	private String    guardianemail;
	private long      guardianphonenumber;
	private String    address;
	public Student() {
		
	}
	public Student(int id, String fname, String lname, LocalDate dob, String gender, String email, long phonenumber,
			String guardianfname, String guardianlname, String guardianemail, long guardianphonenumber,
			String address) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.gender = gender;
		this.email = email;
		this.phonenumber = phonenumber;
		this.guardianfname = guardianfname;
		this.guardianlname = guardianlname;
		this.guardianemail = guardianemail;
		this.guardianphonenumber = guardianphonenumber;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getGuardianfname() {
		return guardianfname;
	}
	public void setGuardianfname(String guardianfname) {
		this.guardianfname = guardianfname;
	}
	public String getGuardianlname() {
		return guardianlname;
	}
	public void setGuardianlname(String guardianlname) {
		this.guardianlname = guardianlname;
	}
	public String getGuardianemail() {
		return guardianemail;
	}
	public void setGuardianemail(String guardianemail) {
		this.guardianemail = guardianemail;
	}
	public long getGuardianphonenumber() {
		return guardianphonenumber;
	}
	public void setGuardianphonenumber(long guardianphonenumber) {
		this.guardianphonenumber = guardianphonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
