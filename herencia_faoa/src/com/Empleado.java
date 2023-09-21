package com;

import java.util.Date;

public class Empleado extends Persona implements IArquitectura, IMedicina, IMarketing {

	double salario;
	int numEmpleado;
	String nss;
	
	
	public Empleado() {
		
	}


	public Empleado(String nombre, Date fechaNac, double estatura, String sexo, double salario, int numEmpleado,
			String nss) {
		super(nombre, fechaNac, estatura, sexo);
		this.salario = salario;
		this.numEmpleado = numEmpleado;
		this.nss = nss;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public int getNumEmpleado() {
		return numEmpleado;
	}


	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}


	public String getNss() {
		return nss;
	}


	public void setNss(String nss) {
		this.nss = nss;
	}


	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", numEmpleado=" + numEmpleado + ", nss=" + nss + ", nombre=" + nombre
				+ ", fechaNac=" + fechaNac + ", estatura=" + estatura + ", sexo=" + sexo + "]";
	}
	
	
	
	
	
	
	
	
		// METODOS para que las CLASES adquieran Comportamiento
	
	
	
	
	// Metodo 1
	// METODO NATIVO
	
	public void cobrar() {
		
	}
	
	public void pagarImpuestos() {
		System.out.println(":C");
	}


	
	
	
	//Metodo 2
	//Metodo por SOBREESCRITURA
	//SOBREESCRITURA POR MANDATO
	
	@Override
	public void caminar() {
		System.out.println("En dos piernas");
		// TODO Auto-generated method stub	
	}
	
	
	@Override // Se agrega para cumplir con la misma peticion, pero ya a su manera diferente
	public void comer() {
		System.out.println("Comer en un restaurante");
	}

	
	
	
	
	//Metodo 3
	// METODOS IMPLEMENTADOS
	//Se agregan en Automatico
	//Posicionas el puntero en la clase "Empleado" en el metodo main
				//Aqui abajo
	//public class "Empleado" extends Persona implements IArquitectura, IMedicina, IMarketing { }
	
	//Le pones en "Add unimplemented methods"
	//Se agregaran en automatico hasta abajo
	
	
	
	@Override
	public void diseñar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public double generarPresupuesto(double m2, String materiales) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void investigacionMercado() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void hacerFolletos() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void generarDiagnostico() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void inyectar() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
