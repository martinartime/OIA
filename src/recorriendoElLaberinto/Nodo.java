package recorriendoElLaberinto;

public class Nodo implements Comparable{

	private int numero;
	private int peso;
	
	public Nodo(int numero, int peso){
		this.numero = numero;
		this.peso = peso;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		result = prime * result + peso;
		return result;
	}

	public boolean equals(Nodo nodo) {
		return numero == nodo.numero;
	}

	@Override
	public int compareTo(Object arg0) {
		if(peso > ((Nodo) arg0).peso){
			return 1;
		}
		else if(peso < ((Nodo) arg0).peso){
			return -1;
		}
		return 0;
	}
}
