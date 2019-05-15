package principal;

public class Main {

	public static void main(String[] args) {
		SubjectConcreto s = new SubjectConcreto();
		
		ObserverConcreto o1 =  new ObserverConcreto("observer 1");
		ObserverConcreto o2 =  new ObserverConcreto("observer 2");
		
		s.addObserver(o1);
		s.addObserver(o2);

		System.out.println(s.countObservers());
		
		s.actualizarInfo("macri sos re gato");

	}

}
