package vagonesDeTren;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class VagonesMinimos {

	private Especie[] especies;
	private int agresividadMaxima;
	private Tren tren;
	
	public VagonesMinimos(String path) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(path));
		especies = new Especie[sc.nextInt()];
		agresividadMaxima = sc.nextInt();
		sc.nextLine();
//		sc.useDelimiter(" ");
		for(int i=0; i<especies.length; i++){
			String prueba=sc.next();
			
			especies[i] = new Especie(prueba, sc.nextInt(), sc.nextInt());
			
		}
		sc.close();
		tren = new Tren();
	}
	
	private void ordenarEspeciesSegunAgresividad(){
		Arrays.sort(especies);
	}
	
	public void calcularVagonesMinimos(){
		int flag=0;
		
		ordenarEspeciesSegunAgresividad();
		Vagon vagon1 = new Vagon();
		vagon1.add(especies[0]);
		tren.add(vagon1);
		for(int i=1; i<especies.length; i++){
			for(Vagon vagon: tren.getVagones()){
				if(especies[i].getAgresividad() > vagon.getAgresividadMaxima()){
					if(especies[i].getAgresividad() - vagon.getAgresividadMinima() <= agresividadMaxima - tren.getAgresividadTotal()+vagon.getAgresividad()){
						vagon.add(especies[i]);
						tren.calcularAgresividadTotal();
						flag=1;
					}
				}
				else{
					if(especies[i].getAgresividad() < vagon.getAgresividadMinima()){
						if(vagon.getAgresividadMaxima() - especies[i].getAgresividad() <= agresividadMaxima - tren.getAgresividadTotal()){
							vagon.add(especies[i]);
//							tren.calcularAgresividadTotal();
							flag=1;
						}
					}
					else{
						vagon.add(especies[i]);
						flag=1;
					}
				}
			}
			if(flag==0){
				Vagon vagon2 = new Vagon();
				vagon2.add(especies[i]);
				tren.add(vagon2);
//				tren.calcularAgresividadTotal();
			}
			else{				
				flag=0;
			}
		}
		tren.calcularAgresividadTotal();
	}
	
	
	public void aArchivo(String path) throws IOException{
		FileWriter fw= new FileWriter(new File(path));
		PrintWriter pw= new PrintWriter(fw);
		
		pw.print(tren.getSize() + " " + tren.getAgresividadTotal());

		fw.close();
	}
}
