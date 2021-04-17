package vehiculos;

public class Camioneta extends Vehiculo {
	boolean volco;
	static int cantidadCamionetas;
	
	// ==================================================
	// Constructor
	
	public Camioneta() {
		super(90, "4X4");
		cantidadCamionetas++;
	}
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante,	boolean volco) {
		super(90, "4X4");
		this.placa = placa;
		this.precio = precio;
		this.nombre = nombre;
		this.peso = peso;
		this.fabricante = fabricante;
		this.volco = volco;
		cantidadCamionetas++;
	}
	
	// ==================================================
	// Getters y setters


	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	
	
}
