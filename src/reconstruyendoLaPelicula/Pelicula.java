package reconstruyendoLaPelicula;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Pelicula {
	private ArrayList<ArrayList<Segmento>> pelicula;
	private ArrayList<Segmento> segmentos;
	private int cantidad;
	private int escenaFinal;
	
	public Pelicula(String path) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(path));
		cantidad = sc.nextInt();
		escenaFinal = sc.nextInt();
		segmentos = new ArrayList<Segmento>();
		pelicula = new ArrayList<ArrayList<Segmento>>();
		for(int i=0;i<cantidad;i++){
			segmentos.add(new Segmento(sc.nextInt(),sc.nextInt(),sc.nextInt()));
		}
		sc.close();
	}
	
	public void reconstruir(){
		int i=0, mejorOpcion=10001, opcion = 0, mejorPosicion=-1, flag=0;
		
		while(i < segmentos.size() && segmentos.get(i).getEscenaInicial() == 1){
			ArrayList<Segmento> arrayList = new ArrayList<Segmento>();
			arrayList.add(segmentos.get(i));
			pelicula.add(arrayList);
			i++;
		}
		if(pelicula.size() == 0){
			System.out.println("No hay pelicula");
			return;
		}
		while(i < segmentos.size()){
			Segmento segmento = segmentos.get(i);
 			for(int j=0; j<pelicula.size(); j++){
 				ArrayList<Segmento> arrayList = pelicula.get(j);
				Segmento actual = arrayList.get(arrayList.size()-1);
				if(arrayList.size() >= 2){
					Segmento anterior = arrayList.get(arrayList.size()-2);
					if(anterior.puedeEntrar(segmento) && anterior.calcularCosto(segmento) < actual.calcularCosto(segmento) && segmento!=actual){
						ArrayList<Segmento> nuevo = (ArrayList<Segmento>) pelicula.get(j).clone();
						nuevo.remove(nuevo.size()-1);
						nuevo.add(segmento);
						pelicula.add(nuevo);
						flag=1;
					}
				}
   				if(actual.puedeEntrar(segmento) && !actual.estaIncluido(segmento)){
					opcion = actual.calcularCosto(segmento);
					if(opcion < mejorOpcion){
						mejorOpcion = opcion;
						mejorPosicion = j;
					}
				}
			}
			if(mejorPosicion == -1 && flag==0){
				System.out.println("No hay pelicula");
				return;
			}
			if(mejorPosicion!=-1){
				pelicula.get(mejorPosicion).add(segmento);			
			}
			mejorPosicion = -1;
			mejorOpcion = 10001;
			flag=0;
			i++;
		}
		for(int k=pelicula.size()-1; k>=0;k--){
			ArrayList<Segmento> array = pelicula.get(k);
			if(array.get(array.size()-1).getEscenaFinal() != escenaFinal){
				pelicula.remove(array);
			}
		}
	}
	
	public ArrayList<Segmento> determinarCostoMenor(){
		int menor=10001, actual=0, posicionMenor=-1;
		for(int i=0; i<pelicula.size(); i++){
			ArrayList<Segmento> arrayList = pelicula.get(i);
			actual = determinarCostoTotal(arrayList );
			if(actual < menor){
				menor = actual;
				posicionMenor = i;
			}
		}
		return pelicula.get(posicionMenor);
	}

	private int determinarCostoTotal(ArrayList<Segmento> arrayList) {
		int total=0;
		for(int i=0; i<arrayList.size()-1; i++){
			total += arrayList.get(i).calcularCosto(arrayList.get(i+1));
		}
		return total;
	}
	
	public void aArchivo(String path) throws IOException{
		FileWriter fc= new FileWriter(new File(path));
		PrintWriter pw= new PrintWriter(fc);
		ArrayList<Segmento> winner = determinarCostoMenor();
		for(int i=0;i<winner.size();i++){
			pw.print(winner.get(i).getNumero()+" ");
		}
		fc.close();
	}
}
