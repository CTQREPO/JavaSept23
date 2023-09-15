package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) {

		String linea = "";
		
		try { //Intenta
			//Representación del archivo con su dirección
			File fichero = new File("C:\\Users\\femur\\OneDrive\\Escritorio\\texto.txt");
			//Clase para la escritura de archivo
			FileWriter writer = new FileWriter(fichero, false);
			//Copia del archivo en modo solo lectura
			//FileReader fr = new FileReader(fichero);
			//Carga la copia anterior para poder leerla
			//BufferedReader bfr = new BufferedReader(fr);
			//Este while itera sobre los renglones, leyendo una línea a la vez

//			while((linea=bfr.readLine())!=null) {
//			System.out.println(linea);
				
//			}
		
			int x = 0;
			while(x<40) {
				writer.write("HOLA DESDE JAVA:"+x+"\n");
				x++;

			}
			writer.close();
		}catch(Exception ex) { //Atrapa el error
			ex.printStackTrace();
			
		}
		
		
	}


}
