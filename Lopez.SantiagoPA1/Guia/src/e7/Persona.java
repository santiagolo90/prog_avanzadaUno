package e7;

public abstract class Persona {
	protected String nombre;
	protected String apellido;
	protected Integer documento;
	
	public Persona(String nombre,String apellido, Integer documento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getApellido() {
		return apellido;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setDocumento(Integer documento) {
		this.documento = documento;
	}
	public Integer getDocumento() {
		return documento;
	}

	
	@Override
	public String toString() { 
		return "\n Nombre: ".concat(this.nombre).concat("\n Apellido: ").concat(this.apellido).concat("\n Documento: ").concat(String.valueOf(this.documento)); 
	}
	


	

	

	
	
	

}
