package trucoConUnaBaraja;

import java.io.FileWriter;
import java.io.PrintWriter;

public class GenerarFatiga {

	public static void generarFatiga(){
		FileWriter fichero = null;
		PrintWriter pw = null;
		
		try {
			fichero = new FileWriter("C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inTrucoConUnaBaraja\\limiteSuperior.in");
			pw = new PrintWriter(fichero);
			pw.println(2000000);
			for(int i=2000000;i>0;i--){
				pw.println(i);
			}
			pw.println(1000000);
			for(int i=1;i<1000001;i++){
				pw.println(i);
			}
			pw.println(5000000);
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
	
	public static void main(String []args){
		GenerarFatiga gf = new GenerarFatiga();
		gf.generarFatiga();
	}
}
