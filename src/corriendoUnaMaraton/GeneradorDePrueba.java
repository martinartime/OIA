package corriendoUnaMaraton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class GeneradorDePrueba {

	public GeneradorDePrueba(String path) throws IOException{
		FileWriter fw = new FileWriter(new File(path)); 
		PrintWriter pw = new PrintWriter(fw);
		pw.println(2000);
		for(int i=0;i<2000;i++){
			Random r1 = new Random();
			pw.println((i+1)+" "+(r1.nextInt(9)+1));
		}
		fw.close();
	}
	
	public static void main(String []args) throws IOException{
		try {
			GeneradorDePrueba g = new GeneradorDePrueba("E:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\IN\\inCorriendoUnaMaraton\\casoFatiga2.in");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
