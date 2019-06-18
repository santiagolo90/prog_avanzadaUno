package hilo;

public class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Hilo: "+Thread.currentThread().getName());
		
		for (int i = 0; i < 3000; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		/*
		while(true){
			System.out.println("Macri gato");
			
			if(Thread.currentThread().isInterrupted()){
				return;
			}
		}
		*/
		//Saca un hilo de running para ponerlo en el runneable
		//es para balancear un poco la carga y no se demore mas en uno que en los otros
		Thread.yield();
	}
}
