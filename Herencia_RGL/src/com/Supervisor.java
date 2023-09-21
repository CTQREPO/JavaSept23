package com;

import java.util.Date;

public class Supervisor extends Empleado{
	
	
	int personalACargo;
	
	
	public Supervisor ( ) {
		
	}


	public Supervisor(String nombre, Date fechaNac, double estatura, String sexo, double salario, int id, String nss,
			int personalACargo) {
		super(nombre, fechaNac, estatura, sexo, salario, id, nss);
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
		return "Supervisor [personalACargo=" + personalACargo + ", salario=" + salario + ", id=" + id + ", nss=" + nss
				+ ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", estatura=" + estatura + ", sexo=" + sexo + "]";
	}

	
	
}
