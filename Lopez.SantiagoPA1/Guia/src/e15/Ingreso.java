package e15;

public class Ingreso implements IState {

	
	
	@Override
	public void cambiarEstado(Alumno a) {
		a.setEstado(new Regular());
		
	}

}
