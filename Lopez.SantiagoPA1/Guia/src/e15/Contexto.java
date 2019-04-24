package e15;

public class Contexto {

	  private Alumno alm;
	  
	  public Contexto(Alumno alm) {
	    this.alm = alm;
	  }
	  
	  public void cambiarEstado() {
	    alm.getEstado().cambiarEstado(alm);
	  }
	
	
	
}
