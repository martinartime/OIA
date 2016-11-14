package mesadasDeGranito;

public class Mesada implements Comparable<Mesada> {
	private double ancho;
	private double largo;
	
	public Mesada(){
		ancho = 0;
		largo = 0;
	}
	
	public Mesada(double ancho, double largo){
		this.ancho = ancho;
		this.largo = largo;
	}
	
	public Mesada clone(){
		return new Mesada(ancho, largo);
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	@Override
	public String toString() {
		return "Mesada [ancho=" + ancho + ", largo=" + largo + "]";
	}
	
	public void rotar(){
		double auxiliar = ancho;
		ancho = largo;
		largo = auxiliar;
	}

	@Override
	public int compareTo(Mesada arg0) {
		if(this.ancho > arg0.ancho)
			return -1;
		if(this.ancho < arg0.ancho)
			return 1;
		return 0;
	}
}
