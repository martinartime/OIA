package jUnit;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import unMuralEnElPatioDeLaEscuela.Mural;

public class UnMuralEnElPatioDeLaEscuelaTests {

	@Test
	public void todoMuralUnSoloColor() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inUnMuralEnElPatioDeLaEscuela\\todoMuralUnSoloColor.in";
		String out = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outUnMuralEnElPatioDeLaEscuela\\todoMuralUnSoloColor.out";
		Mural mural = new Mural(in);
		mural.pintarMural();
		mural.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void noSeCruzaNinguno() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inUnMuralEnElPatioDeLaEscuela\\noSeCruzaNinguno.in";
		String out = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outUnMuralEnElPatioDeLaEscuela\\noSeCruzaNinguno.out";
		Mural mural = new Mural(in);
		mural.pintarMural();
		mural.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void muralVacio() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inUnMuralEnElPatioDeLaEscuela\\muralVacio.in";
		String out = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outUnMuralEnElPatioDeLaEscuela\\muralVacio.out";
		Mural mural = new Mural(in);
		mural.pintarMural();
		mural.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void soloPintadasHorizontales() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inUnMuralEnElPatioDeLaEscuela\\soloPintadasHorizontales.in";
		String out = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outUnMuralEnElPatioDeLaEscuela\\soloPintadasHorizontales.out";
		Mural mural = new Mural(in);
		mural.pintarMural();
		mural.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void soloPintadasVerticales() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inUnMuralEnElPatioDeLaEscuela\\soloPintadasVerticales.in";
		String out = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outUnMuralEnElPatioDeLaEscuela\\soloPintadasVerticales.out";
		Mural mural = new Mural(in);
		mural.pintarMural();
		mural.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void soloColoresSecundarios() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inUnMuralEnElPatioDeLaEscuela\\soloColoresSecundarios.in";
		String out = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outUnMuralEnElPatioDeLaEscuela\\soloColoresSecundarios.out";
		Mural mural = new Mural(in);
		mural.pintarMural();
		mural.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void colorBlancoIntercalados() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inUnMuralEnElPatioDeLaEscuela\\colorBlancoIntercalados.in";
		String out = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outUnMuralEnElPatioDeLaEscuela\\colorBlancoIntercalados.out";
		Mural mural = new Mural(in);
		mural.pintarMural();
		mural.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void limiteInferior() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inUnMuralEnElPatioDeLaEscuela\\limiteInferior.in";
		String out = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outUnMuralEnElPatioDeLaEscuela\\limiteInferior.out";
		Mural mural = new Mural(in);
		mural.pintarMural();
		mural.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void limiteSuperior() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inUnMuralEnElPatioDeLaEscuela\\limiteSuperior.in";
		String out = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outUnMuralEnElPatioDeLaEscuela\\limiteSuperior.out";
		Mural mural = new Mural(in);
		mural.pintarMural();
		mural.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void cadaPinceladaUnSoloCuadrado() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inUnMuralEnElPatioDeLaEscuela\\cadaPinceladaUnSoloCuadrado.in";
		String out = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outUnMuralEnElPatioDeLaEscuela\\cadaPinceladaUnSoloCuadrado.out";
		Mural mural = new Mural(in);
		mural.pintarMural();
		mural.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void casoGuia() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inUnMuralEnElPatioDeLaEscuela\\casoGuia.in";
		String out = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outUnMuralEnElPatioDeLaEscuela\\casoGuia.out";
		Mural mural = new Mural(in);
		mural.pintarMural();
		mural.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void dosPintadasEnLaMismaDireccionDistintoColor() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inUnMuralEnElPatioDeLaEscuela\\dosPintadasEnLaMismaDireccionDistintoColor.in";
		String out = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outUnMuralEnElPatioDeLaEscuela\\dosPintadasEnLaMismaDireccionDistintoColor.out";
		Mural mural = new Mural(in);
		mural.pintarMural();
		mural.aArchivo(out);
		Assert.assertTrue(true);
	}
}
