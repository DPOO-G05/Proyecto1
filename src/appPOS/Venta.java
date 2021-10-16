package modelo;
import java.time.*;
import java.util.ArrayList;


public class Venta {
	
	private int puntos;
	private float monto;
	private LocalDate fecha;
	private ArrayList<String> listaProductos; 
	
	//Metodos ;
	
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}
	public LocalDate getFecha() {
		return LocalDate.now();
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	public void agregarProducto(String product,ArrayList<String> listaProd) {
		this.listaProductos.add(product);
	}
	
	public void calcularPrecioCobrar(String precio) {
		
	}
	public float calcularTotal() {
		float total = 0;
		return total;
		
	}
	
	public void generarRecibo() {
		Recibo recibo = new Recibo();
	}

}
