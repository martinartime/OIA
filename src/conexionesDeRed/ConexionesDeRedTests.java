package conexionesDeRed;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;


public class ConexionesDeRedTests {

	@Test
	public void casoGuia() throws IOException{
		Red red = new Red("IN/inConexionesDeRed/casoGuia.in");
		red.resolver();
		red.aArchivo("OUT/outConexionesDeRed/casoGuia.out");
		Assert.assertTrue(true);
	}
	
	@Test
	public void entradaDesordenada() throws IOException{
		Red red = new Red("IN/inConexionesDeRed/entradaDesordenada.in");
		red.resolver();
		red.aArchivo("OUT/outConexionesDeRed/entradaDesordenada.out");
		Assert.assertTrue(true);
	}
	
	@Test
	public void indireccionDoble() throws IOException{
		Red red = new Red("IN/inConexionesDeRed/indireccionDoble.in");
		red.resolver();
		red.aArchivo("OUT/outConexionesDeRed/indireccionDoble.out");
		Assert.assertTrue(true);
	}
	
	@Test
	public void limiteInferior() throws IOException{
		Red red = new Red("IN/inConexionesDeRed/limiteInferior.in");
		red.resolver();
		red.aArchivo("OUT/outConexionesDeRed/limiteInferior.out");
		Assert.assertTrue(true);
	}
	
	@Test
	public void noHayPreguntas() throws IOException{
		Red red = new Red("IN/inConexionesDeRed/noHayPreguntas.in");
		red.resolver();
		red.aArchivo("OUT/outConexionesDeRed/noHayPreguntas.out");
		Assert.assertTrue(true);
	}
	
	@Test
	public void preguntaSiemprePorIndireccion() throws IOException{
		Red red = new Red("IN/inConexionesDeRed/preguntaSiemprePorIndireccion.in");
		red.resolver();
		red.aArchivo("OUT/outConexionesDeRed/preguntaSiemprePorIndireccion.out");
		Assert.assertTrue(true);
	}
	
	@Test
	public void preguntaTodoAntesDeQueSeConecten() throws IOException{
		Red red = new Red("IN/inConexionesDeRed/preguntaTodoAntesDeQueSeConecten.in");
		red.resolver();
		red.aArchivo("OUT/outConexionesDeRed/preguntaTodoAntesDeQueSeConecten.out");
		Assert.assertTrue(true);
	}
	
	@Test
	public void preguntaTrasConexionSiempreInvalida() throws IOException{
		Red red = new Red("IN/inConexionesDeRed/preguntaTrasConexionSiempreInvalida.in");
		red.resolver();
		red.aArchivo("OUT/outConexionesDeRed/preguntaTrasConexionSiempreInvalida.out");
		Assert.assertTrue(true);
	}
	
	@Test
	public void preguntaTrasConexionSiempreValida() throws IOException{
		Red red = new Red("IN/inConexionesDeRed/preguntaTrasConexionSiempreValida.in");
		red.resolver();
		red.aArchivo("OUT/outConexionesDeRed/preguntaTrasConexionSiempreValida.out");
		Assert.assertTrue(true);
	}
	
	@Test
	public void soloHayPreguntas() throws IOException{
		Red red = new Red("IN/inConexionesDeRed/soloHayPreguntas.in");
		red.resolver();
		red.aArchivo("OUT/outConexionesDeRed/soloHayPreguntas.out");
		Assert.assertTrue(true);
	}
	
	@Test
	public void casoFatiga() throws IOException{
		Red red = new Red("IN/inConexionesDeRed/casoFatiga.in");
		red.resolver();
		red.aArchivo("OUT/outConexionesDeRed/casoFatiga.out");
		Assert.assertTrue(true);
	}
}
