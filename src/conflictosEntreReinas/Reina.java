package conflictosEntreReinas;

import java.util.PriorityQueue;

public class Reina implements Comparable{

	private int id;
	private int fila;
	private int columna;
	private PriorityQueue<Integer> queue;
	
	public Reina(int id, int fila, int columna){
		this.setId(id);
		this.fila = fila;
		this.columna = columna;
		queue = new PriorityQueue<Integer>();
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	@Override
	public int compareTo(Object arg0) {
		if(this.id < ((Reina)arg0).id){
			return 1;
		}
		else if(this.id > ((Reina)arg0).id){
			return -1;
		}
		else{
			return 0;
		}
	}

	public PriorityQueue<Integer> getQueue() {
		return queue;
	}

	public void setQueue(PriorityQueue<Integer> queue) {
		this.queue = queue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
