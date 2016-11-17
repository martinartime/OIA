package elGusano;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Gusano {

	private Grafo grafo;
	private ArrayList<Arista> aristas;
	private ArrayList<Integer> posiblesInfectadores;
	private HashMap<Integer, ArrayList<Integer>> adyacentes;
	private HashMap<Integer, Integer> nodosInfectados;
	
	public Gusano(String path) throws IOException{
		Scanner scanner = new Scanner(new File(path));
		aristas = new ArrayList<>();
		nodosInfectados = new HashMap<>();
		adyacentes = new HashMap<>();
		int cantidadDeAristas = scanner.nextInt();
		for(int i=0; i<cantidadDeAristas; i++){
			int nodoInicial = scanner.nextInt()-1;
			int peso = scanner.nextInt();
			int nodoFinal = scanner.nextInt()-1;
			if(nodoInicial>nodoFinal){
				int aux = nodoFinal;
				nodoFinal = nodoInicial;
				nodoInicial = aux;
			}
			aristas.add(new Arista(nodoInicial, peso, nodoFinal));
			if(!adyacentes.containsKey(nodoInicial)){
				adyacentes.put(nodoInicial, new ArrayList<Integer>());
			}
			adyacentes.get(nodoInicial).add(nodoFinal);
			if(!adyacentes.containsKey(nodoFinal)){
				adyacentes.put(nodoFinal, new ArrayList<Integer>());
			}
			adyacentes.get(nodoFinal).add(nodoInicial);
		}
		int cantidadDeNodos = Collections.max(adyacentes.keySet())+1;
		grafo = new Grafo(cantidadDeNodos);
		setearAristasDeGrafo();
		nodosInfectados = new HashMap<>();
		int cantidadDeInfectados = scanner.nextInt();
		for(int j=0; j<cantidadDeInfectados; j++){
			nodosInfectados.put(scanner.nextInt()-1, scanner.nextInt());
		}
		scanner.close();
	}
	
	private void setearAristasDeGrafo(){
		for(Arista arista : aristas){
			grafo.setConexion(arista.getNodoInicial(), arista.getNodoFinal(), arista.getPeso());
		}
	}
	
	public void buscarPosiblesInfectadores(){
		Iterator<Integer> iterador = nodosInfectados.keySet().iterator();
		int primerNodo = iterador.next();
		ArrayList<Integer> distancias = dijkstra(primerNodo);
		posiblesInfectadores = buscarNodosSospechosos(distancias, nodosInfectados.get(primerNodo));
		determinarOrigenes(iterador);
	}

	private void determinarOrigenes(Iterator<Integer> iterador) {
		while(iterador.hasNext()){
			int nodoActual = iterador.next();
			ArrayList<Integer> distancias = dijkstra(nodoActual);
			evaluarSospechosos(distancias, nodoActual);
		}
	}

	private void evaluarSospechosos(ArrayList<Integer> distancias, int nodoActual) {
		for(int i=posiblesInfectadores.size()-1; i>=0; i--){
			if(distancias.get(posiblesInfectadores.get(i)) != nodosInfectados.get(nodoActual)){
				posiblesInfectadores.remove(i);
			}
		}
	}
	
	private ArrayList<Integer> buscarNodosSospechosos(ArrayList<Integer> distancias, Integer primerNodo) {
		ArrayList<Integer> nodosSospechosos = new ArrayList<>();
		for(int i=0; i<distancias.size(); i++){
			if(distancias.get(i) == primerNodo){
				nodosSospechosos.add(i);
			}
		}
		return nodosSospechosos;
	}

//	private ArrayList<Integer> parcialDijkstra(int nodo) {
//		int cantidadDeNodosSospechososEncontrados=0;
//		ArrayList<Integer> distancia = new ArrayList<>();
//		ArrayList<Boolean> estado = new ArrayList<>();
//		for(int i=0; i<grafo.getCantidadDeNodos(); i++){
//			distancia.add(Integer.MAX_VALUE);
//			estado.add(false);
//		}
//		distancia.set(nodo, 0);
//		PriorityQueue<Nodo> cola = new PriorityQueue<>();
//		cola.add(new Nodo(nodo, 0));
//		while(!cola.isEmpty() && cantidadDeNodosSospechososEncontrados!=posiblesInfectadores.size()){
//			Nodo nodoActual = cola.poll();
//			estado.set(nodoActual.getNumero(), true);
//			for(int adyacente: adyacentes.get(nodoActual.getNumero())){
//				int peso = adyacente>nodoActual.getNumero() ? grafo.getConexion(nodoActual.getNumero(), adyacente) :
//					grafo.getConexion(adyacente, nodoActual.getNumero());
//				if(!estado.get(adyacente) && peso+nodoActual.getDistancia() < distancia.get(adyacente)){
//					if(posiblesInfectadores.contains(adyacente)){
//						cantidadDeNodosSospechososEncontrados++;
//					}
//					distancia.set(adyacente, peso+nodoActual.getDistancia());
//					Nodo nodoInsertar = new Nodo(adyacente, distancia.get(adyacente));
//					if(cola.contains(nodoInsertar)){
//						cola.remove(nodoInsertar);
//					}
//					cola.add(nodoInsertar);
//				}
//			}
//		}
//		return distancia;
//	}

	private ArrayList<Integer> dijkstra(int primerNodo) {
		ArrayList<Integer> distancia = new ArrayList<>();
		ArrayList<Boolean> estado = new ArrayList<>();
		for(int i=0; i<grafo.getCantidadDeNodos(); i++){
			distancia.add(Integer.MAX_VALUE);
			estado.add(false);
		}
		distancia.set(primerNodo, 0);
		PriorityQueue<Nodo> cola = new PriorityQueue<>();
		cola.add(new Nodo(primerNodo, 0));
		while(!cola.isEmpty()){
			Nodo nodoActual = cola.poll();
			estado.set(nodoActual.getNumero(), true);
			for(int adyacente: adyacentes.get(nodoActual.getNumero())){
				int peso = adyacente>nodoActual.getNumero() ? grafo.getConexion(nodoActual.getNumero(), adyacente) :
					grafo.getConexion(adyacente, nodoActual.getNumero());
				if(!estado.get(adyacente) && peso+nodoActual.getDistancia() < distancia.get(adyacente)){
					distancia.set(adyacente, peso+nodoActual.getDistancia());
					Nodo nodoInsertar = new Nodo(adyacente, distancia.get(adyacente));
					if(cola.contains(nodoInsertar)){
						cola.remove(nodoInsertar);
					}
					cola.add(nodoInsertar);
				}
			}
		}
		return distancia;
	}

	public void aArchivo(String path) throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter(new File(path)));
		for(Integer infectador : posiblesInfectadores){
			pw.println(infectador+1);
		}
		pw.close();
	}

	public ArrayList<Integer> getPosiblesInfectadores() {
		return posiblesInfectadores;
	}
}
