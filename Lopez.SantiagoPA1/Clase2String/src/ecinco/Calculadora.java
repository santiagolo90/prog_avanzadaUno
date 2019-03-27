package ecinco;

public class Calculadora  implements ICalcular {

	Number uno;
	Number dos;
	
	public Calculadora(Number Uno, Number Dos){
		this.uno = Uno;
		this.dos = Dos;
		}
	
	@Override
	public Double sumar(Number uno, Number dos) {
		
		double result = uno.intValue() + dos.intValue();
		return result;
	}

	@Override
	public Double restar(Number uno, Number dos) {
		double result = uno.intValue() - dos.intValue();
		return result;
	}

	@Override
	public Double multiplicar(Number uno, Number dos) {
		double result = uno.intValue() * dos.intValue();
		return result;
	}

	@Override
	public Double dividir(Number uno, Number dos) throws MiExcepcion {
		if(dos.intValue() == 0){
			throw new MiExcepcion("No se puede dividir por 0");
		}else{
			double result = uno.intValue() / dos.intValue();
			return result;
		}
	}

}
