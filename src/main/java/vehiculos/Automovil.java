package vehiculos;

public class Automovil extends Vehiculo {
	int puestos;
	static int cantidadAutomoviles;
	
	public Automovil(String placa, String nombre, int velmax, int peso, Fabricante fabricante, int puertas){
		super(4, 100, "FWD");
		this.placa = placa;
		this.nombre = nombre;
		this.velocidadMaxima = velmax;
		this.peso = peso;
		this.fabricante = fabricante;
		this.puertas = puertas;
		cantidadAutomoviles++;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public static int getCantidadAutomoviles() {
		return cantidadAutomoviles;
	}

	public static void setCantidadAutomoviles(int cantidadAutomoviles) {
		Automovil.cantidadAutomoviles = cantidadAutomoviles;
	}
	
	

}
