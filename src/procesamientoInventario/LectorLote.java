package procesamientoInventario;

import java.util.ArrayList;
import java.util.HashMap;

import appInventario.Lote;
import appInventario.Producto;
import appInventario.Referencia;

public class LectorLote {

	private LectorArchivo lector;
	
	private ArrayList<Lote> lotes;

	public LectorArchivo getLector() {
		return lector;
	}

	public void setLector(LectorArchivo lector) {
		this.lector = lector;
	}
	
	public ArrayList<Lote> getLotes(HashMap<String,Referencia> referencias)
	{
		ArrayList<ArrayList<String>> data = this.lector.getDatos();
		
		for(ArrayList<String> linea : data)
		{
			
			//Obtener información
			String SKU = linea.get(2);
			int idLote = Integer.parseInt(linea.get(0));
			String vencimiento = linea.get(1);
			double precioVenta = Double.parseDouble(linea.get(10));
			double costoProveedor = Double.parseDouble(linea.get(9));	
			double unidades = Double.parseDouble(linea.get(8));
			

			//Crear el nuevo producto y el nuevo lote
			Producto prod = new Producto(SKU, vencimiento);
			Lote lote = new Lote(idLote, vencimiento, prod, precioVenta, costoProveedor, unidades);
			
			this.lotes.add(lote);
	
			Referencia ref;
			if(!referencias.containsKey(SKU))
			{
				
				ref = new Referencia(SKU);
				referencias.put(SKU, ref);
			}
			else
			{
				ref = referencias.get(SKU);
			}
			
			//Agregar el producto 
			
			ref.getProductos().put(prod.getFechaVenc(), prod);
			
			
		}
		
		return this.lotes;

	}
	
}
