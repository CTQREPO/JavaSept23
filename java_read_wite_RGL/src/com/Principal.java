package com;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.Scanner;
public class Principal {
	public static void main(String[]args) {
		
		String linea = "";
		try {
			File fichero = new File("\"C:\\Users\\gateway\\Desktop\\texto.txt\"");
			//Clase para la escritura de archivos
			FileReader fr= new FileReader(fichero);
			BufferedReader bfr = new BufferedReader(fr);
			
			while ( (linea=bfr.readLine() )!=null) {
			System.out.println(linea);
			
			}
			
		}catch(Exception ex) {
		ex.printStackTrace();
		
	}

}
}
