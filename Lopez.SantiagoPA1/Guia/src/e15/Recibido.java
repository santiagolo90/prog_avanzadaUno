package e15;

public class Recibido implements IState {

	static Recibido rec;
	
	private Recibido() {
		
	}
	
	public static Recibido getRecibido() {
		if(rec == null){
			rec = new Recibido();
		}
		return rec;
	}
	
	@Override
	public void cambiarEstado(Alumno a) {
		a.setEstado(Regular.getRegular());
		System.out.println("Estoy en Recibido, cambio a Regular");

	}
	
    @Override
    public String toString() {
        return "Recibido";
    }    

}
