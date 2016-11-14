package noSePuedeVivirAhi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EstacionMeteorologica {
	ArrayList<Lugar> lugares;
	int cantidadDeLugares;
	int nivelDeHostilidadMaximo;
	
	public EstacionMeteorologica(String path) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(path));
		cantidadDeLugares = sc.nextInt();
		lugares=new ArrayList<Lugar>();
		for(int i=0; i<cantidadDeLugares; i++){
			ArrayList<Integer> temperaturas = null;
			int cantidadDeMediciones = sc.nextInt();
			temperaturas = new ArrayList<>();
			for(int j=0;j<cantidadDeMediciones;j++){
				temperaturas.add(sc.nextInt());
				temperaturas.add(sc.nextInt());
			}
			lugares.add(new Lugar(temperaturas, i+1));
		}
		sc.close();
	}
	
	public void contabilizarLugares(){
		for(Lugar lugar : lugares){
			for(Lugar lugarAComparar : lugares){
				
				if(lugar!=lugarAComparar){
					if(lugar.masHostilQue(lugarAComparar)){
						lugar.sumarHostilidad();
					}
					else if(lugar.empate(lugarAComparar)){
						lugar.sumarEmpate();
					}
					else if(lugar.noComparable(lugarAComparar)){
						lugar.sumarNoComparable();
					}
				}
			}
		}
	}
	
	public void buscarMasHostil(){
		contabilizarLugares();
		Lugar lugarMaximo = Collections.max(lugares);
		nivelDeHostilidadMaximo = lugarMaximo.getNivelDeHostilidad();
	}
	
	public void aArchivo(String path) throws IOException{
		FileWriter fc = new FileWriter(new File(path));
		PrintWriter pw = new PrintWriter(fc);
		if(nivelDeHostilidadMaximo == 0){
			pw.println("No hay maximo");
			pw.close();
			return;
		}
		for(Lugar lugar : lugares){
			if(lugar.MasHostil(nivelDeHostilidadMaximo)){
				pw.println(lugar.getNumero()+" "+lugar.getCantidadDeNoComparables());
			}
		}
		fc.close();
	}
}
