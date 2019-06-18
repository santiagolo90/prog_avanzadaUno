package hilo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread trUno = new Thread(new MyThread(),"uno");
		Thread trDos = new Thread(new MyThread(),"dos");
		try {
			System.out.println("estado: "+trDos.isAlive());
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Prioridad del hilo
		//trUno.setPriority(1);
		//trDos.setPriority(10);
		//trUno.start();
		//trDos.start();
		//trUno.start();
		//System.out.println("Hilo: "+Thread.currentThread().getName());

		//tr.interrupt();
		//System.out.println("estado: "+trDos.isAlive());
		
		//JOIN clase 10 es una cola de procesamiento en orden de join
		//Primero que entrar primero que sale
		/*
		try {
			
			Thread trTres = new Thread(new MyThread(),"tres");
			trTres.start();
			trTres.join();
			Thread trCuatro = new Thread(new MyThread(),"cuatro");
			trCuatro.start();
			trCuatro.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/		
		
	}

}
