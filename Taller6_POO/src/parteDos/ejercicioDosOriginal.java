package parteDos;

public class ejercicioDosOriginal {
	public static void main(String[] args) {
		Person p1 = new Person("Pepe", 213);
		Estudiant e1 = new Estudiant(91, "Sara", 1431);
		Profeso pf1 = new Profeso("Calculo", "Roger", 412);
		Person p2 = new Estudiant(87, "Sofia", "4");
		Person e2 = new Profeso("Bases", "Adrian", 231);
	}
}

class Person {
	private String nombre;
	protected long cedula;

	public Person(String nombre, long cedula) {
		this.nombre = nombre;
		this.cedula = cedula;
	}

	public final int getEdad() { // At Persona class.
		return 18;
	}
}

class Profeso extends Person {
	String materia;
	private int cedula;

	public Profeso(String materia, String nombre, int cedula) {
		super(nombre, cedula);
		this.materia = materia;
	}

	public Profeso() {
		this("Fisica");
		// super("Juan", 20123); <- This line must be commented!
	}

	public Profeso(String materia) {
		this(materia, "Juan", 20123);
	}

	public int getCedula() {
		return cedula;
	}

	public long getCedulaS() {
		return super.cedula;
	}

}

class Estudiant extends Person {
	int codigo;

	public void combinarNombre(String n) {
		super.nombre += n;
	}

	public final int getEdad() {
		return 20;
	}

}