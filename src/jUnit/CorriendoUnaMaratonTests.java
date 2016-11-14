package jUnit;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;

import corriendoUnaMaraton.Maraton;

public class CorriendoUnaMaratonTests {

	@Test
	public void casoGuia() throws IOException{
		String in = "I:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\IN\\inCorriendoUnaMaraton\\casoGuia.in";
		String out = "I:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outCorriendoUnaMaraton\\casoGuia.out";
		Maraton maraton = new Maraton(in);
		maraton.definirGanadores();
		maraton.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void desordenado() throws IOException{
		String in = "I:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\IN\\inCorriendoUnaMaraton\\desordenado.in";
		String out = "I:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outCorriendoUnaMaraton\\desordenado.out";
		Maraton maraton = new Maraton(in);
		maraton.definirGanadores();
		maraton.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void lleganAlReves() throws IOException{
		String in = "I:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\IN\\inCorriendoUnaMaraton\\lleganAlReves.in";
		String out = "I:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outCorriendoUnaMaraton\\lleganAlReves.out";
		Maraton maraton = new Maraton(in);
		maraton.definirGanadores();
		maraton.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void lleganOrdenadosPorCategoría() throws IOException{
		String in = "I:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\IN\\inCorriendoUnaMaraton\\lleganOrdenadosPorCategoría.in";
		String out = "I:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outCorriendoUnaMaraton\\lleganOrdenadosPorCategoría.out";
		Maraton maraton = new Maraton(in);
		maraton.definirGanadores();
		maraton.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void lleganTodosDeUnaSolaCategoria() throws IOException{
		String in = "I:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\IN\\inCorriendoUnaMaraton\\lleganTodosDeUnaSolaCategoria.in";
		String out = "I:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outCorriendoUnaMaraton\\lleganTodosDeUnaSolaCategoria.out";
		Maraton maraton = new Maraton(in);
		maraton.definirGanadores();
		maraton.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void ningunAtletaLlegaALaMeta() throws IOException{
		String in = "I:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\IN\\inCorriendoUnaMaraton\\ningunAtletaLlegaALaMeta.in";
		String out = "I:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outCorriendoUnaMaraton\\ningunAtletaLlegaALaMeta.out";
		Maraton maraton = new Maraton(in);
		maraton.definirGanadores();
		maraton.aArchivo(out);
		Assert.assertTrue(true);
	}
	
	@Test
	public void casoFatiga() throws IOException{
		String in = "E:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\IN\\inCorriendoUnaMaraton\\casoFatiga.in";
		String out = "E:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outCorriendoUnaMaraton\\casoFatiga.out";
		Maraton maraton = new Maraton(in);
		maraton.definirGanadores();
		maraton.aArchivo(out);
		Assert.assertTrue(true);
	}

	@Test
	public void casoFatiga2() throws IOException{
		String in = "E:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\IN\\inCorriendoUnaMaraton\\casoFatiga2.in";
		String out = "E:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outCorriendoUnaMaraton\\casoFatiga2.out";
		Maraton maraton = new Maraton(in);
		maraton.definirGanadores();
		maraton.aArchivo(out);
		Assert.assertTrue(true);
	}
}
