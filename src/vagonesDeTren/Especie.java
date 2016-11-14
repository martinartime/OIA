package vagonesDeTren;

public class Especie implements Comparable<Especie> {
	private String nombre;
	private int agresividad;
	private int cantidad;
	
	public Especie(String nombre, int agresividad, int cantidad){
		this.nombre=nombre;
		this.agresividad=agresividad;
		this.cantidad=cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAgresividad() {
		return agresividad;
	}

	public void setAgresividad(int agresividad) {
		this.agresividad = agresividad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public int compareTo(Especie arg0) {
		if(this.agresividad>arg0.agresividad){
			return -1;
		}
		if(this.agresividad<arg0.agresividad){	
			return 1;
		}
		return 0;
	}
	
	
}
