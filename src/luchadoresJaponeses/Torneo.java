package luchadoresJaponeses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Torneo {
	private Luchador[] luchadores;
	private int[] resultado;
	
	public Torneo(String path) {
		try {
			Scanner sc = new Scanner(new File(path));
			luchadores = new Luchador[sc.nextInt()];

			for (int i = 0; i < luchadores.length; i++) {
				luchadores[i] = new Luchador(sc.nextInt(), sc.nextInt());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void Resolver(){
		resultado = new int[luchadores.length];
		for(int i=0;i<resultado.length;i++){
			resultado[i]=0;
			for(int j=0;j<luchadores.length;j++){
				if(i!=j && (luchadores[i].Comparar(luchadores[j])))
					resultado[i]++;
			}
		}
	}

	public static void main(String args[]) {
		Torneo t = new Torneo("luchadores.txt");
		t.Resolver();
		for(int i=0;i<t.resultado.length;i++)
			System.out.println(t.resultado[i]);
	}
}