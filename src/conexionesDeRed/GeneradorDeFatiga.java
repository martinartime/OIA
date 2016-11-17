package conexionesDeRed;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GeneradorDeFatiga {

	public GeneradorDeFatiga(String path) throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File(path)));
		for(int i=1; i<1000000; i++){
			pw.println("C"+" "+(i+1)+" "+i);
		}
		for(int i=1; i<1000000; i++){
			pw.println("P"+" "+1000000+" "+i);
		}
		pw.println("F");
		pw.close();
	}
	
	public static void main(String []args) throws IOException{
		GeneradorDeFatiga gf = new GeneradorDeFatiga("IN/inConexionesDeRed/casoFatiga.in");
	}
}
