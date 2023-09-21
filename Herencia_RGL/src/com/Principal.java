package com;

import java.util.Date;

public class Principal {
public static void main(String [] args) {
	
	Date fecha= new Date(123, 5, 18);
	
			System.out.println(fecha);
	
//	Persona p= new Persona("Rafa", fecha, 1.70, "Masculino");
//	System.out.println(p);
//	
	//Objeto que hereda desde persona
	
	Empleado e=new Empleado();
	e.comer();

}
	
}
