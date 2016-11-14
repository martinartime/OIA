package juegoConLetras;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SopaDeLetras {

	private String []palabras;
	private char [][]sopa;
	private int cantidadDePalabras;
	private int dimensionDeSopa;
	private char []salida;
	private String []horizontal;
	private String []vertical;
	
	public SopaDeLetras(String path) throws IOException{
		Scanner scanner = new Scanner(new File(path));
		dimensionDeSopa = scanner.nextInt();
		cantidadDePalabras = scanner.nextInt();
		sopa = new char[dimensionDeSopa][dimensionDeSopa];
		palabras = new String[cantidadDePalabras];
		salida = new char[cantidadDePalabras];
		horizontal = new String[dimensionDeSopa];
		vertical = new String[dimensionDeSopa];
		scanner.nextLine();
		for(int i=0; i<dimensionDeSopa; i++){
			horizontal[i] = scanner.nextLine();
			sopa[i] = horizontal[i].toCharArray();
		}
		for(int j=0;j<cantidadDePalabras; j++){
			palabras[j] = scanner.nextLine();
		}
		pasarAVertical();//Complejidad 'D^2'
		scanner.close();
	}//Complejidad 'P' o 'D^2' (es 10000 en ambos casos)
	
	
	private void pasarAVertical() {
		for(int i=0; i<dimensionDeSopa; i++){
			vertical[i]="";
			for(int j=0; j<dimensionDeSopa; j++){
				vertical[i] += String.valueOf(sopa[j][i]);
			}
		}
	}

	public void buscarPalabras(){
		for(int i=0; i<cantidadDePalabras; i++){
			salida[i] = buscarHorizontal(palabras[i]);//Complejidad 'D'
			if(salida[i] == '.'){
				salida[i] = buscarVertical(palabras[i]);//Complejidad 'D'
			}
		}
	}//Complejidad 'P*D'

	private char buscarHorizontal(String palabra) {
		for(int i=0; i<dimensionDeSopa; i++){
			if(horizontal[i].contains(palabra)){
				return 'E';
			}
			String fila = new StringBuffer(horizontal[i]).reverse().toString();
			if(fila.contains(palabra)){
				return 'O';
			}
		}
		return '.';
	}
	
	private char buscarVertical(String palabra) {
		for(int i=0; i<dimensionDeSopa; i++){
			if(vertical[i].contains(palabra)){
				return 'S';
			}
			String fila = new StringBuffer(vertical[i]).reverse().toString();
			if(fila.contains(palabra)){
				return 'N';
			}
		}
		return '.';
	}
	
	public void aArchivo(String path) throws IOException{
		PrintWriter printWriter = new PrintWriter(new FileWriter(new File(path)));
		for(int i=0; i<salida.length;i++){
			if(salida[i]!='.'){
				printWriter.println((i+1)+" "+salida[i]);
			}
		}
		printWriter.close();
	}
}
