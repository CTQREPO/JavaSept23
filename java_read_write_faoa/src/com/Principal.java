package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) {
		
		String linea = "";
		
		//Se utilizan para leer archivos
		try { //"Intenta" hacer el iguiente proceo
			File fichero = new File("C:\\Users\\andru\\Documents\\1.1 CURSOS\\Curso Programacion CETEQ\\texto.txt");  //Representacion del Archivo con su Direccion
			
			FileWriter writer = new FileWriter(fichero,true); //Clase parta la escritura de archivos
															  //Cuando se le agrega el "true", es para agregar texto al archivo
															  //Cuando se le agrega el "false", es para sobrescribir el texto del archivo
			
//			FileReader fr = new FileReader(fichero); //FileReader es una Copia del archivo en modo Solo Lectura
//			BufferedReader bfr = new BufferedReader(fr); // BufferedReader carga la copia anterior para poderla leer
//			
//			while((linea=bfr.readLine())!=null) { //Este Ritera sobre los renglones, leyendo una linea a la vez
//				System.out.println(linea);
//			}
			int x = 0;
			while(x<40) {
			writer.write("SOLO DEBE HABER UNA LINEA: "+x+"\n");
			x++; 
			}
			writer.close();
		}catch(Exception ex) { // Atrapa el ERROR
			ex.printStackTrace();
		}
	}
	
}
