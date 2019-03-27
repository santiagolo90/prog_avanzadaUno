package eseis;
/**
 * @author Santiago Agustin Lopez
 * @version 1.0
 * 
 * */
public class Principal {
	/*
	Desarrolla una clase llamada Cafetera con atributos:
		 capacidadMaxima (la cantidad máxima de café que puede contener la cafetera)
		 cantidadActual (la cantidad actual de café que hay en la cafetera).
		Implementa, al menos, los siguientes métodos:
		 Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.) y la
		actual en cero (cafetera vacía).
		 Constructor con la capacidad máxima de la cafetera; inicializa la cantidad actual de
		café igual a la capacidad máxima.
		 Constructor con la capacidad máxima y la cantidad actual. Si la cantidad actual es
		mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
		 Getters y Setters
		 llenarCafetera(): hace que la cantidad actual sea igual a la capacidad.
		 servirTaza(int): simula la acción de servir una taza con la capacidad indicada. Si la
		cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
		 vaciarCafetera(): pone la cantidad de café actual en cero.
		 agregarCafe(int): añade a la cafetera la cantidad de café indicada. Si supera el
		máximo llenarla.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafetera c1 = new Cafetera();
		
		System.out.println(c1.toString());
		
		c1.llenarCafetera();
		
		System.out.println(c1.toString());
		
		c1.servirTaza(100);
		
		System.out.println(c1.toString());
		
		c1.agregarCafe(50);
		
		System.out.println(c1.toString());
	}

}
