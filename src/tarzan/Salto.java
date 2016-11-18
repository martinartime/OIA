package tarzan;

public class Salto {

	private Arbol arbolInicial;
	private Arbol arbolFinal;
	private double distancia;
	private int peso;
	
	public Salto(Arbol arbolInicial, Arbol arbolFinal){
		this.arbolInicial = arbolInicial;
		this.arbolFinal = arbolFinal;
		calcularDistancia();
		determinarPeso();
	}

	private void calcularDistancia() {
		distancia =  Math.abs(arbolFinal.obtenerModulo() - arbolFinal.obtenerModulo());
	}
	
	private void determinarPeso(){
		if(distancia<=50){
			peso = 1;
		}
		else if(distancia<=100){
			peso = 2;
		}
		else{
			peso = 30000;
		}
	}

	public Arbol getArbolInicial() {
		return arbolInicial;
	}

	public void setArbolInicial(Arbol arbolInicial) {
		this.arbolInicial = arbolInicial;
	}

	public Arbol getArbolFinal() {
		return arbolFinal;
	}

	public void setArbolFinal(Arbol arbolFinal) {
		this.arbolFinal = arbolFinal;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
}
