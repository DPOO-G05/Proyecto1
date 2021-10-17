package appInventario;

import java.util.*;


public class Referencia {

	private SortedMap<Date, Producto> productos;

	private String SKU;

	public Referencia(String SKU)
	{
		this.SKU = SKU;
	}
}
