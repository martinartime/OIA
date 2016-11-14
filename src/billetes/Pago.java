package billetes;

import java.util.HashMap;
import java.util.Iterator;

public class Pago {

	private int monto;
	private  HashMap<Integer,Integer> billetesPago;
	private String resultado;
	private int suma;
	private int vuelto;
	private HashMap<Integer,Integer> billetesVuelto;
	
	public Pago(int monto, HashMap<Integer,Integer>billetes){
		this.monto=monto;
		this.billetesPago=billetes;
		suma=0;
		setVuelto(0);
		
		billetesVuelto=new HashMap<Integer,Integer>();
		billetesVuelto.put(100,0);
		billetesVuelto.put(50,0);
		billetesVuelto.put(25,0);
		billetesVuelto.put(10,0);
		billetesVuelto.put(5,0);
		billetesVuelto.put(2,0);
		billetesVuelto.put(1,0);
		
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	public HashMap<Integer,Integer> getBilletes() {
		return billetesPago;
	}
	public void setBilletes(HashMap<Integer,Integer>billetes) {
		this.billetesPago = billetes;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public boolean comprobarValidez() {
		Iterator<Integer> it= billetesPago.keySet().iterator();
		while(it.hasNext()){
			int valor=(int) it.next();
			suma+=valor*billetesPago.get(valor);
		}	
		return suma>monto;
		
	}
	public void calcularVuelto(){
		setVuelto(suma-monto);
	}
	public int getVuelto() {
		return vuelto;
	}
	public void setVuelto(int vuelto) {
		this.vuelto = vuelto;
	}
	public HashMap<Integer, Integer> getBilletesVuelto() {
		return billetesVuelto;
	}
	public void setBilletesVuelto(HashMap<Integer, Integer> billetesVuelto) {
		this.billetesVuelto = billetesVuelto;
	}
	public boolean alcanzaVuelto() {
		Iterator<Integer> it= billetesVuelto.keySet().iterator();
		int sum=0;
		while(it.hasNext()){
			int valor=(int) it.next();
			sum+=valor*billetesVuelto.get(valor);
		}	
		
		return sum==vuelto;
	}
	
}
