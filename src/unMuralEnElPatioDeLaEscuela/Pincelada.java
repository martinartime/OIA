package unMuralEnElPatioDeLaEscuela;

public class Pincelada {
	private int hilera;
	private int inicio;
	private int fin;
	private char color;
	
	public Pincelada(int hilera, String color, int inicio, int fin){
		this.hilera = hilera-1;
		this.inicio = inicio;
		this.fin = fin;
		this.color = color.charAt(0);
	}

	public boolean esMiColor(char color){
		return this.color == color;
	}
	
	public int getHilera() {
		return hilera;
	}

	public void setHilera(int hilera) {
		this.hilera = hilera;
	}

	public int getInicio() {
		return inicio;
	}

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public int getFin() {
		return fin;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}
}
