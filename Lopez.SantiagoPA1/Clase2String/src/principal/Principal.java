package principal;

public class Principal {
	
	/*
	 * 3. Cargar un String por teclado e implementar los siguientes métodos:
		 Imprimir la cantidad de caracteres que posee.
		 Imprimir la primera mitad de los caracteres de la cadena.
		 Imprimir el último caracter.
		 Imprimirlo en forma inversa.
		 Imprimir cada caracter del String separado con un guión.
		 Implementar un método que verifique si la cadena posee la palabra “hola”
		(indistintamente si posee letras mayúsculas o minúsculas)
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		MiString s1 = new MiString("hola chau");
		
		s1.cantidadCaracteres();
		s1.primerMitad();
		s1.ultimoCaracter();
		s1.inversa();
		s1.guion();
	}

}
