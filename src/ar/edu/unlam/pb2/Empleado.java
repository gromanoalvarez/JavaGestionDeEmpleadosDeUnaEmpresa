package ar.edu.unlam.pb2;

public class Empleado {
	
	private String nombre, apellidos, fechaDeNacimiento;
	private Double salario;
	private TipoDeEmpleado clasificacionDelEmpleado;
	
	public Empleado() {
		
		nombre = "Completar Nombre";
		apellidos = "Completar Apellidos";
		salario = 45000.00;
		fechaDeNacimiento = "01/01/01";
		this.clasificacionDelEmpleado = TipoDeEmpleado.NORMAL;

	}
	
	public Empleado(String nombre, String apellidos, Double salario, String fechaDeNacimiento) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.clasificacionDelEmpleado = TipoDeEmpleado.NORMAL;

	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public Double getSalario() {
		return salario;
	}
		
	public void setSalario(Double salario) {
		this.salario += salario;
	}

	public TipoDeEmpleado getClasificacionDelEmpleado() {
		return clasificacionDelEmpleado;
	}

	public void setClasificacionDelEmpleado(TipoDeEmpleado clasificacionDelEmpleado) {
		this.clasificacionDelEmpleado = clasificacionDelEmpleado;
		calcularProductividad();
	}

	public void calcularProductividad() {
		Double incentivoPorProductividad = 25000.00;
		if(clasificacionDelEmpleado == TipoDeEmpleado.INGENIERIA) {
			salario+=incentivoPorProductividad;
		}
	}

	
	
}
