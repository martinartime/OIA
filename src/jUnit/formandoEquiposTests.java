package jUnit;

import java.io.FileNotFoundException;

import org.junit.Test;

import formandoEquipos.GenerarCasoDeFatiga;
import formandoEquipos.Solve;
import junit.framework.Assert;

public class formandoEquiposTests {
	
	@Test
	public void empatanTresEquipos() throws FileNotFoundException{
		String in = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\IN\\inFormandoEquipos\\empatanTresEquipos.in";
		String out = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outFormandoEquipos\\empatanTresEquipos.out";
		Solve solve = new Solve(in);
		Assert.assertTrue(solve.resolver() == 18);
		solve.aArchivo(out);
	}
	
	@Test
	public void unaSolaPregunta() throws FileNotFoundException{
		String in = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\IN\\inFormandoEquipos\\unaSolaPregunta.in";
		String out = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outFormandoEquipos\\unaSolaPregunta.out";
		Solve solve = new Solve(in);
		Assert.assertTrue(solve.resolver() == 2);
		solve.aArchivo(out);
	}
	
	@Test
	public void ultimaLetraDefine() throws FileNotFoundException{
		String in = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\IN\\inFormandoEquipos\\ultimaLetraDefine.in";
		String out = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outFormandoEquipos\\ultimaLetraDefine.out";
		Solve solve = new Solve(in);
		Assert.assertTrue(solve.resolver() == 32);
		solve.aArchivo(out);
	}
	
	@Test
	public void primeraLetraDefine() throws FileNotFoundException{
		String in = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\IN\\inFormandoEquipos\\primeraLetraDefine.in";
		String out = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outFormandoEquipos\\primeraLetraDefine.out";
		Solve solve = new Solve(in);
		Assert.assertTrue(solve.resolver() == 32);
		solve.aArchivo(out);
	}
	
	@Test
	public void casoPDF() throws FileNotFoundException{
		String in = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\IN\\inFormandoEquipos\\casoPDF.in";
		String out = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outFormandoEquipos\\casoPDF.out";
		Solve solve = new Solve(in);
		Assert.assertTrue(solve.resolver() == 32);
		solve.aArchivo(out);
	}
	
	@Test
	public void noHayEquipo() throws FileNotFoundException{
		String in = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\IN\\inFormandoEquipos\\noHayEquipo.in";
		String out = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outFormandoEquipos\\noHayEquipo.out";
		Solve solve = new Solve(in);
		Assert.assertTrue(solve.resolver() == 0);
		solve.aArchivo(out);
	}
	
	@Test
	public void casoFatiga() throws FileNotFoundException{
		String in = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\IN\\inFormandoEquipos\\casoFatiga.in";
		String out = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outFormandoEquipos\\casoFatiga.out";
		Solve solve = new Solve(in);
		Assert.assertTrue(solve.resolver() == 500000);
		solve.aArchivo(out);
	}
	
	@Test
	public void casoFatiga2() throws FileNotFoundException{
		String in = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\IN\\inFormandoEquipos\\casoFatiga2.in";
		String out = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outFormandoEquipos\\casoFatiga2.out";
		Solve solve = new Solve(in);
		Assert.assertTrue(solve.resolver() == 500000);
		solve.aArchivo(out);
	}
}
