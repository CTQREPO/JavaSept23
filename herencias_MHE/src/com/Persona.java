package com;

import java.util.Date;

public abstract class Persona {
String nombre;
Date fechaNac;
double estatura;
String sexo;

public Persona () {
	
}

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
	return "Persona [nombre=" + nombre + ", fechaNac=" + fechaNac + ", estatura=" + estatura + ", sexo=" + sexo + "]";
}

//Métodos abstractos , No tiene cuerpo, no termina con llave sino con punto y coma
	//Separa el QUE del COMO
public abstract void caminar () ;


public void comer () {
	System.out.println("Comer en casa");
}

	
}//FINAL
