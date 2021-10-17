package consolaInventario;
import java.io.*;
import java.util.*;

import appInventario.SistemaInventario;
import procesamientoInventario.LectorArchivo;

public class App {

	
	private SistemaInventario sistemaInventario;

	public App() 
	{
		SistemaInventario sistema = new SistemaInventario();
		this.sistemaInventario = sistema;
	}

	
	public static void main(String[] args) {
		System.out.println("Aplicaci�n Iniciada");
		
		App app = new App();
		app.desplegarMenu();

	}

	
	
	public void desplegarMenu()
	{
		//Despliega el Men� Principal de la Aplicaci�n de Inventario
		boolean continuar = true;

		while (continuar)
		{

			System.out.println("1. Cargar Informaci�n CSV");
			System.out.println("2. Salir de la Aplicaci�n");

			int respuesta = Integer.parseInt(input("Seleccione su opci�n"));

			if (respuesta == 2)
			{
				continuar = false;
				System.out.println("Hasta luego");
			}
			else
			{
				ejecutar(respuesta);
			}
		}
	}
	
	private String input(String mensaje)
	{
			Scanner input = new Scanner(System.in);
			System.out.printf("%s", mensaje + ": ");
			String respuesta = input.nextLine();
			return respuesta;
		
	}
	
	private void ejecutar(int respuesta)
	{
		switch (respuesta)
		{
			case 1:
				cargarCSV();
				break;
		}
	}
	
	
	private void cargarCSV()
	{
		this.sistemaInventario.leerCSV();
	}
	
	
	
}
