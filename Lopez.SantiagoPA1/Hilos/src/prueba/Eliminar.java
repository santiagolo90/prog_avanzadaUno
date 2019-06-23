package prueba;

import java.util.List;

public class Eliminar implements Runnable {
	private List<String> palabras;
	
	public Eliminar(List<String> p) {
		this.palabras = p;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			
			synchronized (palabras) {
				if (this.palabras.size() == 0) {
					System.out.println("no hay palabras en la lista, hilo: ".concat(Thread.currentThread().getName()));

					this.palabras.wait();
					
				}
				this.palabras.remove(0);
				System.out.println("Se elimino palabra en el hilo".concat(Thread.currentThread().getName()));
				this.palabras.notify();
			
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
