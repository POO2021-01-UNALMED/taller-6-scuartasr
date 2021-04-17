package vehiculos;

public class Camioneta extends Vehiculo {
	boolean volco;
	static int cantidadCamionetas;
	
	public Camioneta(String placa, int puertas, String nombre, int velmax, int peso, Fabricante fabricante, boolean volco) {
		super(90, "4X4");
		this.placa = placa;
		this.puertas = puertas;
		this.nombre = nombre;
		this.velocidadMaxima = velmax;
		this.peso = peso;
		this.fabricante = fabricante;
		cantidadCamionetas++;
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public static int getCantidadCamionetas() {
		return cantidadCamionetas;
	}

	public static void setCantidadCamionetas(int cantidadCamionetas) {
		Camioneta.cantidadCamionetas = cantidadCamionetas;
	}

}
