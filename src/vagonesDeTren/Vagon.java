package vagonesDeTren;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vagon {
	private List<Especie> animales;
	private int agresividad;
	private int agresividadMinima;
	private int agresividadMaxima;
	
	public Vagon(){
		animales=new ArrayList<Especie>();
		agresividad=0;
		agresividadMaxima=0;
		agresividadMinima=0;
	}
	
	public void add(Especie animal){
		animales.add(animal);
		calcularAgresividad();
	}

	private void calcularAgresividad() {
		agresividadMaxima=Collections.min(animales).getAgresividad();
		agresividadMinima=Collections.max(animales).getAgresividad();
		agresividad = agresividadMaxima-agresividadMinima;
	}
	
	public int getAgresividad(){
		return agresividad;
	}

	public int getAgresividadMinima() {
		return agresividadMinima;
	}

	public void setAgresividadMinima(int agresividadMinima) {
		this.agresividadMinima = agresividadMinima;
	}

	public int getAgresividadMaxima() {
		return agresividadMaxima;
	}

	public void setAgresividadMaxima(int agresividadMaxima) {
		this.agresividadMaxima = agresividadMaxima;
	}
	
}
