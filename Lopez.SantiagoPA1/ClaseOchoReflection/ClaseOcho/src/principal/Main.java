package principal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, InstantiationException, NoSuchMethodException, SecurityException, NoSuchFieldException {
		Persona p = new Persona();
		Cliente cl = new Cliente();
		
		Class c = cl.getClass();
		Class cliente = Cliente.class;

		
		// no muestra privados de la propia de las que heredan
		Field[] atr = c.getFields();
		//muestra privados y solo los declarados en esa clase
		//Field[] atr = c.getDeclaredFields();
		for(Field f: atr ){
			//System.out.println("Atributo: "+f.getName());//solo el atributo
			//System.out.println("tipo: "+ f.getType());// de que tipo es el atributo
		}
		
		Method[] atrMethod = c.getDeclaredMethods();// no me trae los constructores
		for(Method m: atrMethod ){
			//System.out.println(m.getName());//solo el atributo
			//System.out.println(m.getParameterTypes());//solo el atributo
			//System.out.println(m.getParameterCount());//solo el atributo
		}
		//trae los constructores
		Constructor[] atrMethodConst = c.getConstructors();
		
		for(Constructor cons: atrMethodConst ){
			/*
			for (Class calase: cons.getParameterTypes()) {
				System.out.println(calase); //que tipo de atributos tiene
			}
			System.out.println(cons.getName());//el constructor
			*/
		}
		
		Object[] objs = new Object[0];

		for(Method m: atrMethod ){
			if (m.getName().startsWith("setSegundoNombre")) {
				//System.out.println(m.getName());//solo el atributo
				//System.out.println(m.getParameterTypes());//solo el atributo
				for (Class calase: m.getParameterTypes()) {
					System.out.println(m.getName()); //que tipo de atributos tiene
					System.out.println(calase); //que tipo de atributos tiene
				}
				m.invoke(cl, "Macri gato");
			}
			if (m.getName().startsWith("getSegundoNombre")) {
				try {
					
					System.out.println(m.invoke(cl, objs));
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		Class ciente2 = Class.forName("principal.Cliente");
		//es igual a Cliente c = new Cliente();
		Object o =  ciente2.getConstructor(null).newInstance(null);
		
		
		/*
		 * Para usaer el constructor con parametros
		Class[] clase = new Class[2];
		clase[0] = String.class;
		clase[1] = String.class;
		*/
		Object[] objs2 = new Object[0];
		Method[] atrMethod2 = ciente2.getDeclaredMethods();// no me trae los constructores
		for(Method m: atrMethod2 ){
			if (m.getName().startsWith("setSegundoNombre")) {
				//System.out.println(m.getName());//solo el atributo
				//System.out.println(m.getParameterTypes());//solo el atributo
				for (Class calase: m.getParameterTypes()) {
					System.out.println(m.getName()); //que tipo de atributos tiene
					System.out.println(calase); //que tipo de atributos tiene
				}
				m.invoke(cl, "Vidal gata");
			}
			if (m.getName().startsWith("getSegundoNombre")) {
				try {
					
					System.out.println(m.invoke(cl, objs));
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		Cliente cliente3 = new Cliente();
		cliente3.setSegundoNombre("Martinez");
		Field f2 = cliente3.getClass().getDeclaredField("segundoNombre");
		//para poder entrar al atributo privado
		f2.setAccessible(true);
		System.out.println(f2.get(cliente3));
		
		

	}

}
