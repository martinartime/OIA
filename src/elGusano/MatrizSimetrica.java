package elGusano;

public class MatrizSimetrica {

	private int []matriz;
	private int cantidadDeNodos;
	
	public MatrizSimetrica(int cantidadDeNodos){
		this.cantidadDeNodos = cantidadDeNodos;
		matriz = new int[(cantidadDeNodos*(cantidadDeNodos-1))/2];
//		inicializarMatriz();
	}

	public int getMatriz(int i, int j) {
		return matriz[(int) (i*cantidadDeNodos+j-(Math.pow(i, 2)+i*3+2)/2)];
	}

	public void setMatriz(int i, int j, int valor) {
		matriz[(int) (i*cantidadDeNodos+j-(Math.pow(i, 2)+i*3+2)/2)] = valor;
	}

	public int getCantidadDeNodos() {
		return cantidadDeNodos;
	}

	public void setCantidadDeNodos(int cantidadDeNodos) {
		this.cantidadDeNodos = cantidadDeNodos;
	}
	
	public void inicializarMatriz(){
		for(int i=0; i<cantidadDeNodos; i++){
			matriz[i] = Integer.MAX_VALUE;
		}
	}
}
