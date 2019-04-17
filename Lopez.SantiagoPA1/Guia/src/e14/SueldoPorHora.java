package e14;

public class SueldoPorHora implements ICalculoSueldo {

	Empleado e;
	public SueldoPorHora(Empleado e){
		this.e = e;
	}
	
	@Override
	public Number Calcular() {
		Number resultado;
		resultado =  this.e.getSueldo().doubleValue() / this.e.getCantidadHorasTrabajadas().doubleValue();
		return resultado;
	}

}
