package mesadasDeGranito;

import java.io.FileWriter;
import java.io.PrintWriter;

public class GeneradorDeFatiga {
	
	public static void generarFatiga(){
		FileWriter fichero = null;
		PrintWriter pw = null;
		
		try {
			fichero = new FileWriter("E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\IN\\inMesadasDeGranito\\casoDeFatiga.in");
			pw = new PrintWriter(fichero);
			
			int cont=2;
			pw.println(200000);
			pw.println(200000+" "+1);
			for(int i=199999; i>0; i--){
				pw.println(i+" "+cont);
				cont++;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		finally {
			try {
				// Nuevamente aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != fichero)
					fichero.close();
			} 
			catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
