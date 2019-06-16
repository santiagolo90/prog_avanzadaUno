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
	}
}
