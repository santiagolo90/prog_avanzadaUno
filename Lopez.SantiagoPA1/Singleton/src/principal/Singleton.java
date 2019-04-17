package principal;

public class Singleton {
	
	static Singleton ms;
	
	private Singleton(){
		
	}
	//singleton
	public static Singleton GetInstancia(){
		if(ms == null){
			ms = new Singleton();
		}
		return ms;
	}

}
