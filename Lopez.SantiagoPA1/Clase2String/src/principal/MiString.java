package principal;

public class MiString {
	
	private String stringAux; 
	
	public MiString(String miString){
		this.stringAux = miString;
	}
	
	public void cantidadCaracteres(){
		System.out.println("cantidad de caracteres: " +this.stringAux.length());
	}
	
	public void primerMitad(){
		int tam = this.stringAux.length() /2 ;
		System.out.println("primer mitad: " +this.stringAux.substring(0, tam +1));
	}
	
	public void ultimoCaracter(){
		int tam = this.stringAux.length();
		System.out.println("ultimo caracter: "+ this.stringAux.charAt(tam -1) );
	}
	
	public void inversa(){
		int tam = this.stringAux.length()- 1;
		System.out.println( "inverso: ");
		for (int i = tam; i >= 0; i--) {
			System.out.print(this.stringAux.charAt(i) );
		}
		System.out.println("");
		
	}
	
	public void guion(){
		int tam = this.stringAux.length()- 1;
		System.out.println( "guion: ");
		for (int i = 0; i <= tam; i++) {
			if(i == tam){
				System.out.print(this.stringAux.charAt(i));
			}else{
				System.out.print(this.stringAux.charAt(i)+"-" );
			}
			
		}
		System.out.println("");
	}

}
