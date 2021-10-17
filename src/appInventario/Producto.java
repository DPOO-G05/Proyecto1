package appInventario;
import java.util.Date;

public class Producto {
	
	final String codigoProducto;
	String nombre;
	String marca;
	float pesoNeto;
	String unidadMedida;
	float precioUnidad;
	Date fechaIngreso;
	int unidadesRestantes;
	boolean empacado;
	boolean disponibleVenta;

	public Producto(String codigo)
	{
		this.codigoProducto = codigo; 
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

	public float getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(float precioUnidad) {
		this.precioUnidad = precioUnidad;
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

}
