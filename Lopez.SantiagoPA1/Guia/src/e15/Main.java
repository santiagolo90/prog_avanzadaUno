package e15;

public class Main {
/*
	15. Crear un clase llamada alumno que tenga nombre, apellido, legajo, carrear y estado
	Carrera y estado deben estar dados por un enumerado.
	Un alumno puede tener los siguientes estados: Ingreso, Regular, irregular, Recibido.
	Aplique el patrón State para proporcionar la siguiente m�quina de estados
*/
	
	public static void main(String[] args) {
        Alumno alm = new Alumno("Juan", "Perez", "1234", ECarrera.HISTORIA, (IState)Ingreso.getIngreso());
        Alumno alm2 = new Alumno("Santiago", "Lopez", "1234", ECarrera.HISTORIA, (IState)Ingreso.getIngreso());
        Alumno alm3 = new Alumno("Pepe", "Argento", "1234", ECarrera.HISTORIA, (IState)Ingreso.getIngreso());
        Contexto calm = new Contexto(alm);
        Contexto calm2 = new Contexto(alm2);
        calm.cambiarEstado();
        System.out.println(alm);
        calm2.cambiarEstado();
        calm2.cambiarEstado();
        System.out.println(alm2);
        System.out.println(alm3);

	}

}
