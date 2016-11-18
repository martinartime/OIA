package recorriendoElLaberinto;

public class MatrizSimetrica {

	private int []matriz;
	private int largo;
	private int ancho;
	private int cantidadDeNodos;
	
	public MatrizSimetrica(int largo, int ancho){
		cantidadDeNodos = largo*ancho;
		matriz = new int[(cantidadDeNodos)*(cantidadDeNodos-1)/2];
		inicializarMatriz();
	}

	private void inicializarMatriz() {
		for(int i=0; i<cantidadDeNodos; i++){
			matriz[i]=0;
		}
	}
	
	public int getValor(int i, int j){
		return matriz[(int) (i*cantidadDeNodos+j-(Math.pow(i, 2)+3*i+2)/2)];
	}
	
	public void setValor(int i, int j, int valor){
		matriz[(int) (i*cantidadDeNodos+j-(Math.pow(i, 2)+3*i+2)/2)] = valor;
	}
}
