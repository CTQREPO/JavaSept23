package com;

import java.util.Date;

public class Supervisor extends Empleado {
	
	int personalACargo;
	
	public Supervisor() {
		
	}

	public Supervisor(String nombre, Date fechaNac, double estatura, String sexo, double sueldo, int numEmpleado,
			String nss, int personalACargo) {
		super(nombre, fechaNac, estatura, sexo, sueldo, numEmpleado, nss);
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
		return "Supervisor [personalACargo=" + personalACargo + "]";
	}
	
	
	
}
