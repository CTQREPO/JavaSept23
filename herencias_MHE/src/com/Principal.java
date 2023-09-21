package com;

import java.util.Date;

public class Principal {
	public static void main(String[] args) {

		Date fecha = new Date(123, 8, 20);
		System.out.println(fecha);
		//Objeto hered
		//	Persona p = new Persona("Juan",fecha , 1.80, "Masculino");
		//	System.out.println(p);
		
	Empleado e = new Empleado();
	e.comer();
	
	
	
	
	}
}
