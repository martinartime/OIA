package noSePuedeVivirAhi;

import java.util.ArrayList;
import java.util.Collections;

public class Lugar implements Comparable<Lugar>{
	private int numero;
	private ArrayList<Integer> temperaturas;
	private int temperaturaMaxima;
	private int temperaturaMinima;
	private int nivelDeHostilidad;
	private int empates;
	private int cantidadDeNoComparables;
	
	public Lugar(ArrayList<Integer> temperaturas, int numero){
		this.numero = numero;
		this.temperaturas = temperaturas;
		this.cantidadDeNoComparables=0;
		this.empates=0;
		this.nivelDeHostilidad=0;
		this.temperaturaMaxima = Collections.max(temperaturas);
		this.temperaturaMinima = Collections.min(temperaturas);
	}

	@Override
	public int compareTo(Lugar arg0) {
		if(this.nivelDeHostilidad>arg0.nivelDeHostilidad){
			return 1;			
		}
		else if (this.nivelDeHostilidad==arg0.nivelDeHostilidad){
			return 0;
		}
		return -1;
	}
	
	public boolean masHostilQue(Lugar lugar){
		return (this.temperaturaMaxima > lugar.temperaturaMaxima && this.temperaturaMinima < lugar.temperaturaMinima) || (this.temperaturaMaxima == lugar.temperaturaMaxima && this.temperaturaMinima < lugar.temperaturaMinima) || (this.temperaturaMaxima > lugar.temperaturaMaxima && this.temperaturaMinima == lugar.temperaturaMinima);
	}
	
	public boolean empate(Lugar lugar){
		return this.temperaturaMaxima == lugar.temperaturaMaxima && this.temperaturaMinima == lugar.temperaturaMinima;
	}
	
	public boolean noComparable(Lugar lugar){
		return (this.temperaturaMaxima > lugar.temperaturaMaxima && this.temperaturaMinima > lugar.temperaturaMinima) || (this.temperaturaMaxima < lugar.temperaturaMaxima && this.temperaturaMinima < lugar.temperaturaMinima);
	}
	
	public boolean MasHostil(int nivel){
		return this.nivelDeHostilidad == nivel;
	}

	public void sumarHostilidad() {
		nivelDeHostilidad++;
	}

	public void sumarEmpate() {
		empates++;
	}

	public void sumarNoComparable() {
		cantidadDeNoComparables++;
	}

	public int getNivelDeHostilidad() {
		return nivelDeHostilidad;
	}

	public void setNivelDeHostilidad(int nivelDeHostilidad) {
		this.nivelDeHostilidad = nivelDeHostilidad;
	}

	public int getCantidadDeNoComparables() {
		return cantidadDeNoComparables;
	}

	public void setCantidadDeNoComparables(int cantidadDeNoComparables) {
		this.cantidadDeNoComparables = cantidadDeNoComparables;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
