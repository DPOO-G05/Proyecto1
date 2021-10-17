package appInventario;
import java.time.LocalDate;
import java.util.*;

public class Producto {
	
	final String codigoProducto;
	final LocalDate fechaVenc; 
	String nombre;
	String marca;
	float pesoNeto;
	String unidadMedida;
	double costoUnidad;
	double precioUnidad;
	Date fechaIngreso;
	int unidadesRestantes;
	boolean empacado;

	public LocalDate getFechaVenc() {
		return fechaVenc;
	}

	boolean disponibleVenta;

	public Producto(String codigo, String fechaVenc)
	{
		this.codigoProducto = codigo; 
		LocalDate fecha = LocalDate.parse(fechaVenc);
		this.fechaVenc = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPesoNeto() {
		return pesoNeto;
	}

	public void setPesoNeto(float pesoNeto) {
		this.pesoNeto = pesoNeto;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getUnidadesRestantes() {
		return unidadesRestantes;
	}

	public void setUnidadesRestantes(int unidadesRestantes) {
		this.unidadesRestantes = unidadesRestantes;
	}

	public boolean isEmpacado() {
		return empacado;
	}

	public double getCostoUnidad() {
		return costoUnidad;
	}

	public void setCostoUnidad(double costoUnidad) {
		this.costoUnidad = costoUnidad;
	}

	public double getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(double precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public void setEmpacado(boolean empacado) {
		this.empacado = empacado;
	}

	public boolean isDisponibleVenta() {
		return disponibleVenta;
	}

	public void setDisponibleVenta(boolean disponibleVenta) {
		this.disponibleVenta = disponibleVenta;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}
	
	public void modificarRestantes(int unidades)
	{
		//Incrementa o decrementa el número de unidades restantes
		this.unidadesRestantes += unidades;
	}

}
