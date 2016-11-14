package inspeccionandoLaReserva;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;


public class ReservaTests {

	@Test
	public void casoGuia() throws IOException{
		Reserva reserva = new Reserva("IN/inInspeccionandoLaReserva/casoGuia.in");
		reserva.obtenerCantidadDeCaminos();
		reserva.aArchivo("OUT/outInspeccionandoLaReserva/casoGuia.out");
		Assert.assertEquals(14, reserva.getCantidadDeCaminos());
	}
	
	@Test
	public void dosRombos() throws IOException{
		Reserva reserva = new Reserva("IN/inInspeccionandoLaReserva/dosRombos.in");
		reserva.obtenerCantidadDeCaminos();
		reserva.aArchivo("OUT/outInspeccionandoLaReserva/dosRombos.out");
		Assert.assertEquals(9, reserva.getCantidadDeCaminos());
	}
	
	@Test
	public void grafoCompleto() throws IOException{
		Reserva reserva = new Reserva("IN/inInspeccionandoLaReserva/grafoCompleto.in");
		reserva.obtenerCantidadDeCaminos();
		reserva.aArchivo("OUT/outInspeccionandoLaReserva/grafoCompleto.out");
		Assert.assertEquals(8, reserva.getCantidadDeCaminos());
	}
	
	@Test
	public void limiteInferior() throws IOException{
		Reserva reserva = new Reserva("IN/inInspeccionandoLaReserva/limiteInferior.in");
		reserva.obtenerCantidadDeCaminos();
		reserva.aArchivo("OUT/outInspeccionandoLaReserva/limiteInferior.out");
		Assert.assertEquals(1, reserva.getCantidadDeCaminos());
	}
	
	@Test
	public void todosCaminosSeparados() throws IOException{
		Reserva reserva = new Reserva("IN/inInspeccionandoLaReserva/todosCaminosSeparados.in");
		reserva.obtenerCantidadDeCaminos();
		reserva.aArchivo("OUT/outInspeccionandoLaReserva/todosCaminosSeparados.out");
		Assert.assertEquals(3, reserva.getCantidadDeCaminos());
	}
	
	@Test
	public void unSoloCamino() throws IOException{
		Reserva reserva = new Reserva("IN/inInspeccionandoLaReserva/unSoloCamino.in");
		reserva.obtenerCantidadDeCaminos();
		reserva.aArchivo("OUT/outInspeccionandoLaReserva/unSoloCamino.out");
		Assert.assertEquals(1, reserva.getCantidadDeCaminos());
	}
}
