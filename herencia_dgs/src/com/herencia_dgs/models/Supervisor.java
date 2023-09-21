package com.herencia_dgs.models;

import java.util.Date;

public class Supervisor extends Persona{

	int personalAcargo;

	public Supervisor() {
		super();
	}

	public Supervisor(String name, Date birthdate, String gender, double height, int personalAcargo) {
		super(name, birthdate, gender, height);
		this.personalAcargo = personalAcargo;
	}

	public int getPersonalAcargo() {
		return personalAcargo;
	}

	public void setPersonalAcargo(int personalAcargo) {
		this.personalAcargo = personalAcargo;
	}

	@Override
	public String toString() {
		return "Supervisor [personalAcargo=" + personalAcargo + ", name=" + name + ", birthdate=" + birthdate
				+ ", gender=" + gender + ", height=" + height + "]";
	}

	@Override
	void caminar() {
		// TODO Auto-generated method stub
		
	}
	
}
