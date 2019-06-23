package e18;

public class Main {

	/*
18. Crear una clase llamada mi hilo que implemente la runnable. En el método run creo un for
de dos mil iteraciones que muestren por consola el número de iteración y el nombre del
hilo.
Generar un test que cree 3 hilos, los ejecute y muestre un mensaje cuando todos los hilos
finalicen.
	 * */
	 
	public static void main(String[] args) {
		

		Thread uno = new Thread(new miHilo(),"uno");
		uno.setName("hilo uno");
		
		Thread dos = new Thread(new miHilo(),"uno");
		dos.setName("hilo dos");
		
		Thread tres = new Thread(new miHilo(),"uno");
		tres.setName("hilo tres");
		
		uno.start();
		dos.start();
		tres.start();
		while(uno.isAlive() || dos.isAlive() || tres.isAlive()) {
			System.out.println("se estan ejecutando los hilos");
		}
		System.out.println("se termino de ejecutar los hilos");


		

	
	}

}
