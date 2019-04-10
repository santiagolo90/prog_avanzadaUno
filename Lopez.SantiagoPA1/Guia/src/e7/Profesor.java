package e7;

public class Profesor extends Persona {
	
	private Number sueldo;
	private EMateria materia;


	public Profesor(String nombre, String apellido, Integer documento,Number sueldo,EMateria materia) {
		super(nombre, apellido, documento);
		this.sueldo = sueldo;
		this.materia = materia;
	}
	
	@Override
	public String toString() { 
		return "\n Nombre: ".concat(this.nombre).concat("\n Apellido: ").concat(this.apellido).concat("\n Documento: ").concat(String.valueOf(this.documento)).concat("\n Sueldo: ").concat(String.valueOf(this.sueldo)).concat("\n Materia: ").concat(String.valueOf(this.materia)); 
	}

	
}
