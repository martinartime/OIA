package jUnit;

import java.io.FileNotFoundException;

import org.junit.Assert;
import org.junit.Test;

import depositosSubterraneos.Petrolera;

public class DepositosSubterraneosTests {

	@Test
	public void caso00() throws FileNotFoundException{
		Petrolera petrolera = new Petrolera("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inDepositosSubterraneos\\00_casoGuia.in");
		petrolera.calcularUsoDeDepositos();
		petrolera.aArchivo("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outDepositosSubterraneos\\00_casoGuia.out");
		Assert.assertEquals(2, petrolera.getLitrosRebalsados());
	}

	@Test
	public void caso01() throws FileNotFoundException{
		Petrolera petrolera = new Petrolera("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inDepositosSubterraneos\\01_limiteInferior.in");
		petrolera.calcularUsoDeDepositos();
		petrolera.aArchivo("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outDepositosSubterraneos\\01_limiteInferior.out");
		Assert.assertEquals(1, petrolera.getDepositosActivos());
	}

	@Test
	public void caso02() throws FileNotFoundException{
		Petrolera petrolera = new Petrolera("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inDepositosSubterraneos\\02_seDesbordaPorUno.in");
		petrolera.calcularUsoDeDepositos();
		petrolera.aArchivo("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outDepositosSubterraneos\\02_seDesbordaPorUno.out");
		Assert.assertEquals(1, petrolera.getLitrosRebalsados());
	}
	
	@Test
	public void caso04() throws FileNotFoundException{
		Petrolera petrolera = new Petrolera("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inDepositosSubterraneos\\03_entraEnUnoJusto.in");
		petrolera.calcularUsoDeDepositos();
		petrolera.aArchivo("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outDepositosSubterraneos\\03_entraEnUnoJusto.out");
		Assert.assertEquals(1, petrolera.getDepositosActivos());
	}
	
	@Test
	public void caso05() throws FileNotFoundException{
		Petrolera petrolera = new Petrolera("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inDepositosSubterraneos\\04_dosAnchosYCortosYUnoMuyLargoYFino.in");
		petrolera.calcularUsoDeDepositos();
		petrolera.aArchivo("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outDepositosSubterraneos\\04_dosAnchosYCortosYUnoMuyLargoYFino.out");
		Assert.assertEquals(3, petrolera.getDepositosActivos());
	}
	
	@Test
	public void caso06() throws FileNotFoundException{
		Petrolera petrolera = new Petrolera("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inDepositosSubterraneos\\05_tanquesConTamañosCercanos.in");
		petrolera.calcularUsoDeDepositos();
		petrolera.aArchivo("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outDepositosSubterraneos\\05_tanquesConTamañosCercanos.out");
		Assert.assertEquals(4, petrolera.getDepositosActivos());
	}
	
	@Test
	public void caso07() throws FileNotFoundException{
		Petrolera petrolera = new Petrolera("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inDepositosSubterraneos\\06_depositosMasChicosConMismasProfundidades.in");
		petrolera.calcularUsoDeDepositos();
		petrolera.aArchivo("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outDepositosSubterraneos\\06_depositosMasChicosConMismasProfundidades.out");
		Assert.assertEquals(5, petrolera.getDepositosActivos());
	}

	@Test
	public void caso12() throws FileNotFoundException{
		Petrolera petrolera = new Petrolera("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inDepositosSubterraneos\\12_casoGuia2.in");
		petrolera.calcularUsoDeDepositos();
		petrolera.aArchivo("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outDepositosSubterraneos\\12_casoGuia2.out");
		Assert.assertEquals(2, petrolera.getDepositosActivos());
	}

}
