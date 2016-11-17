package conexionesDeRed;

import java.util.ArrayList;

public class Grafo {

	private MatrizSimetrica matriz;
	private int cantidadDeNodos;
	
	public Grafo(int cantidadDeNodos){
		this.cantidadDeNodos = cantidadDeNodos;
		matriz = new MatrizSimetrica(cantidadDeNodos);
	}
	
	public void setConexion(int nodoInicial, int nodoFinal){
		matriz.setValor(nodoInicial, nodoFinal);
	}
	
	public ArrayList<Integer> obtenerAdyacentes(int nodo){
		return matriz.getAdyacentes(nodo);
	}

	public int getCantidadDeNodos() {
		return cantidadDeNodos;
	}

	public void setCantidadDeNodos(int cantidadDeNodos) {
		this.cantidadDeNodos = cantidadDeNodos;
	}
	
}
