package e15;

public class Alumno {
	
/*
	15. Crear un clase llamada alumno que tenga nombre, apellido, legajo, carrear y estado
	Carrera y estado deben estar dados por un enumerado.
	Un alumno puede tener los siguientes estados: Ingreso, Regular, irregular, Recibido.
	Aplique el patrón State para proporcionar la siguiente máquina de estados
*/
	
	public String nombre;
	public String apellido;
	public String legajo;
	public ECarrera carrera;
	public IState estado;
	
	public Alumno(String nombre, String apellido, String legajo, ECarrera carrera, IState estado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.carrera = carrera;
		this.estado = estado;
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

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public ECarrera getCarrera() {
		return carrera;
	}

	public void setCarrera(ECarrera carrera) {
		this.carrera = carrera;
	}

	public IState getEstado() {
		return estado;
	}

	public void setEstado(IState estado) {
		this.estado = estado;
	}
	
	
	


}
