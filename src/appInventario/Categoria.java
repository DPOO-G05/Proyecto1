package appInventario;

import java.util.*;

public class Categoria {
	
	private HashMap<String,Gondola> gondolas;
	
	private String nombre;
	
	public Categoria(String nombre)
	{
		this.gondolas = new HashMap<String,Gondola>();
		this.nombre = nombre;
	}
	
	public void agregarGondola(Gondola gondola)
	{
		String nombreGondola = gondola.getNombre();
		//Verificar que no esté en el mapa
		if(!this.gondolas.containsKey(nombreGondola))
		{
			this.gondolas.put(nombreGondola, gondola);
		}

	}
}
