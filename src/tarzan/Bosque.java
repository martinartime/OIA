package tarzan;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Bosque {

	private MatrizSimetrica matriz;
	private ArrayList<Arbol> arboles;
	private ArrayList<Salto> saltos;
	private ArrayList<Salto> superSaltosUsados;
	private int cantidadDeArboles;
	private boolean valido;
	private int []distancia;
	private Arbol []padre;
	private boolean []estado;
	
	public Bosque(String path) throws IOException{
		Scanner scanner = new Scanner(new File(path));
		valido = false;
		arboles = new ArrayList<>();
		saltos = new ArrayList<>();
		superSaltosUsados = new ArrayList<>();
		int i=0;
		while(scanner.hasNext()){
			arboles.add(new Arbol(i, scanner.nextInt(), scanner.nextInt()));
			i++;
		}
		cantidadDeArboles = i;
		matriz = new MatrizSimetrica(cantidadDeArboles);
		armarSaltos();
		scanner.close();
	}
	
	public void calcularRuta(){
		do{
			dijkstra();
			calcularSaltosDe100Usados();
			if(superSaltosUsados.size()>1){
				valido = false;
				sacarUnSaltoDe100();
			}
		}while(!valido);
	}

	private void sacarUnSaltoDe100() {
		Salto superSalto = superSaltosUsados.get(superSaltosUsados.size()-1);
		superSalto.getArbolInicial().getAdyacentes().remove(superSalto.getArbolFinal());
		superSalto.getArbolFinal().getAdyacentes().remove(superSalto.getArbolInicial());
		if (superSalto.getArbolFinal().getNumero() < superSalto.getArbolInicial().getNumero()){
			matriz.setValor(superSalto.getArbolInicial().getNumero(), superSalto.getArbolFinal().getNumero(), 30000);
		}
		else{
			matriz.setValor(superSalto.getArbolFinal().getNumero(), superSalto.getArbolInicial().getNumero(), 30000);
		}
	}

	private void calcularSaltosDe100Usados() {
		int i=cantidadDeArboles-1;
		while(i>0){
			Salto salto = new Salto(padre[i], arboles.get(i));
			if(salto.getPeso()==2){
				superSaltosUsados.add(salto);
			}
			i = padre[i].getNumero();
		}
	}

	private void armarSaltos() {
		for(int i=0; i<cantidadDeArboles-1; i++){
			for(int j=i+1; j<cantidadDeArboles-1; j++){
				Salto saltoActual = new Salto(arboles.get(i), arboles.get(j));
				saltos.add(saltoActual);
				if(saltoActual.getPeso()<=2){
					arboles.get(i).setAdyacentes(arboles.get(j));
					arboles.get(j).setAdyacentes(arboles.get(i));
				}
				matriz.setValor(i, j, saltoActual.getPeso());
			}
		}
	}
	
	private void dijkstra(){
		distancia = new int[cantidadDeArboles];
		padre = new Arbol[cantidadDeArboles];
		estado = new boolean[cantidadDeArboles];
		
		for(int i=0; i<cantidadDeArboles; i++){
			distancia[i] = 30000;
			padre[i] = null;
			estado[i] = false;
		}
		PriorityQueue<Arbol> cola = new PriorityQueue<>();
		Arbol arbolInicial = arboles.get(0);
		cola.add(arbolInicial);
		arbolInicial.setPeso(0);
		distancia[arbolInicial.getNumero()]=0;
		while(!cola.isEmpty()){
			Arbol arbolActual = cola.poll();
			estado[arbolActual.getNumero()]=true;
			for(Arbol adyacente : arbolActual.getAdyacentes()){
				int peso = arbolActual.getNumero()<adyacente.getNumero() ? matriz.getValor(arbolActual.getNumero(), adyacente.getNumero()) : 
																		   matriz.getValor(adyacente.getNumero(), arbolActual.getNumero());
				if(!estado[adyacente.getNumero()] && arbolActual.getPeso()+peso < distancia[adyacente.getNumero()]){
					distancia[adyacente.getNumero()] = arbolActual.getPeso()+peso;
					adyacente.setPeso(arbolActual.getPeso()+peso);
					cola.add(adyacente);
					padre[adyacente.getNumero()] = arbolActual;
				}
			}
		}
	}
	
	public void aArchivo(String path) throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File(path)));
		int i=cantidadDeArboles-1;
		while(i>0){
			pw.println(arboles.get(i).getPosicionX()+" "+arboles.get(i).getPosicionY());
			i = padre[i].getNumero();
		}
	}
}
