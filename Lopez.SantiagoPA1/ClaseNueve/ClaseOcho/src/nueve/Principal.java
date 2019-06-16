package nueve;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, InstantiationException, NoSuchMethodException, SecurityException, NoSuchFieldException {
		Class c = Prueba.class;
		Object o = c.getConstructors()[0].newInstance(null);
		Method[] atrMethod = c.getDeclaredMethods();
		
		for(Method m: atrMethod){
			Test t = m.getAnnotation(Test.class);
			//System.out.println(t.cantidadIntentos());
			if (t!=null) {
				for (int i = 0; i < t.cantidadIntentos() ;i++) {
					m.invoke(o,null);
					
				}
				
			}
		}

	
	}

}
