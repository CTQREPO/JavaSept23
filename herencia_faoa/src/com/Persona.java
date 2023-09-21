package com;

import java.util.Date;

public abstract class Persona {

	String nombre;
	Date fechaNac;
	double estatura;
	String sexo;
		
	public Persona() {
		
	}

	//Para HEREDAR en los constructores
	//en el click derecho, souerce, Generate Constructor Using Fields
	// En la primera opción: "Select Super Constructor using Invoke:"
	//Seleccionamos el Metodo con ARGUMENTOS, en lugar del VACIO
	
	public Persona(String nombre, Date fechaNac, double estatura, String sexo) {
		super();
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.estatura = estatura;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", fechaNac=" + fechaNac + ", estatura=" + estatura + ", sexo=" + sexo
				+ "]";
	}
	
	
				//METODOS ABSTRACTOS
	
	//Metodo Abstracto
	//Su Utilidad es SERVIR DE HERENCIA para otra clases
	
	/*Aqui dice (Una Persona tiene que Caminar,
			EL COMO LO HAGAS, lo elige uno mismo) */
	
//	public void caminar(); 		// Posicionas el puntero sobre el y seleccionas
								//"Change 'Persona.caminar' to ' Abstract"
	
//	public abstract void caminar();	
	
	//Posicionas el puntero sobre el y seleccionas
	//Make type 'Persona' abstract
	
	public abstract void caminar();
	
	// hasta arriba se agregara el valor a la clase "abstract" 
	//  "public abstract class Persona {}"
	
	
	
	//SOBRESCRITURA
	/* es para relizar el mismo fin
	Pero a su manera (diferente)*/
	/*Se tiene qie agregar: "@Override"
	En la Clase de donde quieres que tome la nueva marena para realizarla*/
	
	public void comer() {
		System.out.println("Comer en casa");
		
	}
	
	
	
}
