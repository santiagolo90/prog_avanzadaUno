package e15;

public class Ingreso implements IState {

	private static Ingreso ing = null;
	
	private Ingreso() {
		
	}
	
	public static Ingreso getIngreso() {
		if(ing == null){
			ing = new Ingreso();
		}
		return ing;
	}
	
	
	@Override
	public void cambiarEstado(Alumno a) {
		a.setEstado(Regular.getRegular());
		System.out.println("Estoy en ingreso, cambio a Regular");
	}
	
    @Override
    public String toString() {
        return "Ingreso";
    }

}

/*
public class Ingreso implements IState
{
  private static Ingreso instance = null;
  

  private Ingreso() {}
  
  public static Ingreso getInstance()
  {
    if (instance == null) {
      instance = new Ingreso();
    }
    
    return instance;
  }
  
  public void cambiarEstado(Alumno a)
  {
    a.setEstado(Regular.getInstance());
  }
  

  public String toString()
  {
    return "Ingreso";
  }
}
*/
