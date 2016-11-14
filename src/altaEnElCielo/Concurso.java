package altaEnElCielo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Concurso {
	private Carretel carretel;
	private Escuela[] escuelas;
	private int maximaSubsecuencia;
	private int escuelaMaxima1;
	private int escuelaMaxima2;

	public Concurso(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));
		carretel = Carretel.getInstance();
		carretel.setLongitud(sc.nextInt());
		escuelas = new Escuela[sc.nextInt()];
		for (int i = 0; i < escuelas.length; i++) {
			escuelas[i] = new Escuela(i + 1, sc.nextInt());
		}
		maximaSubsecuencia = 0;
		escuelaMaxima1 = 0;
		escuelaMaxima2 = 0;
		sc.close();
	}

	public Carretel getCarretel() {
		return carretel;
	}

	public void setCarretel(Carretel carretel) {
		this.carretel = carretel;
	}

	public Escuela[] getEscuelas() {
		return escuelas;
	}

	public void setEscuelas(Escuela[] escuelas) {
		this.escuelas = escuelas;
	}

	public int getMaximaSubsecuencia() {
		return maximaSubsecuencia;
	}

	public void setMaximaSubsecuencia(int maximaSubsecuencia) {
		this.maximaSubsecuencia = maximaSubsecuencia;
	}

	public int getEscuelaMaxima1() {
		return escuelaMaxima1;
	}

	public void setEscuelaMaxima1(int escuelaMaxima1) {
		this.escuelaMaxima1 = escuelaMaxima1;
	}

	public int getEscuelaMaxima2() {
		return escuelaMaxima2;
	}

	public void setEscuelaMaxima2(int escuelaMaxima2) {
		this.escuelaMaxima2 = escuelaMaxima2;
	}

	public void oia() {
		int flag = 1;
		while (flag != 0) {
			flag = 0;
			for (int i = 0; i < escuelas.length; i++) {
				if (escuelas[i].pedir(carretel)) {
					flag = 1;
				}
			}
		}
	}

	public void determinarMaximaSubsecuencia() {
		for (int i = 0; i < escuelas.length - 1; i++) {
			for (int j = i+1; j < escuelas.length; j++) {
				int z = 0;
				for (int valor : escuelas[i].getBandera().getTamañosParciales()) {
					for (int valor2 : escuelas[j].getBandera().getTamañosParciales()) {
						if (valor == valor2) {
							z++;
						}
					}
				}
				if (z > maximaSubsecuencia) {
					maximaSubsecuencia = z;
					escuelaMaxima1 = escuelas[i].getId();
					escuelaMaxima2 = escuelas[j].getId();
				}
			}
		}
	}
/*
	public void guardarResultado(String path){
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter(path);
			pw = new PrintWriter(fichero);

			for(int i=0; i<)
			pw.println();
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
*/
	public static void main(String[] args) throws FileNotFoundException {
		Concurso concurso = new Concurso("G:\\UNLaM\\Programacion-Avanzada\\GitKraken - Workspace\\OIA\\IN\\inAltaEnElCielo\\subsecuenciasNoReconocida.in");
		concurso.oia();
		concurso.determinarMaximaSubsecuencia();
		for (int i = 0; i < concurso.getEscuelas().length; i++) {
			System.out.println("ID: "+concurso.getEscuelas()[i].getId());
			System.out.println("CantCortes: "+ concurso.getEscuelas()[i].getBandera().getCortes());
			System.out.println("LongBandera: "+concurso.getEscuelas()[i].getBandera().getLongitud());
		}
		System.out.println("MaxSubSec: "+concurso.getMaximaSubsecuencia());
		System.out.println("EscuelaMax1: "+concurso.getEscuelaMaxima1());
		System.out.println("EscuelaMax2: "+concurso.getEscuelaMaxima2());
		System.out.println("CarretelSobra: "+concurso.getCarretel().getLongitud());
	}
}
