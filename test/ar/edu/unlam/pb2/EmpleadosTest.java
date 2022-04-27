/**
 * 
 */
package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Romano Alvarez German
 *
 */
public class EmpleadosTest {
	
	@Test
	public void queSePuedaCrearUnEmpleado() {
		
		Empleado nuevoEmpleado = new Empleado();
		assertNotNull(nuevoEmpleado);
	}
	
	@Test
	public void queSePuedaConocerNombreApellidoSalarioYFechaDeNacimientoUnEmpleado() {
		
		Empleado nuevoEmpleadoDos = new Empleado("Raul", "Ricartez", 122500.89, "3/2/1990");
		assertEquals("Raul", nuevoEmpleadoDos.getNombre());
		assertEquals("Ricartez", nuevoEmpleadoDos.getApellidos());
		assertEquals(122500.89, nuevoEmpleadoDos.getSalario(), 0.01);
		assertEquals("3/2/1990", nuevoEmpleadoDos.getFechaDeNacimiento());
	}

	@Test
	public void queSePuedaCrearElGerente() {
		
		Gerente german = new Gerente();
		assertNotNull(german);
	}

	@Test
	public void queSePuedaCrearUnDepartamento() {
		
		Gerente german = new Gerente();
		Departamento ventas = new Departamento("ventas", german );
		assertNotNull(ventas);
	}
	
	@Test
	public void queSePuedaConocerElGerenteDelDepartamento() {
		
		Gerente predeterminadoPorConstructorVacio = new Gerente();
		Departamento ventas = new Departamento("ventas", predeterminadoPorConstructorVacio );
		
		assertEquals(predeterminadoPorConstructorVacio, ventas.getGerente());
	}
	
	@Test
	public void queLosGerentesTenganCochera() {
		Gerente nuevoPorConstructor = new Gerente("Gustavo", "Pelufo", 89230.50 , "14/7/2000");
		
		assertTrue(nuevoPorConstructor.getCochera());	
	}
	
	@Test
	public void queLosTipoIngenierosTenganProductividad() {
		Empleado nuevoEmpleadoTres = new Empleado("Natalia", "Medellin", 100000.00, "22/2/2001");
		nuevoEmpleadoTres.setClasificacionDelEmpleado(TipoDeEmpleado.INGENIERIA);
		
		assertEquals(125000.00, nuevoEmpleadoTres.getSalario(), 0.01 );
	}
	
	@Test
	public void queSePuedaCrearElDirector() {
		
		Director leo = new Director(30000.00);
		assertNotNull(leo);
	}
	
	@Test
	public void queLosDirectoresTenganCocheraYSueldoExtra() {
		Director leo = new Director(60000.00);
		
		assertTrue(leo.getCochera());
		assertEquals(105000.00, leo.getSalario(), 0.01);
	}
	
	@Test
	public void queLosDirectoresTenganCocheraYSueldoExtraPorParametros() {
		Director leo = new Director("Natalia", "Medellin", 100000.00, "22/2/2001", 60000.00);
		
		assertTrue(leo.getCochera());
		assertEquals(160000.00, leo.getSalario(), 0.01);
	}
}
