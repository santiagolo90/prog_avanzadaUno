package principal;

import java.util.Observable;

public class SubjectConcreto extends Observable {

	public void actualizarInfo(String o){
		super.setChanged();
		super.notifyObservers(o);
	}

}
