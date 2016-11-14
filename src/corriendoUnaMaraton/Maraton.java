package corriendoUnaMaraton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Maraton {
	private Corredor []corredores;
	private int []ganadores = {0,0,0,0,0,0,0,0,0,0};
	private int cantidadDeCorredores;
	
	public Maraton(String path) throws IOException{
		Scanner sc = new Scanner(new File(path));
		cantidadDeCorredores = sc.nextInt();
		corredores = new Corredor[cantidadDeCorredores];
		for(int i=0;i<cantidadDeCorredores;i++){
			corredores[i] = new Corredor(sc.nextInt(),sc.nextInt());
		}
		sc.close();
	}
	
	public void definirGanadores(){
		int i=0, cantidadDeGanadores=0;
		while(i<cantidadDeCorredores && cantidadDeGanadores<10){
			if(ganadores[corredores[i].getCategoria()-1] == 0){
				ganadores[corredores[i].getCategoria()-1] = corredores[i].getNumero();
				cantidadDeGanadores++;
			}
			i++;
		}
	}
	
	public void aArchivo(String path) throws IOException{
		FileWriter fw = new FileWriter(new File(path));
		PrintWriter pw = new PrintWriter(fw);
		for(int i=0;i<10;i++){
			pw.println((i+1)+" "+ganadores[i]);
		}
		fw.close();
 	}
}
