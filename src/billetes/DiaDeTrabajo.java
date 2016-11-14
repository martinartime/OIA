package billetes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;

public class DiaDeTrabajo {
	private Cajero cajero;
	private Pago[] pagos;
	
	public DiaDeTrabajo(String path) throws IOException{
		HashMap<Integer,Integer> billetesCajero=new HashMap<Integer,Integer>();
		Scanner sc = new Scanner(new File(path));
		
			billetesCajero.put(100,sc.nextInt());
			billetesCajero.put(50,sc.nextInt());
			billetesCajero.put(25,sc.nextInt());
			billetesCajero.put(10,sc.nextInt());
			billetesCajero.put(5,sc.nextInt());
			billetesCajero.put(2,sc.nextInt());
			billetesCajero.put(1,sc.nextInt());
			
		cajero=new Cajero(billetesCajero);
		
		pagos=new Pago[sc.nextInt()];
		for(int i=0;i<pagos.length;i++){
			int monto=sc.nextInt();
			HashMap<Integer,Integer>  billetesPago=new HashMap<Integer,Integer>();
			billetesPago.put(100,sc.nextInt());
			billetesPago.put(50,sc.nextInt());
			billetesPago.put(25,sc.nextInt());
			billetesPago.put(10,sc.nextInt());
			billetesPago.put(5,sc.nextInt());
			billetesPago.put(2,sc.nextInt());
			billetesPago.put(1,sc.nextInt());
			pagos[i]=new Pago(monto,billetesPago);
		}
		
		sc.close();
	}
	
	
	public void procesarPagos(){

		for(int i=0;i<pagos.length;i++){
			if(pagos[i].comprobarValidez()){
				pagos[i].calcularVuelto();
				int vuelto = pagos[i].getVuelto();
				int valor = calcularBilleteMaximo(vuelto);
				while(vuelto!=0){
					int cantidad=calcularCuantosBilletesNecesito(vuelto,valor);
					if(cajero.alcanzaParaVuelto(cantidad,valor)){
						pagos[i].getBilletesVuelto().put(valor, cantidad);
						vuelto-=valor*cantidad;
						valor = calcularBilleteMaximo(vuelto);
					}
					else{
						valor=calcularProximoValor(valor);
						if(valor==0){
							pagos[i].setResultado("PRFC");
							vuelto=0;
						}
					}
					
				}
				if(pagos[i].alcanzaVuelto()){
					cajero.sumarBilletes(pagos[i].getBilletes());
					cajero.restarBilletes(pagos[i].getBilletesVuelto());
					pagos[i].setResultado("OK");					
				}
				else{
					pagos[i].setResultado("PRFC");
				}
			}
			else{
				pagos[i].setResultado("PRI");
			}
		}
	}


	private int calcularProximoValor(int valor) {
		if(valor==100){
			return 50;
		}
		else if(valor==50){
			return 25;
		}
		else if(valor==25){
			return 10;
		}
		else if(valor==10){
			return 5;
		}
		else if(valor==5){
			return 2;
		}
		else if(valor==2){
			return 1;
		}
		else return 0;
			
	}


	private int calcularCuantosBilletesNecesito(int vuelto, int valor) {
				return vuelto/valor;
	}


	private int calcularBilleteMaximo(int vuelto) {
	
		if(vuelto>=100){
			return 100;
		}
		else if(vuelto>=50){
			return 50;
		}
		else if(vuelto>=25){
			return 25;
		}
		else if(vuelto>=10){
			return 10;
		}
		else if(vuelto>=5){
			return 5;
		}
		else if(vuelto>=2){
			return 2;
		}
		else if(vuelto>=1){
			return 1;
		}
		else return 0;
			
	}
	
	public void aArchivo(String path) throws IOException{
		FileWriter fw=new FileWriter(new File(path));
		PrintWriter pw = new PrintWriter(fw);
		for(int i =0; i<pagos.length;i++){
			
			if(pagos[i].getResultado().equals("OK")){
				
				pw.println(pagos[i].getBilletesVuelto().get(100)+" 	"+pagos[i].getBilletesVuelto().get(50)+" 	"+pagos[i].getBilletesVuelto().get(25)+" 	"+pagos[i].getBilletesVuelto().get(10)+" 	"+pagos[i].getBilletesVuelto().get(5)+" 	"+pagos[i].getBilletesVuelto().get(2)+" 	"+pagos[i].getBilletesVuelto().get(1));
			}
			else{
				pw.println(pagos[i].getResultado());
			}
		}
		pw.println(cajero.getBilletes().get(100)+" 	"+cajero.getBilletes().get(50)+" 	"+cajero.getBilletes().get(25)+" 	"+cajero.getBilletes().get(10)+" 	"+cajero.getBilletes().get(5)+" 	"+cajero.getBilletes().get(2)+" 	"+cajero.getBilletes().get(1));
		fw.close();
	}
}
