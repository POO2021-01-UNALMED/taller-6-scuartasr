package vehiculos;
import java.util.Vector;

public class Pais {
	String nombre;
	int carrosPais;
	static Vector<Pais> paises = new Vector<>();
	
	// ==================================================
	// Constructores

	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public Pais() {
		this.nombre = "N.A.";
	}
	
	// ==================================================
	// Getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// =================================================
	// Métodos
	
	public static Pais paisMasVendedor() {
		int max = 0;
		Pais masvendedor = new Pais();
		
		// Tomar la cantidad del país con más carros en país.
		for(Pais pais : paises) {
			if(pais.carrosPais > max) {
				max = pais.carrosPais;
			}
		}
		
		// Buscar cuál es ese país con mayor cantidad de carros
		for(Pais pais : paises) {
			if (max == pais.carrosPais) {
				masvendedor = pais;
			}
		}
		return masvendedor;
	}

}
