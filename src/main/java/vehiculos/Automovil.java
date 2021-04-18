package vehiculos;

public class Automovil extends Vehiculo {
	int puestos;
	static int cantidadAutomoviles;
	
	// ==================================================
	// CONSTRUCTORES
	
	public Automovil() {
		super(4, 100, "FWD");
		cantidadAutomoviles++;
	}
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puertas){
		super(4, 100, "FWD");
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		this.puertas = puertas;
		cantidadAutomoviles++;
	}
	
	// ==================================================
	// GETTERS Y SETTERS


	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
}