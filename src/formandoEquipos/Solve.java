package formandoEquipos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Solve {
	private String[] respuestas;
	private int cantidadDeLetras;
	private int cantidadDeLetrasMax;
	private int cantidadDeColaboradores;
	private int afinidad;
	private int posicionInicialColaborador;
	private String subCadenaMax;
	
	public Solve(String path) throws FileNotFoundException{
		cantidadDeColaboradores = 0;
		cantidadDeLetrasMax = 0;
		posicionInicialColaborador = 0;
		Scanner sc = new Scanner(new File(path));
		cantidadDeLetras = sc.nextInt();
		respuestas = new String[sc.nextInt()];
		sc.nextLine();
		for(int i=0;i<respuestas.length;i++){
			respuestas[i] = sc.nextLine();
		}
		sc.close();
	}

	public String[] getRespuestas() {
		return respuestas;
	}

	public void setRespuestas(String[] respuestas) {
		this.respuestas = respuestas;
	}

	public int getCantidadDeLetras() {
		return cantidadDeLetras;
	}

	public void setCantidadDeLetras(int cantidadDeLetras) {
		this.cantidadDeLetras = cantidadDeLetras;
	}

	public int getCantidadDeLetrasMax() {
		return cantidadDeLetrasMax;
	}

	public void setCantidadDeLetrasMax(int cantidadDeLetrasMax) {
		this.cantidadDeLetrasMax = cantidadDeLetrasMax;
	}

	public int getCantidadDeColaboradores() {
		return cantidadDeColaboradores;
	}

	public void setCantidadDeColaboradores(int cantidadDeColaboradores) {
		this.cantidadDeColaboradores = cantidadDeColaboradores;
	}

	public int getPosicionInicialColaborador() {
		return posicionInicialColaborador;
	}

	public void setPosicionInicialColaborador(int posicionInicialColaborador) {
		this.posicionInicialColaborador = posicionInicialColaborador;
	}
	
	public int resolver(){
		int coincidencias=0;
		Arrays.sort(respuestas);
		for(int i=0; i<respuestas.length-1;i++){
			coincidencias = compararRespuestas(respuestas[i], respuestas[i+1]);
			if(cantidadDeLetrasMax < coincidencias){
				cantidadDeLetrasMax = coincidencias;
				posicionInicialColaborador = i;
				cantidadDeColaboradores = 2;
				subCadenaMax = respuestas[i].substring(0, coincidencias);
			}
			else if(coincidencias != 0 && cantidadDeLetrasMax == coincidencias && subCadenaMax.equals(respuestas[i+1].substring(0, coincidencias))){
				cantidadDeColaboradores++;
			}
			if(cantidadDeLetrasMax > coincidencias && cantidadDeLetrasMax == cantidadDeLetras){
				calcularAfinidad();
				return afinidad;
			}
		}
		calcularAfinidad();
		return afinidad;
	}

	public int compararRespuestas(String cadena1, String cadena2){
		int index=0;
		while(index < cantidadDeLetras && cadena1.charAt(index) == cadena2.charAt(index)){
			index++;
		}
		return index; 
	}

	public void calcularAfinidad(){
		afinidad = (int) ((int)cantidadDeColaboradores * Math.pow(cantidadDeLetrasMax, 2));
	}

	public void aArchivo(String path){
		FileWriter fichero = null;
		PrintWriter pw = null;
		try{
			fichero = new FileWriter(path);
			pw = new PrintWriter(fichero);

			pw.println(afinidad);
			pw.println(respuestas[posicionInicialColaborador].substring(0, cantidadDeLetrasMax));
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
}
