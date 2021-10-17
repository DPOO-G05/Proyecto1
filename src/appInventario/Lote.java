package appInventario;

public class Lote {

	private int id;
	private String vencimiento;
	private Producto producto;
	private double precioVenta;
	private double costoProveedor;
	private double unidades;
	
	public Lote(int id, String venc, Producto prod, double preVen, double cost, double uni)
	{
		this.id = id;
		this.vencimiento = venc;
		this.producto = prod;
		this.precioVenta = preVen;
		this.costoProveedor = cost;
		this.unidades = uni;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
}
