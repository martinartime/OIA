package elGusano;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class GusanoTests {

	@Test
	public void casoGuia() throws IOException{
		Gusano gusano = new Gusano("IN/inElGusano/casoGuia.in");
		gusano.buscarPosiblesInfectadores();
		gusano.aArchivo("OUT/outElGusano/casoGuia.out");
		Assert.assertTrue(true);
	}
	
	@Test
	public void limiteInferior() throws IOException{
		Gusano gusano = new Gusano("IN/inElGusano/limiteInferior.in");
		gusano.buscarPosiblesInfectadores();
		gusano.aArchivo("OUT/outElGusano/limiteInferior.out");
		Assert.assertTrue(true);
	}
	
	@Test
	public void masDeUnPosibleOrigen() throws IOException{
		Gusano gusano = new Gusano("IN/inElGusano/masDeUnPosibleOrigen.in");
		gusano.buscarPosiblesInfectadores();
		gusano.aArchivo("OUT/outElGusano/masDeUnPosibleOrigen.out");
		Assert.assertTrue(true);
	}
	
	@Test
	public void todasComputadorasMenosUnaPosiblesOrigenes() throws IOException{
		Gusano gusano = new Gusano("IN/inElGusano/todasComputadorasMenosUnaPosiblesOrigenes.in");
		gusano.buscarPosiblesInfectadores();
		gusano.aArchivo("OUT/outElGusano/todasComputadorasMenosUnaPosiblesOrigenes.out");
		Assert.assertTrue(true);
	}
	
	@Test
	public void todasLasComputadorasInfectadas() throws IOException{
		Gusano gusano = new Gusano("IN/inElGusano/todasLasComputadorasInfectadas.in");
		gusano.buscarPosiblesInfectadores();
		gusano.aArchivo("OUT/outElGusano/todasLasComputadorasInfectadas.out");
		Assert.assertTrue(true);
	}
	
	@Test
	public void unaSolaComputadoraInfectada() throws IOException{
		Gusano gusano = new Gusano("IN/inElGusano/unaSolaComputadoraInfectada.in");
		gusano.buscarPosiblesInfectadores();
		gusano.aArchivo("OUT/outElGusano/unaSolaComputadoraInfectada.out");
		Assert.assertTrue(true);
	}
	
	@Test
	public void casoFatiga() throws IOException{
		Gusano gusano = new Gusano("IN/inElGusano/casoFatiga.in");
		gusano.buscarPosiblesInfectadores();
		gusano.aArchivo("OUT/outElGusano/casoFatiga.out");
		Assert.assertTrue(true);
	}
}
