package vehiculos;

public class Camion extends Vehiculo {
	int ejes;
	static int cantidadCamiones;
	
	// ==================================================
	// Constructores
	
	public Camion() {
		super(2, 80, "4X2");
		cantidadCamiones++;
	}
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(2, 80, "4X2");
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		this.ejes = ejes;
		cantidadCamiones++;
	}
	
	// ==================================================
	// Gwtters y setters


	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}	
}
