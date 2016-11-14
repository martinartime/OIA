package formandoEquipos;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class GenerarCasoDeFatiga {

	public static void generarFatiga(String path){
		FileWriter fichero = null;
		PrintWriter pw = null;
		try{
			fichero = new FileWriter(path);
			pw = new PrintWriter(fichero);

			pw.println(500);
			pw.println(5000);
			for(int i=0; i<4998; i++){
				for(int j=0; j<450; j++){
					Random r = new Random();
					pw.print('a');
				}
				for(int k=0; k<50; k++){
					Random r = new Random();
					pw.print((char)(r.nextInt(26) + 'a'));
				}
				pw.println();
			}
			for(int i=0; i<2; i++){
				for(int j=0; j<500; j++){
					pw.print('z');
				}
				pw.println();
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
		generarFatiga("E:\\UNLaM\\Programación Avanzada\\GitKraken - Workspace\\OIA\\IN\\inFormandoEquipos\\casoFatiga2.in");
	}
}
