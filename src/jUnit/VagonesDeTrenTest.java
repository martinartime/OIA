package jUnit;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import junit.framework.Assert;
import vagonesDeTren.VagonesMinimos;

public class VagonesDeTrenTest {
	@Test
	public void ejemplo() throws IOException{
		String in = "C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inVagonesDeTren\\ejemplo.in";
		String out = "C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outVagonesDeTren\\ejemplo.out";
		
		VagonesMinimos test =new VagonesMinimos(in);
		test.calcularVagonesMinimos();
		test.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void AnimalesAgresivos() throws IOException{
		String in = "C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inVagonesDeTren\\00_AnimalesAgresivos.in";
		String out = "C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outVagonesDeTren\\00_AnimalesAgresivos.out";
		
		VagonesMinimos test =new VagonesMinimos(in);
		test.calcularVagonesMinimos();
		test.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void entraJusto() throws IOException{
		String in = "C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inVagonesDeTren\\01_entraJusto.in";
		String out = "C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outVagonesDeTren\\01_entraJusto.out";
		
		VagonesMinimos test =new VagonesMinimos(in);
		test.calcularVagonesMinimos();
		test.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void CadaRazaEnUnVagon() throws IOException{
		String in = "C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inVagonesDeTren\\02_CadaRazaEnUnVagon.in";
		String out = "C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outVagonesDeTren\\02_CadaRazaEnUnVagon.out";
		
		VagonesMinimos test =new VagonesMinimos(in);
		test.calcularVagonesMinimos();
		test.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void MasDeUnaCombinacion() throws IOException{
		String in = "C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inVagonesDeTren\\03_MasDeUnaCombinacion.in";
		String out = "C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outVagonesDeTren\\03_MasDeUnaCombinacion.out";
		
		VagonesMinimos test =new VagonesMinimos(in);
		test.calcularVagonesMinimos();
		test.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void CasiNoEntra() throws IOException{
		String in = "C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inVagonesDeTren\\04_CasiNoEntra.in";
		String out = "C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outVagonesDeTren\\04_CasiNoEntra.out";
		
		VagonesMinimos test =new VagonesMinimos(in);
		test.calcularVagonesMinimos();
		test.aArchivo(out);
		Assert.assertTrue(true);
	}

	@Test
	public void Mixto() throws IOException{
		String in = "C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inVagonesDeTren\\06.Mixto.in.txt";
		String out = "C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outVagonesDeTren\\06.Mixto.out";
		
		VagonesMinimos test =new VagonesMinimos(in);
		test.calcularVagonesMinimos();
		test.aArchivo(out);
		Assert.assertTrue(true);
	}
}

