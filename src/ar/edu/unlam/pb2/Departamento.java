package ar.edu.unlam.pb2;

public class Departamento {
	
	private String nombreDelDepartamento;
	private Gerente gerenteEncargado;
	
	public Departamento (String nombreDelDepartamento, Gerente encargado) {
		this.nombreDelDepartamento = nombreDelDepartamento;
		this.gerenteEncargado = encargado;
		
	}

	public Object getGerente() {
		return gerenteEncargado;
	}
	
	

}
