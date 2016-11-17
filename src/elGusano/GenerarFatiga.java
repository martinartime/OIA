package elGusano;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class GenerarFatiga {

	public GenerarFatiga(String path) throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File(path)));
		pw.println(30000);
		for(int i=0; i<30000; i++){
			Random random = new Random();
			pw.println(random.nextInt(1000)+" "+50+" "+random.nextInt(1000));
		}
		pw.println(100);
		for(int k=0; k<100; k++){
			Random random = new Random();
			pw.println(random.nextInt(1000)+" "+100);
		}
		pw.close();
	}
	
	public static void main(String []args) throws IOException{
		GenerarFatiga gf = new GenerarFatiga("IN/inConexionesDeRed/casoFatiga.in");
	}
}
