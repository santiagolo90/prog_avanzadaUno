package e14;

public class Factory {
	
	public static ICalculoSueldo getCalcularSueldo(Empleado e){
		if (e.getTipoCobro().equals(ETipoCobro.HORA)) {
			return new SueldoPorHora(e);
		}
		return new SueldoMensual(e);
	}

}
