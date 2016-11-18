package tarzan;

import java.util.ArrayList;

public class Arbol implements Comparable<Arbol>{

	private int posicionX;
	private int posicionY;
	private int numero;
	private int peso;
	private ArrayList<Arbol> adyacentes;
	
	public Arbol(int numero, int posicionX, int posicionY){
		this.numero = numero;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		adyacentes = new ArrayList<>();
	}

	public int getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosicionY() {
		return posicionY;
	}

	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
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

	public void setAdyacentes(Arbol arbol) {
		adyacentes.add(arbol);
	}

	public double obtenerModulo() {
		return Math.sqrt(Math.pow(posicionX, 2)+Math.pow(posicionY, 2));
	}

	public ArrayList<Arbol> getAdyacentes() {
		return adyacentes;
	}

	@Override
	public int compareTo(Arbol o) {
		if(peso < o.peso){
			return 1;
		}
		else if(peso > o.peso){
			return -1;
		}
		else{
			return 0;
		}
	}
}
