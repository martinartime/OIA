package depositosSubterraneos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Petrolera {
	private int cantidadDeDepositos;
	private int volumenTotal;
	private int litrosRebalsados;
	private float profundidadFinal;
	private ArrayList<Deposito> depositosActivos;
	private ArrayList<Deposito> depositos;
	
	
	public int getDepositosActivos() {
		return depositosActivos.size();
	}
	
	public int getLitrosRebalsados() {
		return litrosRebalsados;
	}

	public void setLitrosRebalsados(int litrosRebalsados) {
		this.litrosRebalsados = litrosRebalsados;
	}

	
	public Petrolera(String path) throws FileNotFoundException{
		litrosRebalsados = 0;
		profundidadFinal = 0;
		depositos = new ArrayList<Deposito>();
		depositosActivos = new ArrayList<Deposito>();
		Scanner sc = new Scanner(new File(path));
		cantidadDeDepositos = sc.nextInt();
		for(int i=0; i<cantidadDeDepositos; i++){
			depositos.add(new Deposito(sc.nextInt(), sc.nextInt()));
		}
		volumenTotal = sc.nextInt();
		sc.close();
	}
	
	public void calcularUsoDeDepositos(){
		int profundidadActual = depositos.get(0).getProfundidad();
		//int volumenMaximo = volumenTotal;
		int sumaDeSuperficies=0;
		if(!calcularSiRebalsa()){
			int i=0, diferenciaDeProfundidades=0;
			while(volumenTotal > 0){
				while(i < depositos.size() && profundidadActual == depositos.get(i).getProfundidad()){
					depositosActivos.add(depositos.get(i));
					i++;
				}
				int proximaProfundidad;
				if(i == cantidadDeDepositos){
					proximaProfundidad=0;
				}
				else{
					proximaProfundidad = depositos.get(i).getProfundidad();
				}
				diferenciaDeProfundidades =  profundidadActual - proximaProfundidad;
				if(calcularSiSeTerminaElPetroleo(diferenciaDeProfundidades)){
					for(Deposito deposito : depositosActivos){
						sumaDeSuperficies += deposito.getSuperficie();
					}
					profundidadFinal =(float)volumenTotal / sumaDeSuperficies;
					volumenTotal = 0;
				}
				else{
					for(Deposito deposito : depositosActivos){
						volumenTotal -= diferenciaDeProfundidades * deposito.getSuperficie();
						deposito.sumarLiquido(diferenciaDeProfundidades);
						
					}
					profundidadActual = proximaProfundidad;
				}
			}
		}
	}
	
	public void aArchivo(String path){
		FileWriter fichero = null;
		PrintWriter pw = null;
		try{
			fichero = new FileWriter(path);
			pw = new PrintWriter(fichero);

			if(litrosRebalsados > 0){
				pw.println("Rebasan: "+litrosRebalsados);
			}
			else{
				pw.println(depositosActivos.size());
				float distancia=(depositosActivos.get(0).getProfundidad() - depositosActivos.get(0).getCantidadDeLiquidoActual() - profundidadFinal);
				pw.println((int)distancia);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				if (null != fichero)
					fichero.close();
			} 
			catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	private boolean calcularSiRebalsa() {
		int capacidadTotal=0;
		for(Deposito deposito : depositos){
			capacidadTotal += deposito.getVolumen();
		}
		if(capacidadTotal < volumenTotal){
			litrosRebalsados = volumenTotal - capacidadTotal;
			return true;
		}
		return false;
	}
	
	private boolean calcularSiSeTerminaElPetroleo(int diferenciaDeProfundidades) {
		int capacidadTotal=0;
		for(Deposito deposito : depositosActivos){
			capacidadTotal += deposito.getSuperficie() * diferenciaDeProfundidades;
		}
		return capacidadTotal > volumenTotal;
	}
}
