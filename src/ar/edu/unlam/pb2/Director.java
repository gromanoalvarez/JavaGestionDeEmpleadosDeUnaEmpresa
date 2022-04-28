package ar.edu.unlam.pb2;

public class Director extends Gerente{
	
	private  Double sueldoExtra;
	
	public Director(Double sueldoExtra) {
		super();
		this.sueldoExtra = sueldoExtra;
		/*OPCION A
		calcularSalarioTotal(this.sueldoExtra);
		*/
	}
	
	public Director(String nombre, String apellidos, Double salario, String fechaDeNacimiento, Double sueldoExtra) {
		super( nombre,  apellidos,  salario,  fechaDeNacimiento);
		this.sueldoExtra = sueldoExtra;
		/*OPCION A
		calcularSalarioTotal(this.sueldoExtra);
		*/
	}
	
	/* OPCION A
	public void calcularSalarioTotal(Double sueldoExtra) {
		super.setSalario(sueldoExtra);
	}
	*/
	
	
	//OPCION B Sobreescribir el metodo getSalario del padre Empleado
	@Override
	public Double getSalario() {
		Double salarioDirector=0.0;
		
		salarioDirector=sueldoExtra+super.getSalario();
		
		return salarioDirector;
	}
	
}
