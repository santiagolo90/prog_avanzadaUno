package eseis;

public class Cafetera {
	
	private Integer capacidadMaxima;
	private Integer cantidadActual;
	
	public Cafetera(){
		this.setCapacidadMaxima(1000);
		this.setCantidadActual(0);
	}
	
	public Cafetera( Integer _capacidadMaxima){
		this.setCantidadActual(_capacidadMaxima);
	}
	
	public Cafetera( Integer _capacidadMaxima, Integer _cantidadActual){
		if(_cantidadActual.intValue() > _capacidadMaxima.intValue()) {
			this.setCantidadActual(_capacidadMaxima);
		}else {
			this.setCapacidadMaxima(_capacidadMaxima);
			this.setCantidadActual(_cantidadActual);
		}
		
	}

	public Integer getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(Integer capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public Integer getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(Integer cantidadActual) {
		this.cantidadActual = cantidadActual;
	}
	/*

	 */
	/**
	 *hace que la cantidad actual sea igual a la capacidad.
	 *
	 * */
	public void llenarCafetera() {
		this.cantidadActual = this.capacidadMaxima;
		System.out.println("Se lleno la cafetera con la capacidad maxima");
	}
	
	/**
	 *simula la acción de servir una taza con la capacidad indicada. Si la 
	 *cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
	 *@param taza catidad de café
	 * */
	public void servirTaza(int taza) {
		if(this.cantidadActual.intValue() > taza) {
			Integer resta = this.cantidadActual.intValue() - taza;
			this.cantidadActual = resta;
			String patron = "Se sirvio una taza de %d c.c quedando disponible %d c.c en la cafetera";
			String resultado = String.format(patron,taza,resta.intValue());
			System.out.println(resultado);
		}else {
			this.cantidadActual = 0;
			String patron = "Se sirvio una taza de %d c.c quedando disponible %d c.c en la cafetera";
			String resultado = String.format(patron,taza,this.cantidadActual.intValue());
			System.out.println(resultado);
		}
	}
	
	/**
	 *
	 *pone la cantidad de café actual en cero.
	 * */
	public void vaciarCafetera() {
		this.cantidadActual = 0;
		System.out.println("Se vació la cafetera");
	}
	
	/**
	 *añade a la cafetera la cantidad de café indicada. Si supera el máximo llenarla.
	 *@param cantCafe catidad de café a agregar
	 * */
	public void agregarCafe(int cantCafe) {
		if(this.cantidadActual.intValue() > cantCafe) {
			Integer suma = this.cantidadActual.intValue() + cantCafe;
			this.cantidadActual = suma;
			String patron = "Se añadió %d cc de café, quedando el total de %d cc en la cafetera";
			String resultado = String.format(patron,cantCafe,suma.intValue());
			System.out.println(resultado);
		}else {
			this.cantidadActual = 1000;
			String patron = "LA cantidad de %d cc supera el limite. se lleno la cafeta a su maximo 1000 cc";
			String resultado = String.format(patron,cantCafe);
			System.out.println(resultado);
		}
	}
	
	@Override
    public String toString() { 
		String patron = "Cantidad maxima de café %d c.c \nCantidad actual de café %d c.c";
		String resultado = String.format(patron,this.getCapacidadMaxima(),this.getCantidadActual());
        return resultado;
     } 
	
}
