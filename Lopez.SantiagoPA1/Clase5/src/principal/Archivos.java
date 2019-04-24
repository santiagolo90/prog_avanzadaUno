package principal;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*
	EJERCICIO ARCHIVOS 
	copiar toda la carpeta de imágenes en el src de nuestro proyecto 
	objects de tipo directorio que apunte al nuevo
	hacer un list de eso y por cada uno copiarlo en el src
	
File f = new File (“ruta del archivo”,“nombre del archivo”.txt );

F.exists si existe true/flase
F.isDirectory() //true /false
F.isFile() //true /false
f.mkdir() //crea el directorio 
f.mkdirs() //crea todos directorio 
F.list();// devuelve una lista de los archivos
F.listFiles();// devuelve una lista de los archivos en el directorio

 */
public class Archivos {
	
	public void copiarArchivosNIO(File archivosOrigen, File destino){
		try {
			
			if (!destino.exists()){                              
				destino.mkdir();
				System.out.println("creo directorio " + destino.toString());
			}
			
			for (File arc : archivosOrigen.listFiles()) {
				//System.out.println(Paths.get(arc.getAbsolutePath()));
				//System.out.println(Paths.get(destino.getAbsolutePath().concat("/"+arc.getName())));
				Path origenPath = Paths.get(arc.getAbsolutePath());
				Path destinoPath = Paths.get(destino.getAbsolutePath().concat("/"+arc.getName()));

			    if (arc.exists()) {
			        Files.copy(origenPath, destinoPath,StandardCopyOption.REPLACE_EXISTING);
			    } else {
			        System.out.println("El fichero "+arc.getName()+" no existe en el directorio "+archivosOrigen.getAbsolutePath());
			    }
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void copiarDirectorios(File d1, File d2){
		  if (d1.isDirectory()){
			  if (!d2.exists()){                              
				  	d2.mkdir();
				  	System.out.println("Creando directorio " + d2.toString());
				  }
			  String[] ficheros = d1.list();
			  for (int x=0;x<ficheros.length;x++) {
			    copiarDirectorios(new File(d1,ficheros[x]),new File(d2,ficheros[x]));                           
			  }
		  }
		  else {
			  copiarFicheros(d1,d2);
		  }
		}
	
	
	public static void copiarFicheros(File f1, File f2){
		  try {
		    InputStream in = new FileInputStream(f1);
		    OutputStream out = new FileOutputStream(f2);
		 
		    byte[] buf = new byte[1024];
		    int len;
		 
		    while ((len = in.read(buf)) > 0) {
		      out.write(buf, 0, len);
		    }
		 
		    in.close();
		    out.close();
		 
		  } catch (IOException e){
		    e.printStackTrace();
		  }
		}

}
