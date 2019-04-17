package e14;


public class Main {
	/*
Crear una clase llamada empleado, que tenga nombre, apellido, cuil, estado, sueldo,
cantidadHorasTrabajadas y tipoCobro.
Los tipos de cobro tiene que estar dados por un Enum: mensual o porHora.
Crear una interface llamada ICalculoSueldo, la cual debe poseer un m�todo que se llame
calcular que retornara el monto que debe cobrar el empleado.
Cree dos implementaciones de la interfaz ICalculoSueldo: SueldoMensual y
SueldoPorHora, en la primera debe retornar el atributo sueldo y en la segunda debe
retornar el atributo sueldo por cantidad de horas.
Genere en un test una lista de 5 empleados y liqu�dele el sueldo. Utilice el patr�n Factory
para identificar que implementaci�n utilizar para cada empleado
	 
	 */

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("juan", "perez", "111-111-111", 150, 5, ETipoCobro.HORA);
		ICalculoSueldo s1 = Factory.getCalcularSueldo(e1);
		Empleado e2 = new Empleado("aaaa", "bbb", "111-111-111", 150, 5, ETipoCobro.MENSUEAL);
		ICalculoSueldo s2 = Factory.getCalcularSueldo(e2);
		
		System.out.println(s1.Calcular());
		System.out.println(s2.Calcular());

	}


}
