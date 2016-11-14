package contandoCuadras;

import java.io.FileWriter;
import java.io.PrintWriter;

public class GenerarFatiga {

	public static void generarFatiga(){
		FileWriter fichero = null;
		PrintWriter pw = null;
		
		try {
			fichero = new FileWriter("C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inContandoCuadras\\limiteSuperior.in");
			pw = new PrintWriter(fichero);
			
			pw.println(1000+" "+500+" "+100);
			for(int i=0;i<1000;i++){
				pw.println(1000+" "+1000+" "+2000);
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
	
	public static void main(String []args){
		GenerarFatiga gf = new GenerarFatiga();
		gf.generarFatiga();
	}

}
