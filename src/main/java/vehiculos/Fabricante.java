package vehiculos;
import java.util.Vector;

public class Fabricante {
	String nombre;
	Pais pais;
	int carrosFabrica;
	static Vector<Fabricante> fabricas = new Vector<>();
	
	// ====================
	// Constructores
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		if(Pais.paises.contains(pais)) {
			Pais.paises.add(pais);
		}
		pais.carrosPais++;
	}
	
	public Fabricante() {
		this.nombre = "N.A.";
	}
	
	// ====================
	// Métodos
	
	public static Fabricante fabricaMayorVentas() {
		int max = 0;
		Fabricante masvendedor = new Fabricante();
		for(Fabricante fabrica : fabricas) {
			if(fabrica.carrosFabrica > max) {
				max = fabrica.carrosFabrica;
			}
		}
		for(Fabricante fabrica : fabricas) {
			if (max == fabrica.carrosFabrica) {
				masvendedor = fabrica;
			}
		}
		return masvendedor;
	}
	

	// ==================================================
	// Constructores

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	

}
