package ar.edu.unlam.pb2;

public class Gerente extends Empleado {
	
	private Boolean cochera;
	
	public Gerente() {
		super();
		cochera = true;
	}

	public Gerente(String nombre, String apellidos, Double salario, String fechaDeNacimiento) {
		super( nombre,  apellidos,  salario,  fechaDeNacimiento);
		cochera = true;
	}

	public boolean getCochera() {
		return cochera;
	}

}
