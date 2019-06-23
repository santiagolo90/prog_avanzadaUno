package e19;


public class Main {

	/*
19. Cree un hilo que se llame ejecución, que posea tres métodos
- Detener : debe matar el hilo
- Frenar: debe frenar el proceso del hilo
- Reanudar: debe retornar a la ejecución.
Cree un test adecuado para probar la funcionalidad
	 */
	public static void main(String[] args) {
		
		Ejecutar e = new Ejecutar();
		//Thread uno = new Thread(e);
		e.setName("hilo ejecutar");
		
		
		//19
		e.start();
		try {
			System.out.println("estado: "+e.isAlive());
			e.pauseThread();
			Thread.sleep(2000);
			System.out.println("estado: "+e.isAlive());
			e.resumeThread();
			e.StopThread();
			Thread.sleep(2000);
			System.out.println("estado: "+e.isAlive());


			
		} catch (InterruptedException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}



	}

}
