package vehiculos;

public class Camion extends Vehiculo {
	int ejes;
	static int cantidadCamiones;
	
	public Camion(String placa, String nombre, int precio, int velmax, Fabricante fabricante, int puertas) {
		super(2, 80, "4X2");
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.velocidadMaxima = velmax;
		this.fabricante = fabricante;
		this.puertas = puertas;
		cantidadCamiones++;
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public static int getCantidadCamiones() {
		return cantidadCamiones;
	}

	public static void setCantidadCamiones(int cantidadCamiones) {
		Camion.cantidadCamiones = cantidadCamiones;
	}

}
