package jUnit;

import contandoCuadras.Carrera;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class ContandoCuadrasTests {

	@Test
	public void diferenciaSociosNoPermiteNingunaCuadraAdmisible() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inContandoCuadras\\diferenciaSociosNoPermiteNingunaCuadraAdmisible.in";
		Carrera carrera = new Carrera(in);
		Assert.assertEquals(0, carrera.calcularCalles());
	}
	
	@Test
	public void habitantesNeutralesNoPermitenNingunaCuadraAdmisible() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inContandoCuadras\\habitantesNeutralesNoPermitenNingunaCuadraAdmisible.in";
		Carrera carrera = new Carrera(in);
		Assert.assertEquals(0, carrera.calcularCalles());
	}
	
	@Test
	public void limiteInferior() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inContandoCuadras\\limiteInferior.in";
		Carrera carrera = new Carrera(in);
		Assert.assertEquals(1, carrera.calcularCalles());
	}
	
	@Test
	public void todosAlLimiteEnTodoConAlgunError() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inContandoCuadras\\todosAlLimiteEnTodoConAlgunError.in";
		Carrera carrera = new Carrera(in);
		Assert.assertEquals(2, carrera.calcularCalles());
	}
	
	@Test
	public void casoGuia() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inContandoCuadras\\casoGuia.in";
		Carrera carrera = new Carrera(in);
		Assert.assertEquals(5, carrera.calcularCalles());
	}
	
	@Test
	public void limiteSuperior() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inContandoCuadras\\limiteSuperior.in";
		Carrera carrera = new Carrera(in);
		Assert.assertEquals(1000, carrera.calcularCalles());
	}
}
