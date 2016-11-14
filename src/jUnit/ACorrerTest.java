package jUnit;

import java.io.IOException;

import org.junit.Test;

import aCorrer.Carrera;
import junit.framework.Assert;

public class ACorrerTest {
	
	@Test
	public void EjemploGuia() throws IOException{
		String in = "C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inACorrer\\ejemplo.in";
		String out="C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outACorrer\\ejemplo.out";
		Carrera carrera = new Carrera(in);
		carrera.correr();
		carrera.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void SinCompetidoresEnUnaCategoria() throws IOException{
		String in = "C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inACorrer\\01_SinCompetidoresEnUnaCategoria.in";
		String out="C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outACorrer\\01_SinCompetidoresEnUnaCategoria.out";
		Carrera carrera = new Carrera(in);
		carrera.correr();
		carrera.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void NoLlegaronCorredoresALaMeta() throws IOException{
		String in = "C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inACorrer\\02_NoLlegaronCorredoresALaMeta.in";
		String out="C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outACorrer\\02_NoLlegaronCorredoresALaMeta.out";
		Carrera carrera = new Carrera(in);
		carrera.correr();
		carrera.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void LimitesInferiores() throws IOException{
		String in = "C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inACorrer\\03_LimitesInferiores.in";
		String out="C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outACorrer\\03_LimitesInferiores.out";
		Carrera carrera = new Carrera(in);
		carrera.correr();
		carrera.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void LleganTodosDeLaMismaCategoria() throws IOException{
		String in = "C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inACorrer\\05_LleganTodosDeLaMismaCategoria.in";
		String out="C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outACorrer\\05_LleganTodosDeLaMismaCategoria.out";
		Carrera carrera = new Carrera(in);
		carrera.correr();
		carrera.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	
}
