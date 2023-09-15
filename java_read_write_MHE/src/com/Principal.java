package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {
	public static void main(String[] args) {
		
		String linea = "";
		
		try {//intenta
			//Representación del archivo con su dirección
			File fichero = new File("C:\\Users\\mafer\\Desktop\\texto.txt");
			//Clase para la escritura de archivos
			FileWriter writer = new FileWriter(fichero,false); //Si se le cambia a false se elimina todo el contenido de archivo origianl y escribe lo que aquí pongas
			//Copia del archivo en modo solo lectura
//			FileReader fr = new FileReader(fichero);
			//Carga la copia anterior para poder leerla
//			BufferedReader bfr = new BufferedReader(fr);
			
			//Este while itera sobre los renglones, leyendo una linea a la vez
//			while ((linea=bfr.readLine())!=null) {
//				System.out.println(linea);
//			}
			
			int x=0;
					while (x<40) {
			writer.write("Solo debe haber una línea: "+x+"\n");
			x++;
			
					}
			
			writer.close();
			
		}catch(Exception ex) { //atrapa
			ex.printStackTrace();
		}
		
	}
}
