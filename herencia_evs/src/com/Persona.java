package com;

import java.util.Date;

public abstract class Persona {
	
	String nomnbre;
	Date fechaNac;
	double statura;
	String sexo;
	
	
	
	public Persona() {
		
	}
	
	public Persona(String nomnbre, Date fechaNac, double statura, String sexo) {
		super();
		this.nomnbre = nomnbre;
		this.fechaNac = fechaNac;
		this.statura = statura;
		this.sexo = sexo;
	}


	public String getNomnbre() {
		return nomnbre;
	}


	public void setNomnbre(String nomnbre) {
		this.nomnbre = nomnbre;
	}


	public Date getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}


	public double getStatura() {
		return statura;
	}


	public void setStatura(double statura) {
		this.statura = statura;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	@Override
	public String toString() {
		return "Persona [nomnbre=" + nomnbre + ", fechaNac=" + fechaNac + ", statura=" + statura + ", sexo=" + sexo
				+ "]";
	}


	
	//Metodos Abstractos (HACER QUE)
	public abstract void caminar();
	
	
	public void comer() {
		System.out.println("Comer en casa");
	}
	
	


}
