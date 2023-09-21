package com;

import java.util.Date;

public class Empleado extends Persona implements IArquitectura, IMedicina, IMarketing {

	double sueldo;
	int numEmpleado;
	String nss;

	public Empleado() {

	}

	public Empleado(String nombre, Date fechaNac, double estatura, String sexo, double sueldo, int numEmpleado,
			String nss) {
		super(nombre, fechaNac, estatura, sexo);
		this.sueldo = sueldo;
		this.numEmpleado = numEmpleado;
		this.nss = nss;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
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
		return "Empleado [sueldo=" + sueldo + ", numEmpleado=" + numEmpleado + ", nss=" + nss + "]";
	}

	// 1 Metodo nativo
	public void cobrar() {

	}

	public void pagarImpuestos() {
		System.out.println(":C");
	}

	@Override // sobreescritura
	public void caminar() {
		System.out.println("En dos piernas");
	}

	@Override
	public void comer() {
		System.out.println("Comer en un restaurante");
	}

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
	public void generarDiagonostico() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inyectar() {
		// TODO Auto-generated method stub
		
	}
	
	

}
