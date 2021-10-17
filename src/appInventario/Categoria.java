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
		//TODO: CHEKEAR QUE NO ESTÉ ESA LLAVE
	}
}
