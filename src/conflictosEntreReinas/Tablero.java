package conflictosEntreReinas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Tablero {

	private int largo;
	private int ancho;
	ArrayList<Reina> reinas;
	
	public Tablero(String path) throws FileNotFoundException{
		int cont = 0;
		reinas = new ArrayList<Reina>();
		Scanner sc = new Scanner(new File(path));
		largo = sc.nextInt();
		ancho = sc.nextInt();
		while(sc.hasNext()){
			cont++;
			Reina reina = new Reina(cont, sc.nextInt(), sc.nextInt());
			reinas.add(reina);
		}
		sc.close();
	}
	
	public void conflictos(){

		for(Reina valor1 : reinas){
			int distanciaIzquierda=50001, distanciaDerecha=50001, distanciaArriba=10001, distanciaAbajo=10001, distanciaDiagonalPrincipalArriba=50001, distanciaDiagonalPrincipalAbajo=50001, distanciaDiagonalAntiPrincipalArriba=50001, distanciaDiagonalAntiPrincipalAbajo=50001, idDerecha=0, idIzquierda=0, idArriba=0, idAbajo=0, idDiagonalPrincipalArriba=0, idDiagonalPrincipalAbajo=0, idDiagonalAntiPrincipalArriba=0, idDiagonalAntiPrincipalAbajo=0;
			for(Reina valor2 : reinas){
				//verificarFilas(valor1, valor2, distanciaIzquierda, distanciaDerecha, idDerecha, idIzquierda);
				int valor=0;
				if(valor1.getFila() == valor2.getFila() && valor1 != valor2){
					valor = valor1.getColumna() - valor2.getColumna();
					if(valor > 0 && distanciaIzquierda > Math.abs(valor)){
						idIzquierda = valor2.getId();
						distanciaIzquierda = Math.abs(valor);
					}
					else if(valor < 0 && distanciaDerecha > Math.abs(valor)){
						idDerecha = valor2.getId();
						distanciaDerecha = Math.abs(valor);
					}
				}
				//verificarColumnas(valor1, valor2, distanciaArriba, distanciaAbajo, idArriba, idAbajo);
				if(valor1.getColumna() == valor2.getColumna() && valor1 != valor2){
					valor = valor1.getFila() - valor2.getFila();
					if(valor > 0 && distanciaArriba > Math.abs(valor)){
						idArriba = valor2.getId();
						distanciaArriba = Math.abs(valor);
					}
					else if(valor < 0 && distanciaAbajo > Math.abs(valor)){
						idAbajo = valor2.getId();
						distanciaAbajo = Math.abs(valor);
					}
				}
				//verificarParalelasDiagonalPrincipal(valor1, valor2, distanciaDiagonalPrincipalArriba, distanciaDiagonalPrincipalAbajo, idDiagonalPrincipalArriba, idDiagonalPrincipalAbajo);
				if(valor1.getFila()-valor2.getFila() == valor1.getColumna()-valor2.getColumna() && valor1 != valor2){
					valor = valor1.getFila()-valor2.getFila();
					if(valor > 0 && distanciaDiagonalPrincipalArriba > Math.abs(valor)){
						idDiagonalPrincipalArriba = valor2.getId();
						distanciaDiagonalPrincipalArriba = Math.abs(valor);
					}
					else if(valor < 0 && distanciaDiagonalPrincipalAbajo > Math.abs(valor)){
						idDiagonalPrincipalAbajo = valor2.getId();
						distanciaDiagonalPrincipalAbajo = Math.abs(valor);
					}
				}
				//verificarParalelasDiagonalAntiPrincipal(valor1, valor2, distanciaDiagonalAntiPrincipalArriba, distanciaDiagonalAntiPrincipalAbajo, idDiagonalAntiPrincipalArriba, idDiagonalAntiPrincipalAbajo);
				if(valor1.getFila()-valor2.getColumna() == valor2.getFila()-valor1.getColumna() && valor1 != valor2){
					valor = valor1.getFila()-valor2.getColumna();
					if(valor > 0 && distanciaDiagonalAntiPrincipalArriba > Math.abs(valor)){
						idDiagonalAntiPrincipalArriba = valor2.getId();
						distanciaDiagonalAntiPrincipalArriba = Math.abs(valor);
					}
					else if(valor < 0 && distanciaDiagonalAntiPrincipalAbajo > Math.abs(valor)){
						idDiagonalAntiPrincipalAbajo = valor2.getId();
						distanciaDiagonalAntiPrincipalAbajo = Math.abs(valor);
					}
					else if(valor==0&& valor1.getFila()>valor2.getFila()&& distanciaDiagonalAntiPrincipalArriba > Math.abs(valor)){
						idDiagonalAntiPrincipalArriba = valor2.getId();
						distanciaDiagonalAntiPrincipalArriba = Math.abs(valor);
					}
					else if(valor==0&& valor1.getFila()<valor2.getFila()&& distanciaDiagonalAntiPrincipalArriba > Math.abs(valor)){
						idDiagonalAntiPrincipalAbajo = valor2.getId();
						distanciaDiagonalAntiPrincipalAbajo = Math.abs(valor);
					}
				}
			}
			//verificarConflicto(valor1, idDerecha, idIzquierda, idArriba, idAbajo, idDiagonalPrincipalArriba, idDiagonalPrincipalAbajo, idDiagonalAntiPrincipalArriba, idDiagonalAntiPrincipalAbajo);
			if(idIzquierda!=0){
				valor1.getQueue().add(idIzquierda);
			}
			if(idDerecha!=0){
				valor1.getQueue().add(idDerecha);
			}
			if(idArriba!=0){
				valor1.getQueue().add(idArriba);
			}
			if(idAbajo!=0){
				valor1.getQueue().add(idAbajo);
			}
			if(idDiagonalPrincipalArriba!=0){
				valor1.getQueue().add(idDiagonalPrincipalArriba);
			}
			if(idDiagonalPrincipalAbajo!=0){
				valor1.getQueue().add(idDiagonalPrincipalAbajo);
			}
			if(idDiagonalAntiPrincipalArriba!=0){
				valor1.getQueue().add(idDiagonalAntiPrincipalArriba);
			}
			if(idDiagonalAntiPrincipalAbajo!=0){
				valor1.getQueue().add(idDiagonalAntiPrincipalAbajo);
			}
		}
	}
	/*
	private void verificarParalelasDiagonalPrincipal(Reina valor1, Reina valor2, int distanciaDiagonalPrincipalArriba, int distanciaDiagonalPrincipalAbajo, int idDiagonalPrincipalArriba, int idDiagonalPrincipalAbajo){
		
	}
	
	private void verificarParalelasDiagonalAntiPrincipal(Reina valor1, Reina valor2, int distanciaDiagonalAntiPrincipalArriba, int distanciaDiagonalAntiPrincipalAbajo, int idDiagonalAntiPrincipalArriba, int idDiagonalAntiPrincipalAbajo){
		
	}

	private void verificarFilas(Reina valor1, Reina valor2, int distanciaIzquierda, int distanciaDerecha, int idDerecha, int idIzquierda){
		
	}
	
	private void verificarColumnas(Reina valor1, Reina valor2, int distanciaArriba, int distanciaAbajo, int idArriba, int idAbajo){
		
	}
	
	private void verificarConflicto(Reina valor1, int idDerecha, int idIzquierda, int idArriba, int idAbajo, int idDiagonalPrincipalArriba, int idDiagonalPrincipalAbajo, int idDiagonalAntiPrincipalArriba, int idDiagonalAntiPrincipalAbajo) {
		
	}
	*/
	public void aArchivo(String path){
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter(path);
			pw = new PrintWriter(fichero);

			for(Reina reina : reinas){
				int tamaño=reina.getQueue().size();
				pw.print(tamaño+" ");
				if(tamaño!=0){
					for(int i=0; i<tamaño; i++){
						pw.print(reina.getQueue().poll()+" ");
					}
//					pw.print(reina.getQueue().poll()+" ");
				}
				pw.println();
			}
		} 
		catch (Exception e) {
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
	
	public static void main(String[] args) throws FileNotFoundException{
		Tablero tablero = new Tablero("G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\IN\\inConflictoEntreReinas\\romboDeConflictos.in");
		tablero.conflictos();
		tablero.aArchivo("G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\OUT\\outConflictoEntreReinas\\romboDeConflictos.out");
		
	}
}
