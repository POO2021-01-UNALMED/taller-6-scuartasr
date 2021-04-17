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
	// M�todos
	
	public static Pais paisMasVendedor() {
		int max = 0;
		Pais masvendedor = new Pais();
		for(Pais pais : paises) {
			if(pais.carrosPais > max) {
				max = pais.carrosPais;
			}
		}
		for(Pais pais : paises) {
			if (max == pais.carrosPais) {
				masvendedor = pais;
			}
		}
		return masvendedor;
	}

}
