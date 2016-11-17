package elGusano;

public class Arista {

	private int peso;
	private int nodoInicial;
	private int nodoFinal;
	
	public Arista(int nodoInicial, int peso, int nodoFinal){
		this.peso = peso;
		this.nodoFinal = nodoFinal;
		this.nodoInicial = nodoInicial;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getNodoInicial() {
		return nodoInicial;
	}

	public void setNodoInicial(int nodoInicial) {
		this.nodoInicial = nodoInicial;
	}

	public int getNodoFinal() {
		return nodoFinal;
	}

	public void setNodoFinal(int nodoFinal) {
		this.nodoFinal = nodoFinal;
	}
}
