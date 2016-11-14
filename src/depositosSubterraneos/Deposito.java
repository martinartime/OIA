package depositosSubterraneos;

public class Deposito {
	private int profundidad;
	private int superficie;
	private int cantidadDeLiquidoActual;
	private int volumen;

	public Deposito(int superficie, int profundidad){
		this.profundidad = profundidad;
		this.superficie = superficie;
		this.volumen = superficie*profundidad;
		this.cantidadDeLiquidoActual = 0;
	}

	public void sumarLiquido(int liquido){
		cantidadDeLiquidoActual += liquido;
	}
	
	public int getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(int profundidad) {
		this.profundidad = profundidad;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public int getCantidadDeLiquidoActual() {
		return cantidadDeLiquidoActual;
	}

	public void setCantidadDeLiquidoActual(int cantidadDeLiquidoActual) {
		this.cantidadDeLiquidoActual = cantidadDeLiquidoActual;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public void alturaActual(int profundidadActual) {
		cantidadDeLiquidoActual=profundidadActual;
		
	}
}
