package java_read_write_dgs;

import java.io.File;
import java.io.FileWriter;

public class FileReadWrite {
	public static void main(String []args) {

		String linea = "";

		try {//INTENTA
			//REPRESENTACION DEL ARCHIVO CON SU DIRECCION
			File fichero = new File("C:\\Users\\rog\\Desktop\\Texto.txt");

			FileWriter write = new FileWriter(fichero, true);


			int x = 0;
			while(x<40) {
			write.write("Java GPI: " +x+ "\n");
			x++;
//			//COPIA DEL ARCHIVO EN MODO SOLO LECTURA
//			FileReader fr = new FileReader(fichero);
//			//CARGA LA COPIA ANTERIOR PARA PODER LEERLA
//			BufferedReader bfr = new BufferedReader(fr);
//
//			//ESTE WHILE ITERA SOBRE LOS RENGLONES, LEYENDO UNA LINEA A LA VEZ
//			while((linea=bfr.readLine () ) !=null ) {
//				System.out.println(linea);
			}
			write.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}

}
