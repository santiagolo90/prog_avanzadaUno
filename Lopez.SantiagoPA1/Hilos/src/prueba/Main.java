package prueba;

import java.util.ArrayList;
import java.util.List;

import e19.Ejecutar;

public class Main {

	public static void main(String[] args) {
		List<String> palabras =  new ArrayList<String>();
		
		Palabra p = new Palabra(palabras);
		Eliminar e = new Eliminar(palabras);
		Thread uno = new Thread(e);
		uno.setName("hilo uno");
		Thread dos = new Thread(e);
		dos.setName("hilo dos");
		Thread tres = new Thread(e);
		tres.setName("hilo tres");
		Thread cuatro = new Thread(p);
		cuatro.setName("hilo cuatro palabra");
		
		uno.start();
		dos.start();
		tres.start();
		cuatro.start();

	}

}
