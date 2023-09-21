package com;

public interface IArquitectura {

	//Lo que encontremos en un Interface siempre vana ser Metodo PUBLICOS
	//NO  es necesario agregar el "public"
	
	//Ejemplo
//	public void diseñar(); ----> NO
//	void diseñar(); ----> SI
	
	void diseñar();
	double generarPresupuesto(double m2, String materiales);
	
	
}
