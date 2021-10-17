package procesamientoInventario;

import java.util.ArrayList;
import java.util.HashMap;

import appInventario.Lote;
import appInventario.Producto;

public class LectorLote {

	private LectorArchivo lector;
	
	private ArrayList<Lote> lotes;

	public LectorArchivo getLector() {
		return lector;
	}

	public void setLector(LectorArchivo lector) {
		this.lector = lector;
	}
	
	public ArrayList<Lote> getLotes(HashMap<String,Producto> productos)
	{
		ArrayList<ArrayList<String>> data = this.lector.getDatos();
		
		for(ArrayList<String> linea : data)
		{
			String idProducto = linea.get(2);
			int id = Integer.parseInt(linea.get(0));
			String vencimiento = linea.get(1);
			Producto prod = new Producto(idProducto);
			double precioVenta = Double.parseDouble(linea.get(10));
			double costoProveedor = Double.parseDouble(linea.get(9));	
			double unidades = Double.parseDouble(linea.get(8));
			
			Lote lote = new Lote(id, vencimiento, prod, precioVenta, costoProveedor, unidades);
			
			this.lotes.add(lote);
		
			if(!productos.containsKey(idProducto))
			{
				productos.put(idProducto, prod);
			}
			
		}
		
		return this.lotes;

	}
	
}
