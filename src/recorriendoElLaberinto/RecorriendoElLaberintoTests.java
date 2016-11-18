package recorriendoElLaberinto;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;


public class RecorriendoElLaberintoTests {

	@Test
	public void casoGuia() throws IOException{
		Laberinto laberinto = new Laberinto("IN/inRecorriendoElLaberinto/casoGuia.in");
		Assert.assertEquals(36, laberinto.obtenerMenorCantidadDePasosHastaLaSalida());
		laberinto.aArchivo("OUT/outRecorriendoElLaberinto/casoGuia.out");
	}
}
