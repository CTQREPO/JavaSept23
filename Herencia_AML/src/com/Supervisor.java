package com;

import java.util.Date;

public class Supervisor extends Empleado{
	
	int PersonalACargo;
	
	public Supervisor() {
		
	}

	public Supervisor(String nombre, Date fechaNac, double estatura, String sexo, double salario, int numEpleado,
			String nss, int personalACargo) {
		super(nombre, fechaNac, estatura, sexo, salario, numEpleado, nss);
		PersonalACargo = personalACargo;
	}

	public int getPersonalACargo() {
		return PersonalACargo;
	}

	public void setPersonalACargo(int personalACargo) {
		PersonalACargo = personalACargo;
	}

	@Override
	public String toString() {
		return "Supervisor [PersonalACargo=" + PersonalACargo + ", salario=" + salario + ", numEpleado=" + numEpleado
				+ ", nss=" + nss + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", estatura=" + estatura
				+ ", sexo=" + sexo + "]";
	}

	
}
