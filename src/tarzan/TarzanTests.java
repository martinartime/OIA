package tarzan;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class TarzanTests {

	@Test
	public void casoGuia() throws IOException{
		Bosque bosque = new Bosque("IN/inTarzan/casoGuia.in");
		bosque.calcularRuta();
		bosque.aArchivo("OUT/outTarzan/casoGuia.out");
		Assert.assertTrue(true);
	}
}
