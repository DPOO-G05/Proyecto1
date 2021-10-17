package procesamientoInventario;
import java.util.ArrayList;
import java.util.HashMap;
import appInventario.*;

public class LectorProducto {
	
	private LectorArchivo lector;

	public LectorArchivo getLector() {
		return lector;
	}

	public void setLector(LectorArchivo lector) {
		this.lector = lector;
	}
	

	public void getProductos(HashMap<String,Lote> lotes, HashMap<String, Producto> productos,HashMap<String, Categoria> categorias,HashMap<String, ProductoCongelado> congelados,HashMap<String, ProductoFresco> frescos,HashMap<String, ProductoRefrigerado> refrigerados)
	{
		ArrayList<ArrayList<String>> data = this.lector.getDatos();
		
		for (ArrayList<String> linea : data)
		{
			String id = linea.get(2);
			String nombre = linea.get(3);
			String categoria = linea.get(4);
			String gondola = linea.get(5);
			String marca = linea.get(6);
			String empacadoStr = linea.get(7);
			int unidades = Integer.parseInt(linea.get(8));
			double costo = Double.parseDouble(linea.get(9));
			double precioVenta = Double.parseDouble(linea.get(10));
			String pesoNeto = linea.get(11);
			String unidadMedida = linea.get(12); 

			
			String idLote = linea.get(0);
			Lote lote = lotes.get(idLote);
			Producto product = productos.get(id);

			if (categoria.equals("CONGELADO"))
			{
				
			}
			
			
		}

	}
}
