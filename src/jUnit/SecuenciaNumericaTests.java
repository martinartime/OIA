package jUnit;

import java.io.IOException;

import org.junit.Test;
import org.junit.Assert;
import secuenciaNumerica.SecuenciaNumerica;

public class SecuenciaNumericaTests {

	@Test
	public void CasoGuia() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inSecuenciaNumerica\\casoGuia.in";
		String out = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outSecuenciaNumerica\\casoGuia.out";
		SecuenciaNumerica sn = new SecuenciaNumerica(in);
		sn.resolverSecuencia();
		sn.aArchivo(out);
		Assert.assertEquals(16, sn.getResultado());
		Assert.assertEquals(11, sn.getCantidadDePares());
		Assert.assertEquals(5, sn.getCantidadDeImpares());
		Assert.assertEquals(2, sn.getSubsecuenciaMaxima());
	}
	
	@Test
	public void EmpiezaConUnoLaSecuencia() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inSecuenciaNumerica\\EmpiezaConUnoLaSecuencia.in";
		String out = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outSecuenciaNumerica\\EmpiezaConUnoLaSecuencia.out";
		SecuenciaNumerica sn = new SecuenciaNumerica(in);
		sn.resolverSecuencia();
		sn.aArchivo(out);
		Assert.assertEquals(1, sn.getResultado());
		Assert.assertEquals(0, sn.getCantidadDePares());
		Assert.assertEquals(1, sn.getCantidadDeImpares());
		Assert.assertEquals(0, sn.getSubsecuenciaMaxima());
	}
	
	@Test
	public void LimiteInferior() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inSecuenciaNumerica\\LimiteInferior.in";
		String out = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outSecuenciaNumerica\\LimiteInferior.out";
		SecuenciaNumerica sn = new SecuenciaNumerica(in);
		sn.resolverSecuencia();
		sn.aArchivo(out);
		Assert.assertEquals(1, sn.getResultado());
		Assert.assertEquals(0, sn.getCantidadDePares());
		Assert.assertEquals(1, sn.getCantidadDeImpares());
		Assert.assertEquals(0, sn.getSubsecuenciaMaxima());
	}
	
	@Test
	public void LimiteSuperior() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inSecuenciaNumerica\\LimiteSuperior.in";
		String out = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outSecuenciaNumerica\\LimiteSuperior.out";
		SecuenciaNumerica sn = new SecuenciaNumerica(in);
		sn.resolverSecuencia();
		sn.aArchivo(out);
		Assert.assertEquals(30, sn.getResultado());
		Assert.assertEquals(23, sn.getCantidadDePares());
		Assert.assertEquals(7, sn.getCantidadDeImpares());
		Assert.assertEquals(2, sn.getSubsecuenciaMaxima());
	}
	
	@Test
	public void LoEncuentraAlFinal() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inSecuenciaNumerica\\LoEncuentraAlFinal.in";
		String out = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outSecuenciaNumerica\\LoEncuentraAlFinal.out";
		SecuenciaNumerica sn = new SecuenciaNumerica(in);
		sn.resolverSecuencia();
		sn.aArchivo(out);
		Assert.assertEquals(1, sn.getResultado());
		Assert.assertEquals(11, sn.getCantidadDePares());
		Assert.assertEquals(5, sn.getCantidadDeImpares());
		Assert.assertEquals(2, sn.getSubsecuenciaMaxima());
	}
	
	@Test
	public void noEncuentraElUno() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inSecuenciaNumerica\\noEncuentraElUno.in";
		String out = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outSecuenciaNumerica\\noEncuentraElUno.out";
		SecuenciaNumerica sn = new SecuenciaNumerica(in);
		sn.resolverSecuencia();
		sn.aArchivo(out);
		Assert.assertEquals(13, sn.getResultado());
		Assert.assertEquals(4, sn.getCantidadDePares());
		Assert.assertEquals(3, sn.getCantidadDeImpares());
		Assert.assertEquals(2, sn.getSubsecuenciaMaxima());
	}
	
	@Test
	public void todosImparesCortaAntes() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inSecuenciaNumerica\\todosImparesCortaAntes.in";
		String out = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outSecuenciaNumerica\\todosImparesCortaAntes.out";
		SecuenciaNumerica sn = new SecuenciaNumerica(in);
		sn.resolverSecuencia();
		sn.aArchivo(out);
		Assert.assertEquals(15, sn.getResultado());
		Assert.assertEquals(0, sn.getCantidadDePares());
		Assert.assertEquals(1, sn.getCantidadDeImpares());
		Assert.assertEquals(0, sn.getSubsecuenciaMaxima());
	}
	
	@Test
	public void todosParesCortaAntesDeLlegarAUno() throws IOException{
		String in = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inSecuenciaNumerica\\todosParesCortaAntesDeLlegarAUno.in";
		String out = "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\OUT\\outSecuenciaNumerica\\todosParesCortaAntesDeLlegarAUno.out";
		SecuenciaNumerica sn = new SecuenciaNumerica(in);
		sn.resolverSecuencia();
		sn.aArchivo(out);
		Assert.assertEquals(2, sn.getResultado());
		Assert.assertEquals(6, sn.getCantidadDePares());
		Assert.assertEquals(0, sn.getCantidadDeImpares());
		Assert.assertEquals(0, sn.getSubsecuenciaMaxima());
	}
}
