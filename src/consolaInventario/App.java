package consolaInventario;
import java.util.*;

public class App {

	public static void main(String[] args) {
		System.out.println("Aplicación Iniciada");
		
		App app = new App();
		app.desplegarMenu();
	}
	
	public void desplegarMenu()
	{
		//Despliega el Menú Principal de la Aplicación de Inventario
		boolean continuar = true;

		while (continuar)
		{

			System.out.println("1. Cargar Información CSV");
			System.out.println("2. Salir de la Aplicación");

			int respuesta = Integer.parseInt(input("Seleccione su opción"));

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
		String ruta = input("Ingrese la ruta de su archivo");
		System.out.printf("%s\n", ruta);
	}
	
	
	
}
