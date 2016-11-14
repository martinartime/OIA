package aCorrer;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	private int numero;
	private int edadMinima;
	private int edadMaxima;
	private String sexo;
	private List<Corredor> corredores;
	private int[] ganadores;
	private int cantidadGanadores;
	
	public Categoria(int numero, int edadMinima, int edadMaxima, String sexo){
		corredores=new ArrayList<>();
		cantidadGanadores=0;
		ganadores=new int[3];
		for(int i=0;i<3;i++){
			ganadores[i]=0;
		}
		this.numero=numero;
		this.edadMinima=edadMinima;
		this.edadMaxima=edadMaxima;
		this.sexo=sexo;
		
	}
	public boolean comprobarSiEntra(Corredor corredor){
		return (corredor.getSexo().equals(sexo) && corredor.getEdad()>=edadMinima&&corredor.getEdad()<=edadMaxima);
	}
	public void add(Corredor corredor){
		corredores.add(corredor);
	}
	
	public boolean buscar(int numeroCorredor){
		for(Corredor corredor:corredores){
			if(corredor.getNumero()==numeroCorredor){
				return true;
			}
		}
		return false;
	}
	public int cantidadDeLlegadas() {
			return cantidadGanadores;
	}
	public void addGanador(int corredorQueFinalizo) {
		ganadores[cantidadGanadores++]=corredorQueFinalizo;
		
	}
	
	public int getNumero(){
		return numero;
	}
	public int obtenerGanador(int i) {
		return ganadores[i];
	}
}
