package com;

public interface IArquitectura {

	//Lo que encontremos en un Interface siempre vana ser Metodo PUBLICOS
	//NO  es necesario agregar el "public"
	
	//Ejemplo
//	public void dise�ar(); ----> NO
//	void dise�ar(); ----> SI
	
	void dise�ar();
	double generarPresupuesto(double m2, String materiales);
	
	
}
