package reconstruyendoLaPelicula;

public class Segmento {
	private int numero;
	private int escenaInicial;
	private int escenaFinal;
	
	public Segmento( int numero, int escenaInicial, int escenaFinal){
		this.numero = numero;
		this.escenaInicial = escenaInicial;
		this.escenaFinal = escenaFinal;
	}
	
	public boolean puedeEntrar(Segmento segmento){
		return this.getEscenaFinal() >= segmento.getEscenaInicial()-1;
	}
	
	public boolean estaIncluido(Segmento segmento){
		return (this.getEscenaFinal() >= segmento.getEscenaFinal()) && this.getEscenaInicial() <= segmento.getEscenaInicial();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getEscenaInicial() {
		return escenaInicial;
	}

	public void setEscenaInicial(int escenaInicial) {
		this.escenaInicial = escenaInicial;
	}

	public int getEscenaFinal() {
		return escenaFinal;
	}

	public void setEscenaFinal(int escenaFinal) {
		this.escenaFinal = escenaFinal;
	}

	public int calcularCosto(Segmento segmento) {
		return this.getEscenaFinal() == segmento.getEscenaInicial()-1 ? 0 : this.getEscenaFinal() - segmento.getEscenaInicial()+1;
	}
}
