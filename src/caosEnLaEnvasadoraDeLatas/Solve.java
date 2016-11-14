package caosEnLaEnvasadoraDeLatas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Solve {
	String etiquetas;
	int cantMax;
	int posicionInicialMax;
	int cantSegMax;
	int posicionInicialSegMax;
	int separacion;
	public Solve(String path) throws FileNotFoundException{
		Scanner sc = new Scanner(new File(path));
		etiquetas=sc.nextLine();
		sc.close();
		cantMax=0;
		posicionInicialMax=0;
		cantSegMax=0;
		posicionInicialSegMax=0;
		separacion=0;
	}
	
	public int resolver(){
		buscarMaximaCadena();
		buscarSegundaMaxima();
		buscarSeparacion();
		return cantMax;
	}

	private void buscarSeparacion() {
		if(cantSegMax==0){
			separacion=0;
			return;
		}
		if(posicionInicialMax<posicionInicialSegMax){
			separacion=posicionInicialSegMax-posicionInicialMax-cantMax;			
		}
		else{
			separacion=posicionInicialMax-posicionInicialSegMax-cantSegMax;	
		}
		
	}

	private void buscarSegundaMaxima() {
		
		int cantidad=0,posicionCadena=0;
		for(int i=0;i<etiquetas.length();i++){
			cantidad=0;
			 posicionCadena = i;
				while(etiquetas.charAt(i)=='G'){
					cantidad++;
					i++;
				}
				if(cantidad>cantSegMax&&posicionCadena!=posicionInicialMax){
					cantSegMax=cantidad;
					posicionInicialSegMax=posicionCadena;
				}
	
		}
	}

	private void buscarMaximaCadena() {
		int cantidad=0,posicionCadena=0;
		for(int i=0;i<etiquetas.length();i++){
			  cantidad=0;
			 posicionCadena = i;
				while(etiquetas.charAt(i)=='G'){
					cantidad++;
					i++;
				}
				if(cantidad>cantMax){
					cantMax=cantidad;
					posicionInicialMax=posicionCadena;
				}	
				
					
				
		}
	}
	
	public void aArchivo(String path) throws IOException{
		FileWriter fw=new FileWriter(new File(path));
		PrintWriter pw=new PrintWriter(fw);
		
		pw.println(etiquetas.length()-1);
		pw.println(cantMax);
		pw.println(cantSegMax);
		pw.println(separacion);
		fw.close();
	}
}
