package com.example.jsfdemo.domain;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Person {
	
	private String firstName = "unknown";
	private String zipCode = "";
	private String pin = "";
	private String pesel = "";
	private String Name = "imie";
	private String yob = "";
	private Date dateOfBirth = new Date();
	private double weight;
	private boolean married;
	private int numOfChildren;
	private Date date = new Date();
	boolean editable;
	
	@Size(min = 2, max = 20)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Pattern(regexp = "[0-9]{2}-[0-9]{3}")
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	@Size(min = 2)
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	@Min(0)
	public int getNumOfChildren() {
		return numOfChildren;
	}
	public void setNumOfChildren(int numOfChildren) {
		this.numOfChildren = numOfChildren;
	}
	
	@Past
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Min(1)
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	@Size(min = 2, max = 20)
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Size(min = 4, max = 4)
	public String getYob() {
		return yob;
	}
	public void setYob(String yob) {
		this.yob = yob;
	}
	@Future
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Pattern(regexp = "[0-9]{2}[0-1]{1}[0-9]{1}[0-3]{1}[0-9]{6}")
	public String getPesel() {
		return pesel;
	}
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}
	public boolean isEditable() {
		return editable;
	}
	public void setEditable(boolean editable) {
		this.editable = editable;
	}
}
