package nueve;


public class Prueba {
	
	public Prueba(){
		
	}
	
	@Test(cantidadIntentos =2)
	public void metodoUno(){
		System.out.println("metodo uno");
	}
	
	@Test()
	public void metodoDos(){
		System.out.println("metodo dos");
	}

}
