
package e15;


public class Alumno
{
  public String nombre;
  
  public String apellido;
  
  public String legajo;
  
  public ECarrera carrera;
  
  public IState estado;
  

  public Alumno(String nombre, String apellido, String legajo, ECarrera carrera, IState estado)
  {
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
  
  public String toString()
  {
	  StringBuilder sb = new StringBuilder();
	  sb.append("nombre=".concat(this.getNombre()));
	  sb.append(" apellido=".concat(this.getApellido()));
	  sb.append(" legajo=".concat(this.getLegajo()));
	  sb.append(" carrera=".concat(String.valueOf(this.getCarrera())));
	  sb.append(" estado=".concat(estado.toString()));
	  
	  return sb.toString();
  }
}
