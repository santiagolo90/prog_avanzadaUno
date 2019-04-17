package e14;

public class SueldoMensual implements ICalculoSueldo {

	Empleado e;
	public SueldoMensual(Empleado e){
		this.e = e;
	}
	@Override
	public Number Calcular() {
		return e.getSueldo();
	}
	
	

}
