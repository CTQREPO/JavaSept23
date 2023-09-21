package com;

import java.util.Date;

public class Principal {
	
	public static void main(String[] args) {
		
		Date fecha = new Date(100, 6, 2);
		System.out.println(fecha);
		
//		Persona p = new Persona("Edd", fecha, 1.78, "Masculino");
//		System.out.println(p);
		
		//Objeto que hereda de persona 
		Empleado e= new Empleado();
		//Persona p= new Persona ();
		e.comer();
		//p.comer();
	}

}
