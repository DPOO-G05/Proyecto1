package appInventario;

import java.util.*;

import procesamientoInventario.ConstructorArchivo;

public class SistemaInventario {
	
	private ConstructorArchivo constructorArchivo;

	private HashMap<String, Categoria> categorias;
	
	public SistemaInventario()
	{
		this.constructorArchivo = new ConstructorArchivo();
		this.categorias = new HashMap<String, Categoria>();
	}

	
	public void leerCSV()
	{
		this.constructorArchivo.leerCSV();
		this.constructorArchivo.crearCategorias();
		this.constructorArchivo.crearGondolas();
	}
	
}
