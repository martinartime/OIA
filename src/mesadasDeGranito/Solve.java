package mesadasDeGranito;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solve {

	public static int solve(String path, String salida) throws FileNotFoundException{
		Mesada[] mesadas = cargarMesadasDesdeArchivo(path);
		Arrays.sort(mesadas);
		ArrayList<Pila> pilas = new ArrayList<Pila>();
		Pila pila1 = new Pila();
		pila1.apilar(mesadas[0]);
		pilas.add(pila1);
		for(int i=1; i<mesadas.length; i++){
			int flag = 0;
			for (Pila pila : pilas){
				if(flag == 0 && mesadas[i].getAncho() <= pila.getNodo().getMesada().getAncho() && mesadas[i].getLargo() <= pila.getNodo().getMesada().getLargo()){
					pila.apilar(mesadas[i]);
					flag = 1;
				}
			}
			if(flag == 0){
				Pila pila = new Pila();
				pila.apilar(mesadas[i]);
				pilas.add(pila);
			}
		}
		aArchivo(pilas, salida);
		return pilas.size();
	}
	
	public static Mesada[] cargarMesadasDesdeArchivo(String path) throws FileNotFoundException{
		Scanner scanner = new Scanner(new File(path));
		Mesada[] mesadas = new Mesada[scanner.nextInt()];
		for(int i=0; i<mesadas.length; i++){
			mesadas[i] = new Mesada(scanner.nextDouble(),scanner.nextDouble());
			if(mesadas[i].getLargo()>mesadas[i].getAncho())
				mesadas[i].rotar();
		}
		scanner.close();
		return mesadas;
	}
	
	public static void aArchivo(ArrayList<Pila> pila, String path){
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter(path);
			pw = new PrintWriter(fichero);
			pw.println(pila.size());
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
}
