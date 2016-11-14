package jUnit;


import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import caosEnLaEnvasadoraDeLatas.Solve;


public class CaosEnLaEnvasadoraDeLatasTest {
	
	@Test
	public void SegundaMaximaALaIzquierda() throws IOException{
		String in ="C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inCaosEnLaEnvasadoraDeLatas\\SegundaMaximaALaIzquierda.in";
		String out ="C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outCaosEnLaEnvasadoraDeLatas\\SegundaMaximaALaIzquierda.out";
		Solve solve= new Solve(in);
		Assert.assertEquals(7,solve.resolver());
		solve.aArchivo(out);
	}
	
	@Test
	public void SegundaMaximaALaDerecha() throws IOException{
		String in ="C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inCaosEnLaEnvasadoraDeLatas\\SegundaMaximaALaDerecha.in";
		String out ="C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outCaosEnLaEnvasadoraDeLatas\\SegundaMaximaALaDerecha.out";
		Solve solve= new Solve(in);
		Assert.assertEquals(7,solve.resolver());
		solve.aArchivo(out);
	}

	
	@Test
	public void CadaCadenaEsMayorALaAnterior() throws IOException{
		String in ="C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inCaosEnLaEnvasadoraDeLatas\\CadaCadenaEsMayorALaAnterior.in";
		String out ="C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outCaosEnLaEnvasadoraDeLatas\\CadaCadenaEsMayorALaAnterior.out";
		Solve solve= new Solve(in);
		Assert.assertEquals(6,solve.resolver());
		solve.aArchivo(out);
	}
	
	@Test
	public void HaySoloUnaSecuenciaCorrecta() throws IOException{
		String in ="C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inCaosEnLaEnvasadoraDeLatas\\HaySoloUnaSecuenciaCorrecta.in";
		String out ="C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outCaosEnLaEnvasadoraDeLatas\\HaySoloUnaSecuenciaCorrecta.out";
		Solve solve= new Solve(in);
		Assert.assertEquals(2,solve.resolver());
		solve.aArchivo(out);
	}
	
	@Test
	public void SecuenciasMaximasAlejadas() throws IOException{
		String in ="C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inCaosEnLaEnvasadoraDeLatas\\SecuenciasMaximasAlejadas.in";
		String out ="C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outCaosEnLaEnvasadoraDeLatas\\SecuenciasMaximasAlejadas.out";
		Solve solve= new Solve(in);
		Assert.assertEquals(5,solve.resolver());
		solve.aArchivo(out);
	}
	
	@Test
	public void ejemplo() throws IOException{
		String in ="C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inCaosEnLaEnvasadoraDeLatas\\ejemplo.in";
		String out ="C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outCaosEnLaEnvasadoraDeLatas\\ejemplo.out";
		Solve solve= new Solve(in);
		Assert.assertEquals(9,solve.resolver());
		solve.aArchivo(out);
	}
	
	
}
