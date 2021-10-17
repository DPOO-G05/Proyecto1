package appInventario;

import java.util.*;

public class Gondola {

	private ArrayList<ProductoGondola> productos;
	
	private String nombre;
	
	public Gondola(String nombre)
	{
		this.productos = new ArrayList<ProductoGondola>();
		this.nombre = nombre;
	}

	public ArrayList<ProductoGondola> getProductos() {
		return productos;
	}

	public String getNombre() {
		return nombre;
	}

	
	
}
