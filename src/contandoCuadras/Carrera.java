package contandoCuadras;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Carrera {
	private int cantidadDeCalles;
	private int maximoNumeroDeNeutrales;
	private int maximoNumeroDeDiferenciaDeSimpatizantes;
	private ArrayList<Calle> calles;
	
	public Carrera(String path) throws IOException{
		Scanner sc = new Scanner(new File(path));
		cantidadDeCalles = sc.nextInt();
		maximoNumeroDeDiferenciaDeSimpatizantes = sc.nextInt();
		maximoNumeroDeNeutrales = sc.nextInt();
		calles = new ArrayList<>();
		for(int i=0; i<cantidadDeCalles; i++){
			calles.add(new Calle(sc.nextInt(),sc.nextInt(),sc.nextInt()));
		}
		sc.close();
	}
	
	public int calcularCalles(){
		int cantidadDeCallesFinales=0;
		for(Calle calle : calles){
			if(calle.obtenerDiferenciaDeSimpatizantes() <= maximoNumeroDeDiferenciaDeSimpatizantes && calle.obtenerCantidadDeNeutrales() <= maximoNumeroDeNeutrales){
				cantidadDeCallesFinales++;
			}
		}
		return cantidadDeCallesFinales;
	}
}
