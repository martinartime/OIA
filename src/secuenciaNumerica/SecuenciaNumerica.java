package secuenciaNumerica;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SecuenciaNumerica {
	private int numeroInicial;
	private int numero;
	private int longitudMaxima;
	private int resultado;
	private int cantidadDePares;
	private int cantidadDeImpares;
	private int subsecuenciaMaxima;
	
	public SecuenciaNumerica(String path) throws IOException{
		Scanner sc = new Scanner(new File(path));
		numeroInicial = sc.nextInt();
		numero = numeroInicial;
		longitudMaxima = sc.nextInt();
		cantidadDePares=0;
		cantidadDeImpares=0;
		subsecuenciaMaxima=0;
		sc.close();
	}
	
	public void resolverSecuencia(){
		int contador=1;
		boolean ascenso=false;
		int subsecuencia=0;
		while(contador < longitudMaxima && numero != 1){
			contador++;
			if(numero%2==0){
				cantidadDePares++;
				numero/=2;
			}
			else{
				ascenso = true;
				cantidadDeImpares++;
				numero = numero*3 + 1;
			}
			if(ascenso){
				subsecuencia++;
				ascenso=false;
			}
			else if(numero%2==0){
				subsecuencia=0;
			}
			if(subsecuencia > subsecuenciaMaxima){
				subsecuenciaMaxima = subsecuencia;
			}
		}
		if(numero==1 && contador!=longitudMaxima){
			cantidadDeImpares++;
			resultado = contador;
		}
		else{
			if(numero%2==0){
				cantidadDePares++;
			}
			else{
				cantidadDeImpares++;
			}
			resultado = numero;
		}
	}
	
	public void aArchivo(String path) throws IOException{
		FileWriter fw = new FileWriter(new File(path));
		PrintWriter pw = new PrintWriter(fw);
		pw.println(numeroInicial+" "+longitudMaxima+" "+resultado+" "+cantidadDePares+" "+cantidadDeImpares+" "+subsecuenciaMaxima);
		pw.close();
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public int getCantidadDePares() {
		return cantidadDePares;
	}

	public void setCantidadDePares(int cantidadDePares) {
		this.cantidadDePares = cantidadDePares;
	}

	public int getCantidadDeImpares() {
		return cantidadDeImpares;
	}

	public void setCantidadDeImpares(int cantidadDeImpares) {
		this.cantidadDeImpares = cantidadDeImpares;
	}

	public int getSubsecuenciaMaxima() {
		return subsecuenciaMaxima;
	}

	public void setSubsecuenciaMaxima(int subsecuenciaMaxima) {
		this.subsecuenciaMaxima = subsecuenciaMaxima;
	}
}
