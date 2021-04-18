package parteUno;

class Primero {

	Primero() {
		m(); // Executes the method in Cuarto by dynamic link.
	}

	void m() {
		System.out.println("m desde Primero");
	}
}

class Segundo extends Primero {
	
	Segundo() { // This constructor is added by the compiler.
		super();
	}
	
	void m() {
		System.out.println("m desde Segundo");
	}
}

class Tercero extends Segundo {
	Tercero() {
		super(); // This lines is added by the compiler.
		super.m();
	}

	void m() {
		System.out.println("m desde Tercero");
	}
}

class Cuarto extends Tercero {
	
	Cuarto() { // This constructor is added by the compiler.
		super();
	}
	
	void m() {
		System.out.println("m desde Cuarto");
	}
}
