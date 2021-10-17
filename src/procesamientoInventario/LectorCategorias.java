package procesamientoInventario;

import java.util.*;
import appInventario.Categoria;

public class LectorCategorias {
	
	private LectorArchivo lector;

	public LectorArchivo getLector() {
		return lector;
	}

	public void setLector(LectorArchivo lector) {
		this.lector = lector;
	}

	
	public ArrayList<String> getCategorias()
	{

		ArrayList<String> categorias = new ArrayList<>();
	
		ArrayList<ArrayList<String>> datos = lector.getDatos();

		String celda;

		for (ArrayList<String> linea: datos)
		{
			celda = linea.get(4).strip().toUpperCase();

			if(celda.equals("CONGELADO") || celda.equals("REFRIGERADO") || celda.equals("FRESCO"))
			{
				continue;
			}
			else
			{
				categorias.add(celda);
			}
			

			
		}
		
		return categorias;

	}
	
	
	

	
}
