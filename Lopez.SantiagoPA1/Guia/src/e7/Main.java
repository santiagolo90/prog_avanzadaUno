package e7;

import java.util.ArrayList;
import java.util.List;

public class Main {
/*
	Creo un POJO llamado persona, con los siguientes atributos:
		 nombre: cadena
		 apellido: cadena
		 documento: entero
		Cree una clase derivada llamada alumno:
		 legajo: cadena.
		Cree otra clase derivada llamada profesor:
		 materia: EMateria
		 sueldo: numérico
		En el main cree dos objetos de cada una de las clases, agregue los cuatro objetos a
		un Array de tipo Persona y muéstrelos por pantalla. Sobrecargue el método
		toString.
*/
	public static void main(String[] args) {

		List<Persona>  listaPersonas = new ArrayList<>();
		Alumno a1 = new Alumno("Juan", "Perez", 12345, "abc123");
		Alumno a2 = new Alumno("Pepe", "Argento", 67891, "def456");
		
		Profesor p1 = new Profesor("Mario", "Marquez", 147852, 5000, EMateria.LENGUA);
		Profesor p2 = new Profesor("Santiago", "Lopez", 963258, 10000, EMateria.MATEMATICA);
		
		listaPersonas.add(a1);
		listaPersonas.add(a2);
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		
		for (Persona persona : listaPersonas) {
			System.out.println(persona.toString());
		}
	}

}
