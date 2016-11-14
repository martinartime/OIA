package comandoDeRobot;

public class Cuadricula {
	private int largo;
	private int ancho;
	
	
	public Cuadricula(int largo, int ancho){
		this.largo=largo;
		this.ancho=ancho;	
	}
	
	public boolean estaEnElLimiteSur(int fila){
		return fila==1;
	}
	
	public boolean estaEnElLimiteNorte(int fila){
		return fila==largo;
	}
	public boolean estaEnElLimiteEste(int columna){
		return columna==ancho;
	}
	public boolean estaEnElLimiteOeste(int columna){
		return columna==1;
	}
}
