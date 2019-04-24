package principal;

import java.io.File;
import java.io.FileWriter;

public class Main {
	
	public static void main(String[] args) {
		//File f = new File("D:\\","miArchivo.txt");
		
		//Archivo a = new Archivo();
		//a.Guardar(f);
		//a.LeerArchivo();
		
		File archivosOrigen = new File("/home/slopez-ubuntu/Imágenes");
		File root = new File("");
		File destino = new File(root.getAbsolutePath().concat("/imagenes/"));
		
		Archivos as = new Archivos();
		//as.copiarArchivosNIO(archivosOrigen, destino);
		as.copiarDirectorios(archivosOrigen, destino);

	}
	
	

}
