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
	//1Metodo Nativo
	
	public void cobrar() {
		
	}
	
	public void pagarImpuestos() {
		System.out.println(":C");
	}

	@Override //Sobreescritura(forma 2)
	public void caminar() {
		System.out.println("En dos piernas");
	}
	
	@Override
	public void comer () {
		System.out.println("Comer en restaurant");
	}
	
	//Metodos de la forma 3(metodos implementados)

	@Override
	public void dise�ar() {
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

