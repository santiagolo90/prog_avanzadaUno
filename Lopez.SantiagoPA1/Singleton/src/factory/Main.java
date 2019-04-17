package factory;

public class Main {

	public static void main(String[] args) {
		

		Factura f = FactoriaFacturas.getFactura("iva");
		f.setImporte(100);
		System.out.println(f.getImporteIva());

	}

}
