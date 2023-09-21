package com;

import java.util.Date;

public class Principal {
	public static void main(String [] args) {
		
		Date fecha = new Date(123,128,20);
		System.out.println();
		System.out.println(fecha);
		
		//Persona p = new Persona("Mario", fecha, 1.80, "MASCULINO");
		//
		Empleado e= new Empleado();
		e.comer();
	}
}
