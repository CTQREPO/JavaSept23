package com;

import java.util.Date;

public class Supervisor extends Empleado {

	int personalACargo;
	
	
	
	public Supervisor() {
		
	}



	public Supervisor(String nombre, Date fechaNac, double estatura, String sexo, double salario, int numEmpleado,
			String nss, int personalACargo) {
		super(nombre, fechaNac, estatura, sexo, salario, numEmpleado, nss);
		this.personalACargo = personalACargo;
	}



	public int getPersonalACargo() {
		return personalACargo;
	}



	public void setPersonalACargo(int personalACargo) {
		this.personalACargo = personalACargo;
	}



	@Override
	public String toString() {
		return "Supervisor [personalACargo=" + personalACargo + ", salario=" + salario + ", numEmpleado=" + numEmpleado
				+ ", nss=" + nss + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", estatura=" + estatura
				+ ", sexo=" + sexo + "]";
	}
	
	
	
	
	
	
	
}
