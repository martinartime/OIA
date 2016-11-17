package elGusano;

public class Grafo {

	private MatrizSimetrica matriz;
	private int cantidadDeNodos;
	
	public Grafo(int cantidadDeNodos){
		this.cantidadDeNodos = cantidadDeNodos;
		matriz = new MatrizSimetrica(cantidadDeNodos);
	}
	
	public void setConexion(int nodoInicial, int nodoFinal, int peso){
		matriz.setMatriz(nodoInicial, nodoFinal, peso);
	}

	public int getCantidadDeNodos() {
		return cantidadDeNodos;
	}

	public void setCantidadDeNodos(int cantidadDeNodos) {
		this.cantidadDeNodos = cantidadDeNodos;
	}

	public int getConexion(int nodoInicial, int nodoFinal){
		return matriz.getMatriz(nodoInicial, nodoFinal);
	}
}
