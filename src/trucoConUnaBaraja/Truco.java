package trucoConUnaBaraja;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Truco {
	private int []mazo;
	private int []elige;
	private int []ubica;
	private int []orden;
	private int repeticiones;
	
	public Truco(String path) throws IOException{
		Scanner sc = new Scanner(new File(path));
		mazo = new int[sc.nextInt()];
		orden = new int[mazo.length];
		for(int i=0; i<mazo.length;i++){
			mazo[i] = i+1;
			orden[i] = sc.nextInt();
		}
		elige = new int[sc.nextInt()];
		ubica = new int[elige.length];
		for(int i=0; i<elige.length;i++){
			elige[i] = sc.nextInt();
		}
		repeticiones = sc.nextInt();
		sc.close();
	}
	
	public void realizarTruco(){
		for(int i=0;i<=repeticiones;i++){
			int []aux = new int[mazo.length];
			for(int j=0; j<orden.length;j++){
				aux[aux.length-j-1] = mazo[orden[j]-1];
			}
			mazo = aux;
		}
		for(int k=0;k<elige.length;k++){
			int l=0;
			while(l<mazo.length && elige[k] != mazo[l]){
				l++;
			}
			ubica[k] = l+1;
		}
	}
	
	public void aArchivo(String path) throws IOException{
		FileWriter fw = new FileWriter(new File(path));
		PrintWriter pw = new PrintWriter(fw);
		pw.println(mazo.length+" "+elige.length);
		for(int i=0; i<elige.length; i++){
			pw.println(elige[i]+" "+ubica[i]);
		}
		fw.close();
	}
}
