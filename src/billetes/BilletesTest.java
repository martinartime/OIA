package billetes;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;


public class BilletesTest {

	@Test
	public void prueba1() throws IOException{
		
		String in="C:\\Users\\Pablo\\Workspace\\OIAMIOS\\src\\billetes\\In\\guia.in";
		String out="C:\\Users\\Pablo\\Workspace\\OIAMIOS\\src\\billetes\\Out\\guia.out";;
		DiaDeTrabajo dt= new DiaDeTrabajo(in);
		dt.procesarPagos();
		dt.aArchivo(out);
		Assert.assertEquals(5,5);
		
	}
}
