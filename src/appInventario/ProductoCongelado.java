package appInventario;

public class ProductoCongelado extends Producto {

	private double tempCongelacion;
	
	public ProductoCongelado(String codigo) {
		super(codigo);
	}

	public double getTempCongelacion() {
		return tempCongelacion;
	}

	public void setTempCongelacion(double tempCongelacion) {
		this.tempCongelacion = tempCongelacion;
	}
	
	

}
