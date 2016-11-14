package jUnit;

import java.io.FileNotFoundException;

import org.junit.Test;

import conflictosEntreReinas.Tablero;
import junit.framework.Assert;

public class ConflictoEntreReinasTest {
	@Test
	public void romboDeConflictos() throws FileNotFoundException{
		Tablero tablero = new Tablero("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inConflictoEntreReinas\\romboDeConflictos.in");
		tablero.conflictos();
		tablero.aArchivo("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outConflictoEntreReinas\\romboDeConflictos.out");
		Assert.assertTrue(true);
	}
	
	@Test
	public void llenoDeReinasEnUnaSolaFilaColumna() throws FileNotFoundException{
		Tablero tablero = new Tablero("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inConflictoEntreReinas\\llenoDeReinasEnUnaSolaFila-Columna.in");
		tablero.conflictos();
		tablero.aArchivo("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outConflictoEntreReinas\\llenoDeReinasEnUnaSolaFila-Columna.out");
		Assert.assertTrue(true);
	}
	
	@Test
	public void casoGuia1() throws FileNotFoundException{
		Tablero tablero = new Tablero("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inConflictoEntreReinas\\casoGuia1.in");
		tablero.conflictos();
		tablero.aArchivo("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outConflictoEntreReinas\\casoGuia1.out");
		Assert.assertTrue(true);
	}
	@Test
	public void casoGuia2() throws FileNotFoundException{
		Tablero tablero = new Tablero("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\IN\\inConflictoEntreReinas\\casoGuia2.in");
		tablero.conflictos();
		tablero.aArchivo("C:\\Users\\Pablo\\Workspace\\GitKraken---Workspace\\OIA\\OUT\\outConflictoEntreReinas\\casoGuia2.out");
		Assert.assertTrue(true);
	}
}
