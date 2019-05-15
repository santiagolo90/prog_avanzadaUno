package principal;

import java.util.Observable;
import java.util.Observer;

public class ObserverConcreto implements Observer {
	 private String name;
	 
	

	public ObserverConcreto(String name) {
		this.name = name;
	}



	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Macri gato " + this.name + " arg " + arg);
		
	}

}
