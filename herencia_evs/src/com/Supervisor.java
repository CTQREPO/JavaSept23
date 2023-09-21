package com;

import java.util.Date;

public class Supervisor extends Empleado {
	
	
	int personalAcargo;
	
	public Supervisor (){
		
		}

	public Supervisor(String nomnbre, Date fechaNac, double statura, String sexo, double salario, int numEmpleado,
			String nss, int personalAcargo) {
		super(nomnbre, fechaNac, statura, sexo, salario, numEmpleado, nss);
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
		return "Supervisor [personalAcargo=" + personalAcargo + ", salario=" + salario + ", numEmpleado=" + numEmpleado
				+ ", nss=" + nss + ", nomnbre=" + nomnbre + ", fechaNac=" + fechaNac + ", statura=" + statura
				+ ", sexo=" + sexo + "]";
	}
	
	
	
}
