package tarzan;

public class MatrizSimetrica {

	private int[]matriz;
	private int cantidadDeNodos;
	
	public MatrizSimetrica(int cantidadDeNodos){
		this.cantidadDeNodos = cantidadDeNodos;
		matriz = new int[(cantidadDeNodos)*(cantidadDeNodos-1)/2];
	}

	public int getValor(int i, int j) {
		return matriz[(int) (i*cantidadDeNodos+j-(Math.pow(i, 2)+3*i+2)/2)];
	}

	public void setValor(int i, int j, int valor) {
		matriz[(int) (i*cantidadDeNodos+j-(Math.pow(i, 2)+3*i+2)/2)] = valor;
	}

	public int getCantidadDeNodos() {
		return cantidadDeNodos;
	}

	public void setCantidadDeNodos(int cantidadDeNodos) {
		this.cantidadDeNodos = cantidadDeNodos;
	}
}
