package ar.edu.unlam.pb2;

public class Director extends Gerente{
	
	private  Double sueldoExtra;
	
	public Director(Double sueldoExtra) {
		super();
		this.sueldoExtra = sueldoExtra;
		calcularSalarioTotal(this.sueldoExtra);
	}
	
	public Director(String nombre, String apellidos, Double salario, String fechaDeNacimiento, Double sueldoExtra) {
		super( nombre,  apellidos,  salario,  fechaDeNacimiento);
		this.sueldoExtra = sueldoExtra;
		calcularSalarioTotal(this.sueldoExtra);
	}
	
	
	public void calcularSalarioTotal(Double sueldoExtra) {
		super.setSalario(sueldoExtra);
	}
}
