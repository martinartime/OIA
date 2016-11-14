package billetes;

import java.util.HashMap;
import java.util.Iterator;

public class Cajero {

	private HashMap<Integer,Integer> billetes;
	
	public Cajero(HashMap<Integer,Integer>billetes){
		this.setBilletes(billetes);
	}

	public HashMap<Integer, Integer> getBilletes() {
		return billetes;
	}

	private void setBilletes(HashMap<Integer, Integer> billetes2) {
		this.billetes=billetes2;
		
	}

	public boolean alcanzaParaVuelto(int cantidad, int valor) {
		return cantidad<=billetes.get(valor);
	}

	public void sumarBilletes(HashMap<Integer, Integer> billetes2) {
		Iterator<Integer> it = billetes2.keySet().iterator();
		while(it.hasNext()){
			int valor = it.next();
			int cantidadNueva=billetes.get(valor)+billetes2.get(valor);
		    billetes.put(valor, cantidadNueva);
		}
	}

	public void restarBilletes(HashMap<Integer, Integer> billetesVuelto) {
		Iterator<Integer> it = billetesVuelto.keySet().iterator();
		while(it.hasNext()){
			int valor = it.next();
			int cantidadNueva=billetes.get(valor)-billetesVuelto.get(valor);
		    billetes.put(valor, cantidadNueva);
		}
	}

	

}
