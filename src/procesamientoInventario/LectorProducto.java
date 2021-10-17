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
			String id = linea.get(2).strip();
			String nombre = linea.get(3).strip().toUpperCase();
			String categoria = linea.get(4).strip().toUpperCase();
			String gondola = linea.get(5).strip().toUpperCase();
			String marca = linea.get(6).strip().toUpperCase();
			String empacadoStr = linea.get(7).toUpperCase();
			int unidades = Integer.parseInt(linea.get(8));
			double costo = Double.parseDouble(linea.get(9));
			double precioVenta = Double.parseDouble(linea.get(10));
			String pesoNeto = linea.get(11).strip().toUpperCase();
			String unidadMedida = linea.get(12).strip().toUpperCase(); 

			
			String idLote = linea.get(0);
			Lote lote = lotes.get(idLote);
			Producto product = productos.get(id);

			//Asignar Nombre
			product.setNombre(nombre);
			
			//Asignar Marca 
			product.setMarca(marca);
			
			//Asignar empacado
			if(empacadoStr.equals("N"))
			{
				product.setEmpacado(false);
			}
			else
			{
				product.setEmpacado(true);
			}
			
			//Incrementar Cantidad
			
			
			
			
			if (categoria.equals("CONGELADO"))
			{
				ProductoCongelado congelado = (ProductoCongelado) product;
				
			}
			
			
		}

	}
}
