package vehiculos;
import java.util.Vector;

public class Pais {
	String nombre;
	int carrosPais;
	static Vector<Pais> paises = new Vector<>();
	
	// ==================================================
	// CONSTRUCTORES

	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
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
	// METODOS
	
	public static Pais paisMasVendedor() {
		int max = 0;
		Pais masvendedor = paises.get(0);
		
		// Tomar la cantidad del pais con mas carros en pais.
		for(Pais pais : paises) {
			if(pais.carrosPais > max) {
				max = pais.carrosPais;
			}
		}
		
		// Buscar cual es ese pais con mayor cantidad de carros
		for(Pais pais : paises) {
			if (max == pais.carrosPais) {
				masvendedor = pais;
			}
		}
		return masvendedor;
	}

}
