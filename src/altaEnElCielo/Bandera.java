package altaEnElCielo;

import java.util.ArrayList;

public class Bandera {
	private int longitud;
	private int cortes;
	private int longitudInicial;
	private ArrayList<Integer> tamañosParciales;
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getCortes() {
		return cortes;
	}

	public void setCortes(int cortes) {
		this.cortes = cortes;
	}

	public int getLongitudInicial() {
		return longitudInicial;
	}

	public void setLongitudInicial(int longitudInicial) {
		this.longitudInicial = longitudInicial;
	}
	
	public ArrayList<Integer> getTamañosParciales() {
		return tamañosParciales;
	}

	public void setTamañosParciales(ArrayList<Integer> tamañosParciales) {
		this.tamañosParciales = tamañosParciales;
	}


	public Bandera(int longitudInicial){
		this.longitud=0;
		this.cortes=0;
		this.longitudInicial=longitudInicial;
		tamañosParciales = new ArrayList<Integer>();
	}
	
	public void aumentarCortes(){
		cortes++;
	}
	
	public void aumentarLongitud(){
		longitud+=longitudInicial;
		aumentarCortes();
		tamañosParciales.add(longitudInicial);
		aumentarLongitudInicial();
	}

	private void aumentarLongitudInicial() {
		String longitudNueva = String.valueOf(longitudInicial);
		for(int i=0;i<longitudNueva.length();i++){
			longitudInicial+= Character.getNumericValue(longitudNueva.charAt(i));
		}
	}
}
