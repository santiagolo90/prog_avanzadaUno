package principal;

import java.io.File;
import java.io.FileWriter;

public class Main {
	
	public static void main(String[] args) {
		File f = new File("D:\\","miArchivo.txt");
		
		Archivo a = new Archivo();
		a.Guardar(f);
		a.LeerArchivo();

	}
	
	

}
