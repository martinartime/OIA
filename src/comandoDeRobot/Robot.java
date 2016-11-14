package comandoDeRobot;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Robot {
	
	private int fila;
	private int columna;
	private Cuadricula cuadricula;
	private String ordenes;
	
	public Robot(String path) throws IOException{
		Scanner sc = new Scanner(new File(path));
		fila= sc.nextInt();
		columna=sc.nextInt();
		cuadricula = new Cuadricula(sc.nextInt(),sc.nextInt());
		sc.nextLine();
		ordenes=sc.nextLine();
		sc.close();
	}
	
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getColumna() {
		return columna;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}
	
	public void mover(){
		for(int i=0;i<ordenes.length();i++){
			char orden = ordenes.charAt(i);
			if(orden=='N'&& !cuadricula.estaEnElLimiteNorte(fila)){
				fila++;
			}
			if(orden=='S'&& !cuadricula.estaEnElLimiteSur(fila)){
				fila--;
			}
			if(orden=='E'&& !cuadricula.estaEnElLimiteEste(columna)){
				columna++;
			}
			if(orden=='O'&& !cuadricula.estaEnElLimiteOeste(columna)){
				columna--;
			}
		}
	}
	
	public void aArchivo(String path) throws IOException{
		FileWriter fw=new FileWriter(new File(path));
		PrintWriter pw = new PrintWriter(fw);
		
		pw.print(fila + " " + columna);
		
		fw.close();
	}
	
}
