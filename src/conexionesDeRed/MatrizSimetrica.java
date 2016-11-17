package conexionesDeRed;

import java.util.ArrayList;
import java.util.HashMap;

public class MatrizSimetrica {

	private HashMap<Integer, ArrayList<Integer>> matriz;
	private int ordenDeMatriz;
	
	public MatrizSimetrica(int ordenDeMatriz){
		matriz = new HashMap<>();
		this.ordenDeMatriz = ordenDeMatriz;
	}

	public boolean getValor(int i, int j) {
		if(!matriz.containsKey(i)){
			return false;
		}
		return matriz.get(i).contains(j);
	}

	public void setValor(int i, int j) {
		agregarValor(i, j);
		agregarValor(j, i);
	}

	private void agregarValor(int i, int j) {
		if(!matriz.containsKey(i)){
			matriz.put(i, new ArrayList<Integer>());
		}
		matriz.get(i).add(j);
	}
	
	public ArrayList<Integer> getAdyacentes(int i){
		return matriz.containsKey(i) ? matriz.get(i) : new ArrayList<Integer>();
	}

	public int getOrdenDeMatriz() {
		return ordenDeMatriz;
	}

	public void setOrdenDeMatriz(int ordenDeMatriz) {
		this.ordenDeMatriz = ordenDeMatriz;
	}
}
