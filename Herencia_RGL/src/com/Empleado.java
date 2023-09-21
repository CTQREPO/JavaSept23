package com;

import java.util.Date;

public class Empleado extends Persona implements IArquitectura, IMedicina,IMarketing {
	
	double salario;
	int id;
	String nss;

	public Empleado() {
		
		
	}

	public Empleado(String nombre, Date fechaNac, double estatura, String sexo, double salario, int id, String nss) {
		super(nombre, fechaNac, estatura, sexo);
		this.salario = salario;
		this.id = id;
		this.nss = nss;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", id=" + id + ", nss=" + nss + ", nombre=" + nombre + ", fechaNac="
				+ fechaNac + ", estatura=" + estatura + ", sexo=" + sexo + "]";
	}
	
	
	
	
	
	//1 Metodo nativo
	
	public void cobrar ( ) {
		
	}
	
	public static void pagarImpuestos() {
		
	}

	@Override //Sobreescritura (forma 2)
	public void caminar() {
		System.out.println("En dos piernas");
		
	}
	
	@Override  //Sobreescritura (forma 2)
	public void comer () {
		System.out.println("Comer en un restaurante");	
	}
	
	@Override // Metodos de la forma 3 (metodos implementados)
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
	public void generarDiagnostico() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inyectar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hacerFolletos() {
		// TODO Auto-generated method stub
		
	}
}
