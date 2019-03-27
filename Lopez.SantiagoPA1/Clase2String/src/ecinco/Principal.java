package ecinco;

public class Principal {

	/*
	 * 
 * Cree una interface llamada ICalcular, que tenga los siguientes métodos:
 sumar
 restar
 multiplicar
 dividir throw MiExcepcion
Todos los métodos reciben dos parámetros del tipo Numbre y retornan un Double. El
método dividir debe lanzar una excepción si se intenta dividir por 0.
Cree una clase llamada calculadora la cual implemente la interface anterior.
En el método main se deben mostrar por consola todos los métodos disponibles y un
número. El usuario debe ingresar la operación deseada y los valores requeridos por el
método. El sistema debe mostrar por consola el resultado. Utilice la estructura switch para
la ejecución de los método
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora c = new Calculadora(2,0);
		
		System.out.println("Suma: "+ c.sumar(c.uno, c.dos));
		System.out.println("Resta: "+ c.restar(c.uno, c.dos));
		System.out.println("Multiplicacion: "+ c.multiplicar(c.uno, c.dos));
		try {
			System.out.println("dividir: "+ c.dividir(c.uno, c.dos));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
