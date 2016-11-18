package recorriendoElLaberinto;

public class Grafo {

	private MatrizSimetrica matriz;
	private int cantidadDeNodos;
	private int largo;
	private int ancho;
	
	public Grafo(int largo, int ancho){
		this.largo = largo;
		this.ancho = ancho;
		matriz = new MatrizSimetrica(largo, ancho);
		this.cantidadDeNodos = largo * ancho;
		setearAdyacentes();
	}
	
	public void setearAdyacentes(){
		int k=0;
		for(int i=0; i<largo-1; i++){
			for(int j=0; j<ancho-1; j++){
				if(i<largo-2){
					matriz.setValor(k, k+1, 1);
				}
				if(j<ancho-2){
					matriz.setValor(k, k+largo, 1);
				}
				k++;
			}
		}
	}
	
	public int getValor(int i, int j){
		return matriz.getValor(i, j);
	}
	
	public void setValor(int i, int j, int valor){
		matriz.setValor(i, j, valor);
	}
}
