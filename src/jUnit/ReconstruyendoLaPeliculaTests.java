package jUnit;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import org.junit.Assert;
import reconstruyendoLaPelicula.Pelicula;

public class ReconstruyendoLaPeliculaTests {

	@Test
	public void casoGuia() throws IOException{
		String in = "G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\IN\\inReconstruyendoLaPelicula\\casoGuia.in";
		String out="G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outReconstruyendoLaPelicula\\casoGuia.out";
		Pelicula pel= new Pelicula(in);
		pel.reconstruir();
		pel.aArchivo(out);
		Assert.assertEquals(4, pel.determinarCostoMenor().size());
	}
	
	@Test
	public void dosCostoCero() throws IOException{
		String in = "G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\IN\\inReconstruyendoLaPelicula\\dosCostoCero.in";
		String out="G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outReconstruyendoLaPelicula\\dosCostoCero.out";
		Pelicula pel= new Pelicula(in);
		pel.reconstruir();
		pel.aArchivo(out);
		Assert.assertEquals(3, pel.determinarCostoMenor().size());
	}
	
	@Test
	public void empiezaBajoCostoYLuegoTerminaAlto() throws IOException{
		String in = "G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\IN\\inReconstruyendoLaPelicula\\empiezaBajoCostoYLuegoTerminaAlto.in";
		String out="G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outReconstruyendoLaPelicula\\empiezaBajoCostoYLuegoTerminaAlto.out";
		Pelicula pel= new Pelicula(in);
		pel.reconstruir();
		pel.aArchivo(out);
		Assert.assertEquals(3, pel.determinarCostoMenor().size());
	}
	
	@Test
	public void limiteInferior() throws IOException{
		String in = "G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\IN\\inReconstruyendoLaPelicula\\limiteInferior.in";
		String out="G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outReconstruyendoLaPelicula\\limiteInferior.out";
		Pelicula pel= new Pelicula(in);
		pel.reconstruir();
		pel.aArchivo(out);
		Assert.assertEquals(1, pel.determinarCostoMenor().size());
	}
	
	@Test
	public void masDeUnaSolucionCorrecta() throws IOException{
		String in = "G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\IN\\inReconstruyendoLaPelicula\\masDeUnaSolucionCorrecta.in";
		String out="G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outReconstruyendoLaPelicula\\masDeUnaSolucionCorrecta.out";
		Pelicula pel= new Pelicula(in);
		pel.reconstruir();
		pel.aArchivo(out);
		Assert.assertEquals(3, pel.determinarCostoMenor().size());
	}
	
	@Test
	public void masDeUnComienzo() throws IOException{
		String in = "G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\IN\\inReconstruyendoLaPelicula\\masDeUnComienzo.in";
		String out="G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outReconstruyendoLaPelicula\\masDeUnComienzo.out";
		Pelicula pel= new Pelicula(in);
		pel.reconstruir();
		pel.aArchivo(out);
		Assert.assertEquals(3, pel.determinarCostoMenor().size());
	}
	/*
	@Test
	public void noSeReconstruyeLaPeli() throws IOException{
		String in = "G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\IN\\inReconstruyendoLaPelicula\\noSeReconstruyeLaPeli.in";
		String out="G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outReconstruyendoLaPelicula\\noSeReconstruyeLaPeli.out";
		Pelicula pel= new Pelicula(in);
		pel.reconstruir();
		pel.aArchivo(out);
		Assert.assertEquals(0, pel.determinarCostoMenor().size());
	}*/
	
	@Test
	public void noTieneCosto() throws IOException{
		String in = "G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\IN\\inReconstruyendoLaPelicula\\noTieneCosto.in";
		String out="G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outReconstruyendoLaPelicula\\noTieneCosto.out";
		Pelicula pel= new Pelicula(in);
		pel.reconstruir();
		pel.aArchivo(out);
		Assert.assertEquals(3, pel.determinarCostoMenor().size());
	}
	
	@Test
	public void todasSeSolapan() throws IOException{
		String in = "G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\IN\\inReconstruyendoLaPelicula\\todasSeSolapan.in";
		String out="G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outReconstruyendoLaPelicula\\todasSeSolapan.out";
		Pelicula pel= new Pelicula(in);
		pel.reconstruir();
		pel.aArchivo(out);
		Assert.assertEquals(3, pel.determinarCostoMenor().size());
	}
}
