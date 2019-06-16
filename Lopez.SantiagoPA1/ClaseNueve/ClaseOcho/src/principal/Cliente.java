package principal;

public class Cliente extends Persona {

	private String segundoNombre;
	private String segundoApellido;
	
	public Cliente() {
		super();
		this.segundoNombre ="Santiago";
		this.segundoApellido ="Lopez";
	}
	
	public Cliente(String segundoNombre, String segundoApellido) {
		super();
		this.segundoNombre = segundoNombre;
		this.segundoApellido = segundoApellido;
	}



	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	
	
	
	
}
