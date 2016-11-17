package elGusano;

public class Nodo implements Comparable<Nodo>{

	private int numero;
	private int distancia;

	public Nodo(int numero, int distancia){
		this.numero = numero;
		this.distancia = distancia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	@Override
	public int compareTo(Nodo nodo) {
		if(this.distancia > nodo.distancia){
			return 1;
		}
		else if(this.distancia < nodo.distancia){
			return -1;
		}
		return 0;
	}
	
	public boolean equals(Nodo nodo){
		return nodo.numero == this.numero;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}
}
