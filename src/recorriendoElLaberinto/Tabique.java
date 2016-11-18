package recorriendoElLaberinto;

public class Tabique {

	private int coordenadaXInicial;
	private int coordenadaXFinal;
	private int coordenadaYInicial;
	private int coordenadaYFinal;
	
	public Tabique(int coordenadaXInicial, int coordenadaYInicial, int coordenadaXFinal, int coordenadaYFinal){
		this.coordenadaXInicial = coordenadaXInicial;
		this.coordenadaXFinal = coordenadaXFinal;
		this.coordenadaYInicial = coordenadaYInicial;
		this.coordenadaYFinal = coordenadaYFinal;
	}

	public int getCoordenadaXInicial() {
		return coordenadaXInicial;
	}

	public void setCoordenadaXInicial(int coordenadaXInicial) {
		this.coordenadaXInicial = coordenadaXInicial;
	}

	public int getCoordenadaXFinal() {
		return coordenadaXFinal;
	}

	public void setCoordenadaXFinal(int coordenadaXFinal) {
		this.coordenadaXFinal = coordenadaXFinal;
	}

	public int getCoordenadaYInicial() {
		return coordenadaYInicial;
	}

	public void setCoordenadaYInicial(int coordenadaYInicial) {
		this.coordenadaYInicial = coordenadaYInicial;
	}

	public int getCoordenadaYFinal() {
		return coordenadaYFinal;
	}

	public void setCoordenadaYFinal(int coordenadaYFinal) {
		this.coordenadaYFinal = coordenadaYFinal;
	}
}
