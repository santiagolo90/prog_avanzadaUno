package principal;

public class ClaseDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClaseUno c = new  ClaseUno();
		ClaseUno c1 = new ClaseUno("aaaa");
		ClaseUno c2 = c1;
		
		ClaseUno c3 = new ClaseUno("aaaa",2);
		ClaseUno c4 = new ClaseUno("aaaa",1);
		
		c1 = c;
		if(c == c1){
			System.out.println("son iguales");
		}else{
			System.out.println("no son iguales");
		}
		
		/*
		if(c.getNombre().equals(c1.getNombre())){
			System.out.println("son iguales");
		}else{
			System.out.println("no son iguales");
		}
		*/
		
		// para no tener null pointer
		//"matias".equals(this.nombre);
		
		System.out.println(c2);
		
		System.out.println(c3.equals(c4));
		
		System.out.println(c4.hashCode());
	}

}
