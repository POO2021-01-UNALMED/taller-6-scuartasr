package parteDos; // Este el paquete en el que se almacene en aras de la organización del trabajo

public class Objtaller6 {
	public static void main(String[] args) {
		Persona p1 = new Persona("Pepe", 213);
		Estudiante e1 = new Estudiante(91, "Sara", 1431); // There's no right constructor.
		Profesor pf1 = new Profesor("Calculo", "Roger", 412);
		Persona p2 = new Estudiante(87, "Sofia", 4); // There's no such constructor.
		Persona e2 = new Profesor("Bases", "Adrian", 231);
	}
}

class Persona {
	String nombre;
	protected long cedula;

	public Persona(String nombre, long cedula) {
		this.nombre = nombre;
		this.cedula = cedula;
	}

//	public final int getEdad() {
//		return 18;
//	}
	
	public int getEdad() { // This is at Persona class!
		return 18;
	}
}

class Profesor extends Persona {
	String materia;
	private int cedula;

	public Profesor(String materia, String nombre, int cedula) {
		super(nombre, cedula);
		this.materia = materia;
	}

	public Profesor() {
		this("Fisica");
		//super("Juan", 20123); // super() cannot be the second line in a constructor!
	}

	public Profesor(String materia) {
		this(materia, "Juan", 20123);
	}

	public int getCedula() {
		return cedula;
	}

	public long getCedulaS() {
		return super.cedula;
	}
}

class Estudiante extends Persona {
	int codigo;

	public void combinarNombre(String n) {
		super.nombre += n;
	}

	public final int getEdad() {
		return 20;
	}
	
	// First error. Explicitly define the right constructor
	Estudiante(int codigo, String nombre, long cedula) {
		super(nombre, cedula);
		this.codigo = codigo;
	}
	
	// Second error. Define another constructor that parses
	// the code from String to long.
	Estudiante(int codigo, String nombre, String cedula) {
		super(nombre, Long.parseLong(cedula));
		this.codigo = codigo;
	}
}
