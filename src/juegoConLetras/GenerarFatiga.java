package juegoConLetras;

import java.io.FileWriter;
import java.io.PrintWriter;

public class GenerarFatiga {

	public static void generarFatiga(String path){
		FileWriter fichero = null;
		PrintWriter pw = null;
		try{
			fichero = new FileWriter(path);
			pw = new PrintWriter(fichero);

			pw.println(100+" "+10000);
			for(int i=0; i<100;i++){
				for(int j=0;j<100;j++){
					pw.print('a');
				}
				pw.println();
			}
			for(int k=0;k<10000;k++){
				pw.println("bbbbbbbbbbbbbbbbbbbb");
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
		generarFatiga("C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\OIA\\IN\\inJuegoConLetras\\casoFatiga.in");
	}
}
