package com;

import java.util.Date;

public class Principal {
	
	public static void main(String[] args) {
		
		Date fecha = new Date(123, 8, 20);
		
		//Persona p = new Persona("Mario", fecha, 1.80, "MASCULINO");
		
		//System.out.println(p);
		
		//Objeto que hereda de Persona
		Empleado e = new Empleado();
		e.comer();
		
		
	}

}
