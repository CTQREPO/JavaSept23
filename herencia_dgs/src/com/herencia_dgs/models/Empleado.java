package com.herencia_dgs.models;

import java.util.Date;

public class Empleado extends Persona implements IDoctor{
	
	double salario;
	int numEmpleado;
	String nss;
	
	
	public Empleado(String name, Date birthdate, String gender, double height, double salario, int numEmpleado,
			String nss) {
		super(name, birthdate, gender, height);
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
		return "Empleado [salario=" + salario + ", numEmpleado=" + numEmpleado + ", nss=" + nss + ", name=" + name
				+ ", birthdate=" + birthdate + ", gender=" + gender + ", height=" + height + "]";
	}


	@Override
	public void operar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void Limpiar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	void caminar() {
		// TODO Auto-generated method stub
		
	}

	
	
}
