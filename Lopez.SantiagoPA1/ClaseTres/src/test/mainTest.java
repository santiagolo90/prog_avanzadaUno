package test;

import org.junit.Assert;
import org.junit.Test;

import principal.Main;

public class mainTest {

	@Test
	public void contarLetrasOK(){
		String s ="Hola";
		Main m = new Main();
		int resultado = m.contar(s);
		Assert.assertEquals(4, resultado);
	}
	
	@Test
	public void contarLetrasTestError(){
		String s ="aaaa";
		try {
			Main m = new Main();
			int resultado = m.contar(s);
			String texto = "Cantidad de letrases : %d";
			String textoFormat = String.format(texto,resultado);
			System.out.println(textoFormat);
			//Assert.assertTrue(false);
			Assert.fail("el test no tuvo errores");
		} catch (Exception e) {
			Assert.assertTrue(true);
			
		}
	}
	
}
