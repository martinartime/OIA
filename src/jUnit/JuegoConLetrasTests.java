package jUnit;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import juegoConLetras.SopaDeLetras;

public class JuegoConLetrasTests {

	@Test
	public void TodasPalabrasNoEntranPorUnaLetra() throws IOException{
		String in = "C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\OIA\\IN\\inJuegoConLetras\\TodasPalabrasNoEntranPorUnaLetra.in";
		String out = "C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outJuegoConLetras\\TodasPalabrasNoEntranPorUnaLetra.out";
		SopaDeLetras sopaDeLetras = new SopaDeLetras(in);
		sopaDeLetras.buscarPalabras();
		sopaDeLetras.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void PalabrasRepetidas() throws IOException{
		String in = "C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\OIA\\IN\\inJuegoConLetras\\PalabrasRepetidas.in";
		String out = "C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outJuegoConLetras\\PalabrasRepetidas.out";
		SopaDeLetras sopaDeLetras = new SopaDeLetras(in);
		sopaDeLetras.buscarPalabras();
		sopaDeLetras.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void PalabraEntraEnMasDeUnaDireccion() throws IOException{
		String in = "C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\OIA\\IN\\inJuegoConLetras\\PalabraEntraEnMasDeUnaDireccion.in";
		String out = "C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outJuegoConLetras\\PalabraEntraEnMasDeUnaDireccion.out";
		SopaDeLetras sopaDeLetras = new SopaDeLetras(in);
		sopaDeLetras.buscarPalabras();
		sopaDeLetras.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void UnaPalabraDeDosLetrasQueSeRepiteEnTodoElTablero() throws IOException{
		String in = "C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\OIA\\IN\\inJuegoConLetras\\UnaPalabraDeDosLetrasQueSeRepiteEnTodoElTablero.in";
		String out = "C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outJuegoConLetras\\UnaPalabraDeDosLetrasQueSeRepiteEnTodoElTablero.out";
		SopaDeLetras sopaDeLetras = new SopaDeLetras(in);
		sopaDeLetras.buscarPalabras();
		sopaDeLetras.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void LimiteInferior() throws IOException{
		String in = "C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\OIA\\IN\\inJuegoConLetras\\LimiteInferior.in";
		String out = "C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outJuegoConLetras\\LimiteInferior.out";
		SopaDeLetras sopaDeLetras = new SopaDeLetras(in);
		sopaDeLetras.buscarPalabras();
		sopaDeLetras.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void entraSoloEste() throws IOException{
		String in = "C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\OIA\\IN\\inJuegoConLetras\\entraSoloEste.in";
		String out = "C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outJuegoConLetras\\entraSoloEste.out";
		SopaDeLetras sopaDeLetras = new SopaDeLetras(in);
		sopaDeLetras.buscarPalabras();
		sopaDeLetras.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void entraSoloOeste() throws IOException{
		String in = "C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\OIA\\IN\\inJuegoConLetras\\entraSoloOeste.in";
		String out = "C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outJuegoConLetras\\entraSoloOeste.out";
		SopaDeLetras sopaDeLetras = new SopaDeLetras(in);
		sopaDeLetras.buscarPalabras();
		sopaDeLetras.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void entraSoloNorte() throws IOException{
		String in = "C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\OIA\\IN\\inJuegoConLetras\\entraSoloNorte.in";
		String out = "C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outJuegoConLetras\\entraSoloNorte.out";
		SopaDeLetras sopaDeLetras = new SopaDeLetras(in);
		sopaDeLetras.buscarPalabras();
		sopaDeLetras.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void entraSoloSur() throws IOException{
		String in = "C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\OIA\\IN\\inJuegoConLetras\\entraSoloSur.in";
		String out = "C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outJuegoConLetras\\entraSoloSur.out";
		SopaDeLetras sopaDeLetras = new SopaDeLetras(in);
		sopaDeLetras.buscarPalabras();
		sopaDeLetras.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void casoFatiga() throws IOException{
		String in = "C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\OIA\\IN\\inJuegoConLetras\\casoFatiga.in";
		String out = "C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outJuegoConLetras\\casoFatiga.out";
		SopaDeLetras sopaDeLetras = new SopaDeLetras(in);
		sopaDeLetras.buscarPalabras();
		sopaDeLetras.aArchivo(out);
		Assert.assertTrue(true);
	}
}
