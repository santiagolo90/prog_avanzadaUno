package e14;

public class Empleado  {

	private String nombre;
	private String apellido;
	private String cuil;
	private Number sueldo;
	private Number cantidadHorasTrabajadas;
	private ETipoCobro tipoCobro;
	
	
	public Empleado(String nombre, String apellido, String cuil, Number sueldo, Number cantidadHorasTrabajadas,
			ETipoCobro tipoCobro) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.sueldo = sueldo;
		this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
		this.tipoCobro = tipoCobro;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public Number getSueldo() {
		return sueldo;
	}

	public void setSueldo(Number sueldo) {
		this.sueldo = sueldo;
	}

	public Number getCantidadHorasTrabajadas() {
		return cantidadHorasTrabajadas;
	}

	public void setCantidadHorasTrabajadas(Number cantidadHorasTrabajadas) {
		this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
	}

	public ETipoCobro getTipoCobro() {
		return tipoCobro;
	}

	public void setTipoCobro(ETipoCobro tipoCobro) {
		this.tipoCobro = tipoCobro;
	}

	
	
	

}
