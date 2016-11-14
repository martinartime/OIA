package unMuralEnElPatioDeLaEscuela;

import java.io.FileWriter;
import java.io.PrintWriter;

public class GeneradorFatiga {
		
		public GeneradorFatiga(){
			FileWriter fichero = null;
			PrintWriter pw = null;
			
			try {
				fichero = new FileWriter("C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\OIA\\IN\\inUnMuralEnElPatioDeLaEscuela\\limiteSuperior.in");
				pw = new PrintWriter(fichero);
				
				pw.println(1000+" "+1000+" "+1000);
				for(int i=1;i<1001;i++){
					pw.println(i+" "+'A'+" "+1+" "+1000);
				}
				for(int i=1;i<1001;i++){
					pw.println(i+" "+'R'+" "+1+" "+1000);
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
			GeneradorFatiga gf = new GeneradorFatiga();
		}
	}
