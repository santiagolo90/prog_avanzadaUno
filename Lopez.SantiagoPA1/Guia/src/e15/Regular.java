package e15;


public class Regular implements IState {

	static Regular reg;
	
	private Regular() {
		
	}
	
	public static Regular getRegular() {
		if(reg == null){
			reg = new Regular();
		}
		return reg;
	}
	
	@Override
	public void cambiarEstado(Alumno a) {
		a.setEstado(Recibido.getRecibido());
		System.out.println("Estoy en Regular, cambio a Recibido");
		
	}
	
    @Override
    public String toString() {
        return "Regular";
    }

}

