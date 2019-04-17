package principal;

public class ManejoString {
	
	static ManejoString ms;
	
	private ManejoString(){
		
	}
	//singleton
	public static ManejoString GetInstancia(){
		if(ms == null){
			ms = new ManejoString();
		}
		return ms;
	}

}
