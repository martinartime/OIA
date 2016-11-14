package jUnit;

import java.io.FileNotFoundException;

import org.junit.Test;

import junit.framework.Assert;
import mesadasDeGranito.GeneradorDeFatiga;

public class MesadasDeGranitoTests {

	@Test
	public void unaPilaCadaMesadaTest() throws FileNotFoundException{
		String path = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\IN\\inMesadasDeGranito\\cada pieza es una pila.in";
		String salida = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outMesadasDeGranito\\cada pieza es una pila.out";
		Assert.assertTrue(mesadasDeGranito.Solve.solve(path, salida) == 4);
	}
	
	@Test
	public void TodasentranenunapilaTest() throws FileNotFoundException{
		String path = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\IN\\inMesadasDeGranito\\Todas entran en una pila.in";
		String salida = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outMesadasDeGranito\\Todas entran en una pila.out";
		Assert.assertTrue(mesadasDeGranito.Solve.solve(path, salida) == 1);
	}
	
	@Test
	public void todasPiezasIgualesTest() throws FileNotFoundException{
		String path = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\IN\\inMesadasDeGranito\\todasPiezasIguales.in";
		String salida = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outMesadasDeGranito\\todasPiezasIguales.out";
		Assert.assertTrue(mesadasDeGranito.Solve.solve(path, salida) == 1);
	}

	@Test
	public void dosMesasIgualesRotadasTest() throws FileNotFoundException{
		String path = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\IN\\inMesadasDeGranito\\dosMesasIgualesRotadas.in";
		String salida = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outMesadasDeGranito\\dosMesasIgualesRotadas.out";
		Assert.assertTrue(mesadasDeGranito.Solve.solve(path, salida) == 1);
	}
	
	@Test
	public void limiteSuperior() throws FileNotFoundException{
		String path = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\IN\\inMesadasDeGranito\\limiteSuperior.in";
		String salida = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outMesadasDeGranito\\limiteSuperior.out";
		Assert.assertTrue(mesadasDeGranito.Solve.solve(path, salida) == 1);
	}
	
	@Test
	public void pruebaMaligna1() throws FileNotFoundException{
		String path = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\IN\\inMesadasDeGranito\\pruebaMaligna1.in";
		String salida = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outMesadasDeGranito\\pruebaMaligna1.out";
		Assert.assertTrue(mesadasDeGranito.Solve.solve(path, salida) == 2);
	}
	
	@Test
	public void pruebaMaligna2() throws FileNotFoundException{
		String path = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\IN\\inMesadasDeGranito\\pruebaMaligna2.in";
		String salida = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outMesadasDeGranito\\pruebaMaligna2.out";
		Assert.assertTrue(mesadasDeGranito.Solve.solve(path, salida) == 3);
	}
	
	@Test
	public void casoFatiga() throws FileNotFoundException{
		GeneradorDeFatiga.generarFatiga();
		String path = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\IN\\inMesadasDeGranito\\casoDeFatiga.in";
		String salida = "E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outMesadasDeGranito\\casoDeFatiga.out";
		Assert.assertTrue(mesadasDeGranito.Solve.solve(path, salida) == 100000);
	}
}
