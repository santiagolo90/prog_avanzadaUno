package e7;

public class Alumno extends Persona {
	
	private String legajo;
	
	public Alumno(String nombre, String apellido, Integer documento,String legajo) {
		super(nombre, apellido, documento);
		this.legajo = legajo;
	}

	@Override
	public String toString() { 
		return "\n Nombre: ".concat(this.nombre).concat("\n Apellido: ").concat(this.apellido).concat("\n Documento: ").concat(String.valueOf(this.documento)).concat("\n Legajo: ").concat(this.legajo); 
	}


}
