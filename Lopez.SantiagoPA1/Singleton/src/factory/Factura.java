package factory;

public abstract class Factura {

	private double importe;
	 
	public double getImporte() {
		return importe;
	}
	 
	public void setImporte(double importe) {
		this.importe = importe;
	}
	 
	public abstract double getImporteIva();

}
