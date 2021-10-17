package appInventario;

public class ProductoGondola extends Producto {

	private Gondola gondola; 
	public ProductoGondola(String codigo, String vencimiento, Gondola gondola) {
		super(codigo, vencimiento);
		this.gondola = gondola;
	}

}
