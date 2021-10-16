import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Venta;
import modelo.Cliente;
import modelo.ControladorCliente;
import modelo.ControladorVenta;
import modelo.Recibo;
import modelo.SistemaPuntos;



public class App {
	
	public void mostrarMenuPrincipal() {
		boolean continuar = true;
		while (continuar) {
			System.out.println("\nMenu:");
			System.out.println("1: Solicitar informacion al cliente");
			System.out.println("2: Solicitar informacion de pago");
			System.out.println("3: Mostrar el resumen de la compra");
			System.out.println("4: Mostrar puntos del cliente");
			System.out.println("5: Notificar registro");
			System.out.println("6: Notificar compra");
			System.out.println("7: ");
			System.out.println("8: ");
			System.out.println("9: Salir");
			int opcionSeleccionada = Integer.parseInt(input("Ingrese la opción deseada"));
			ejecutarOpcion(opcionSeleccionada);
			if (opcionSeleccionada == 9) {
				continuar = false;
			}
		}
	}
	
	

	public void ejecutarOpcion(int opcionSeleccionada) {
		
		int o = opcionSeleccionada;
		switch (o) {
			case 1:
				System.out.println("Por favor ingrese su informacion personal: ");
				break;

			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
			
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				
				break;
			case 9:
				System.out.println("Gracias por tu compra!");
				break;
		}
	}
	
	
	
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
	

	public static void main(String[] args) {
		
		Venta venta = new Venta();
		System.out.println(venta.getFecha());

	}

}
