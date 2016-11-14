package noSePuedeVivirAhi;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class generadorDeFatiga {

	public static void generarFatiga(String path){
		FileWriter fichero = null;
		PrintWriter pw = null;
		try{
			fichero = new FileWriter(path);
			pw = new PrintWriter(fichero);

			pw.println(50000);
			for(int i=0; i<50000; i++){
				pw.println(5);
				for(int j=0; j<5; j++){
					Random r = new Random();
					pw.print((r.nextInt(50) * -1)+" ");
					pw.print(r.nextInt(50));
					pw.println();
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				if (null != fichero)
					fichero.close();
			} 
			catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
		
		public static void main(String[] args){
			generarFatiga("G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\IN\\inNoSePuedeVivirAhi\\casoFatiga2.in");
		}
}
