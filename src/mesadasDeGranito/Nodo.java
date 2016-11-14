package mesadasDeGranito;

public class Nodo {
	private Mesada mesada;
	private Nodo siguiente;
	
	public Nodo(){
		mesada = new Mesada();
		siguiente = null;
	}

	public Nodo(Nodo nodo, Mesada mesada){
		this.mesada = mesada.clone();
		this.siguiente = nodo;
	}

	public Nodo(double ancho, double largo, Nodo nodo){
		this.mesada = new Mesada(ancho,largo);
		this.siguiente = nodo;
	}
	
	public Mesada getMesada() {
		return mesada;
	}

	public void setMesada(Mesada mesada) {
		this.mesada = mesada;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
}
