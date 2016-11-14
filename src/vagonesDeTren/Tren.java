package vagonesDeTren;

import java.util.ArrayList;
import java.util.List;

public class Tren {
	private List<Vagon>vagones;
	private int agresividadTotal;
	
	public Tren(){
		vagones=new ArrayList<Vagon>();
		agresividadTotal=0;
	}
	
	public void add(Vagon vagon){
		vagones.add(vagon);
		
		calcularAgresividadTotal();
	}
	
	public int calcularAgresividadTotal(){
		agresividadTotal=0;
		for(Vagon vagon:vagones){
			agresividadTotal+=vagon.getAgresividad();
		}
		return agresividadTotal;
	}
	
	public int getAgresividadTotal(){
		return agresividadTotal;
	}

	public List<Vagon> getVagones() {
		return vagones;
	}

	public void setVagones(List<Vagon> vagones) {
		this.vagones = vagones;
	}
	
	public int getSize(){
		return vagones.size();
	}
}
