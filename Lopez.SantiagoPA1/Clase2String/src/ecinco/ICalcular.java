package ecinco;

public interface ICalcular {
	
	public Double sumar(Number uno, Number dos);
	public Double restar(Number uno, Number dos);
	public Double multiplicar(Number uno, Number dos);
	public Double dividir(Number uno, Number dos) throws MiExcepcion;

}
