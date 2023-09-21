package com.herencia_dgs.models;

import java.util.Date;

public abstract class Persona {

	String name;
	Date birthdate;
	String gender;
	double height;
	
	public Persona() {}
	
	public Persona(String name, Date birthdate, String gender, double height) {
		super();
		this.name = name;
		this.birthdate = birthdate;
		this.gender = gender;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Persona [name=" + name + ", birthdate=" + birthdate + ", gender=" + gender + ", height=" + height + "]";
	}
	
	abstract void caminar();
	
}