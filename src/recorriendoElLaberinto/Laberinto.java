package recorriendoElLaberinto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Laberinto {

	private Grafo grafo;
	private ArrayList<Tabique> tabiques;
	private int cantidadDeTabiques;
	private int largo;
	private int ancho;
	private int cantidadDeNodos;
	private int menorCantidadDePasos;
	
	public Laberinto(String path) throws IOException{
		Scanner scanner = new Scanner(new File(path));
		largo = scanner.nextInt();
		ancho = scanner.nextInt();
		cantidadDeTabiques = scanner.nextInt();
		cantidadDeNodos = largo*ancho;
		tabiques = new ArrayList<>();
		grafo = new Grafo(largo, ancho);
		for(int i=0; i<cantidadDeTabiques; i++){
			tabiques.add(new Tabique(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
		}
		scanner.close();
	}
	
	public int obtenerMenorCantidadDePasosHastaLaSalida(){
		desconectarNodosPorTabiques();
		Nodo nodoInicial = new Nodo(0, 0);
		int []distancias = dijkstra(nodoInicial);
		menorCantidadDePasos = distancias[distancias.length-1];
		return menorCantidadDePasos;
	}
	
	private int[] dijkstra(Nodo nodoInicial) {
		boolean []estados = new boolean[cantidadDeNodos];
		int []distancias = new int[cantidadDeNodos];
		
		for(int i=0; i<cantidadDeNodos; i++){
			estados[i]=false;
			distancias[i]=Integer.MAX_VALUE;
		}
		PriorityQueue<Nodo> cola = new PriorityQueue<>();
		cola.add(nodoInicial);
		while(!cola.isEmpty()){
			Nodo nodo = cola.poll();
			estados[nodo.getNumero()]=true;
			ArrayList<Integer> adyacentes = obtenerAdyacentes(nodo);
			for(Integer adyacente : adyacentes){
				int peso = nodo.getNumero()<adyacente ? grafo.getValor(nodo.getNumero(), adyacente) : grafo.getValor(adyacente, nodo.getNumero());
				if(!estados[adyacente] && peso+nodo.getPeso()<distancias[adyacente]){
					distancias[adyacente] = peso+nodo.getPeso();
					Nodo nodoInsertar = new Nodo(adyacente, distancias[adyacente]);
					if(cola.contains(nodoInsertar)){
						cola.remove(nodoInsertar);
					}
					cola.add(nodoInsertar);
				}
			}
		}
		return distancias;
	}

	private ArrayList<Integer> obtenerAdyacentes(Nodo nodo) {
		ArrayList<Integer> adyacentes = new ArrayList<>();
		for(int i=0; i<cantidadDeNodos; i++){
			if((i<nodo.getNumero() && grafo.getValor(i, nodo.getNumero())==1) || (i>nodo.getNumero() && grafo.getValor(nodo.getNumero(), i)==1)){
				adyacentes.add(i);
			}
		}
		return adyacentes;
	}

	public void desconectarNodosPorTabiques(){
		for(Tabique tabique : tabiques){
			if(tabique.getCoordenadaXInicial()==tabique.getCoordenadaXFinal()){
				for(int i=tabique.getCoordenadaYInicial(); i<tabique.getCoordenadaYFinal(); i++){
					int numeroDeNodo = tabique.getCoordenadaXInicial() + (i*largo);
					grafo.setValor(numeroDeNodo-1, numeroDeNodo, 0);
				}
			}
			else{
				for(int i=tabique.getCoordenadaXInicial(); i<tabique.getCoordenadaXFinal(); i++){
					int numeroDeNodo = tabique.getCoordenadaYInicial()*largo + i;
					grafo.setValor(numeroDeNodo-largo, numeroDeNodo, 0);
				}
			}
		}
	}
	
	public void aArchivo(String path) throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File(path)));
		pw.print(menorCantidadDePasos);
		pw.close();
	}
}
