package vehiculos;

public class Vehiculo {
	String placa;
	int puertas;
	int velocidadMaxima;
	String nombre;
	int precio;
	int peso;
	String traccion;
	Fabricante fabricante;
	static int cantidadVehiculos;
	
	// ==================================================
	// Constructores
	
	Vehiculo(int puertas, int velocidadMaxima, String traccion) {
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.traccion = traccion;	
		cantidadVehiculos++;
	}
	
	Vehiculo(int velocidadMaxima, String traccion) {
		this(0, velocidadMaxima, traccion);
	}
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima,
			String nombre, int precio, int peso, String traccion,
			Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		if (Fabricante.fabricas.contains(fabricante)) {
			Fabricante.fabricas.add(fabricante);
		}
		fabricante.carrosFabrica++;
	}
	
	// ==================================================
	// Métodos
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	
	public String vehiculosPorTipo() {
		int numAuto = Automovil.cantidadAutomoviles;
		int numCam = Camioneta.cantidadCamionetas;
		int numCnes = Camion.cantidadCamiones;
		return "Automoviles: " + numAuto + "\n" +
				"Camionetas: " + numCam + "\n" +
				"Camiones: " + numCnes;
	}
	
	// ==================================================
	// Constructores


	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}
	
	
	
}
