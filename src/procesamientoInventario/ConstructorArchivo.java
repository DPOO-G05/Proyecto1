package procesamientoInventario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import appInventario.Categoria;
import appInventario.Gondola;

public class ConstructorArchivo 
{

	private LectorCategorias lecCat;
	private LectorGondola lecGond;
	private LectorLote lecLot;
	private LectorProducto lecProd;

	private HashMap<String, Categoria> categorias;
	private ArrayList<Gondola> gondolas;
	
	
	public ConstructorArchivo()
	{
		this.lecCat = new LectorCategorias();
		this.lecGond = new LectorGondola();
		this.lecLot = new LectorLote();
		this.lecProd = new LectorProducto();
		
		this.categorias = new HashMap<String,Categoria>();
		this.gondolas = new ArrayList<Gondola>();
	}

	
	public void leerCSV()
	{
		LectorArchivo lector = new LectorArchivo();
		this.lecCat.setLector(lector);
		this.lecGond.setLector(lector);
		this.lecLot.setLector(lector);
		this.lecProd.setLector(lector);
		
		try {
			lector.leerArchivo();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		
		
	}
	
	public void crearCategorias()
	{
		ArrayList<String> csvCats= lecCat.getCategorias();
		
		for(String nombre: csvCats)
		{
			Categoria cat = new Categoria(nombre);
			if(!this.categorias.containsKey(nombre))
			{
				this.categorias.put(nombre, cat);
			}

		}
		
	}
	
	public void crearGondolas()
	{
		ArrayList<String[]> gondolas = lecGond.getGondolas(); 
		
		for(String[] relacion: gondolas)
		{
			String categoria = relacion[0];
			if (this.categorias.containsKey(categoria))
			{
				Categoria cat = this.categorias.get(categoria);
				Gondola gondola = new Gondola(relacion[1]);
				cat.agregarGondola(gondola);

			}
			else
			{
				System.out.println("Error: Debe crear la categoria antes de intentar agregar la gondola");
			}
		}
	}
}
