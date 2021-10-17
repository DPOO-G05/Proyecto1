package appInventario;

public class ProductoCongelado extends Producto {

	private double tempCongelacion;
	
	public ProductoCongelado(String codigo, String vencimiento) {
		super(codigo, vencimiento);
	}

	public double getTempCongelacion() {
		return tempCongelacion;
	}

	public void setTempCongelacion(double tempCongelacion) {
		this.tempCongelacion = tempCongelacion;
	}
	
	

}
