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
	
	public Camioneta(String placa, int puertas, String nombre,
			int velmax, int peso, Fabricante fabricante,
			boolean volco) {
		super(90, "4X4");
		this.placa = placa;
		this.puertas = puertas;
		this.nombre = nombre;
		this.velocidadMaxima = velmax;
		this.peso = peso;
		this.fabricante = fabricante;
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
