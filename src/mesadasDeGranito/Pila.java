package mesadasDeGranito;

public class Pila {
	private Nodo nodo;
	
	public Pila(){
		nodo = null;
	}
	
	public void apilar(Mesada mesada){
		Nodo nodo = new Nodo();
		if(this.nodo == null)
			nodo.setSiguiente(null);
		else
			nodo.setSiguiente(this.nodo.getSiguiente());
		nodo.setMesada(mesada);
		this.nodo = nodo;
	}

	public Nodo getNodo() {
		return nodo;
	}

	public void setNodo(Nodo nodo) {
		this.nodo = nodo;
	}
}
