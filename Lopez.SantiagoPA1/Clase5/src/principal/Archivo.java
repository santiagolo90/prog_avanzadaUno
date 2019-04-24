package principal;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
	
	//File f = new File("D:\\","miArchivo.txt");
	

	
	public void Guardar(File f){

			try {
				f.createNewFile();
				FileWriter fw = new FileWriter(f,true);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(" aaa ");
				bw.flush();//limpia y pasa a disco
				bw.close();
				fw.close();
				Leer(f);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
	public void Leer(File f){
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea = null;
			while( (linea = br.readLine()) != null){
			
				
				System.out.print(linea);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void LeerArchivo(){
		try {
			File origen = new File("/home/slopez-ubuntu/Imágenes/Bolucosas/1znq2qe.jpg");
			File destino = new File("/home/slopez-ubuntu/a.jpg");
			
			FileInputStream fi = new FileInputStream(origen);
			BufferedInputStream binput = new BufferedInputStream(fi);
			
			FileOutputStream fo = new FileOutputStream(destino);
			BufferedOutputStream bo = new BufferedOutputStream(fo);
			
			int cant =1024;
			byte[] aux =  new byte[cant];
			int leidos;
			
			/***
			 * cuantos pudo leer desde el 0 hasta el cant
			 * cuando termina devuelve -1
			 */
			while((leidos = binput.read(aux,0,cant)) != -1){
				bo.write(aux,0,leidos);
			}
			
			bo.flush();//limpia y pasa a disco
			bo.close();
			binput.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

