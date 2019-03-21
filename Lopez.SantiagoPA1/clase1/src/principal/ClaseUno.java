package principal;

public class ClaseUno {

	public int numeroUno;
	public boolean verdadero;
	private String nombre; 
	
	public ClaseUno(){
		

	}
	
	
	public ClaseUno(String nombre){
		

	}
	
	public ClaseUno(String nombre,int numero){
		this.nombre = nombre;
		this.numeroUno = numero;

	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	@Override
	public String  toString(){
		return "hola";
		//return super.toString();
	}
	
	//camparar que clases iguales tambien puede ser instanceof
	@Override
	public boolean equals (Object o){
		if(o != null){
			if(o.getClass().equals(this.getClass())){
				ClaseUno c = (ClaseUno) o;
				if(c.nombre.equals(this.nombre) && c.numeroUno == this.numeroUno){
					return true;
				}else {
					return false;
				}
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
	//Siempre que se sobrecarga el equal se tiene que sobrecargar el hashcode
	// si 2 obejtos son iguales con la sobrecarga equals, el hashcode tiene que ser igual
	@Override
	public int hashCode(){
		int primo = 31;
		int resultado = 1;
		
		resultado = primo * this.numeroUno;
		
		resultado = resultado + primo * this.nombre.hashCode();
		
		return resultado;
	}
}
