package e18;

public class miHilo implements Runnable {
	/*
18. Crear una clase llamada mi hilo que implemente la runnable. En el método run creo un for
de dos mil iteraciones que muestren por consola el número de iteración y el nombre del
hilo.
Generar un test que cree 3 hilos, los ejecute y muestre un mensaje cuando todos los hilos
finalicen.
	 * */
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 2000; i++) {
			
		}
		return;

	}

}
