package vehiculos;
import java.util.Vector;

public class Fabricante {
	String nombre;
	Pais pais;
	int carrosFabrica;
	static Vector<Fabricante> fabricas = new Vector<>();
	
	// ====================
	// CONSTRUCTORES
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		pais.carrosPais++;
		fabricas.add(this);
	}
	
	// =================================================
	// METODOS
	
	public static Fabricante fabricaMayorVentas() {
		int max = 0;
		Fabricante masvendedor = null;
		
		// Obtener el numero de carros por la Fabrica que mas carros produjo
		for(Fabricante fabrica : fabricas) {
			if(fabrica.carrosFabrica > max) {
				max = fabrica.carrosFabrica;
			}
		}
		
		// Identificar cual es esa fabrica
		for(Fabricante fabrica : fabricas) {
			if (max == fabrica.carrosFabrica) {
				masvendedor = fabrica;
			}
		}
		return masvendedor;
	}
	

	// ==================================================
	// GETTERS Y SETTERS

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
