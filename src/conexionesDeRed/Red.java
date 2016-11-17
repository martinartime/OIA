package conexionesDeRed;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Red {

	private Grafo grafo;
	private ArrayList<String> respuestas;
	private String path;
	
	public Red(String path){
		this.path = path;
		respuestas = new ArrayList<>();
		grafo = new Grafo(1000000);
	}
	
	public void resolver() throws IOException{
		Scanner scanner = new Scanner(new File(path));
		
		while(scanner.hasNextLine()){
			String opcion = scanner.next();
			if(opcion.equals("F")){
				return;
			}
			int nodoInicial = scanner.nextInt()-1;
			int nodoFinal = scanner.nextInt()-1;
			scanner.nextLine();
			if(nodoInicial>nodoFinal){
				int aux = nodoFinal;
				nodoFinal = nodoInicial;
				nodoInicial = aux;
			}
			if(opcion.equals("P")){
				respuestas.add(busquedaEnAnchura(nodoInicial, nodoFinal));
			}
			else{
				grafo.setConexion(nodoInicial, nodoFinal);
			}
		}
		scanner.close();
	}

	private String busquedaEnAnchura(int nodoInicial, int nodoFinal) {
		int i=0;
		Queue<Integer> cola = new LinkedList<>();
		boolean []estados = new boolean[grafo.getCantidadDeNodos()];
		inicializarVectorDeEstados(estados);
		cola.add(nodoInicial);
		estados[i] = true;
		while(!cola.isEmpty()){
			int nodoActual = cola.poll();
			ArrayList<Integer> adyacentes = grafo.obtenerAdyacentes(nodoActual);
			for(Integer adyacente : adyacentes){
				if(!estados[adyacente]){
					estados[adyacente] = true;
					cola.add(adyacente);
					if(adyacente == nodoFinal){
						return "S";
					}
				}
			}
		}
		return "N";
	}

	private void inicializarVectorDeEstados(boolean []estados) {
		for(int i=0; i<estados.length; i++){
			estados[i]=false;
		}
	}
	
	public void aArchivo(String path) throws IOException{
		PrintWriter pw= new PrintWriter(new FileWriter(new File(path)));
		for(String respuesta : respuestas){
			pw.println(respuesta);
		}
		pw.close();
	}
}
