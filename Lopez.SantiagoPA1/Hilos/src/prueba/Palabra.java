package prueba;

import java.util.List;

public class Palabra implements Runnable {
	
	private List<String> palabras;
	
	public Palabra(List<String> p) {
		this.palabras = p;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(2000);
				
				synchronized (palabras) {
					System.out.println("Se agrego una palabra en el hilo ".concat(Thread.currentThread().getName()));

					this.palabras.add("Palabra");
					this.palabras.notify();
					
				}
				
				if (this.palabras.size() == 4) {
					System.out.println("Fin del programa");

					return;
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}


	}

}
