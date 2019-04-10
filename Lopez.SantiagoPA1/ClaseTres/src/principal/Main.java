package principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


	}
	
	public int contar(String s){
		if(s.isEmpty()){
			throw new RuntimeException("no hay letras");
		}
		return s.length();
		
	}
	
	
	
}
