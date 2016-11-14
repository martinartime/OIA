package unMuralEnElPatioDeLaEscuela;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Mural {

	private char [][]mural;
	private ArrayList<Pincelada> horizontal;
	private ArrayList<Pincelada> vertical;
	
	public Mural(String path) throws IOException{
		Scanner sc = new Scanner(new File(path));
		int dimensionMural = sc.nextInt();
		int cantidadPintadasHorizontal=sc.nextInt();
		int cantidadPintadasVertical=sc.nextInt();
		mural = new char[dimensionMural][dimensionMural];
		for(int i=0;i<mural.length;i++){
			for(int j=0;j<mural.length;j++){
				mural[i][j] = '.';
			}
		}
		horizontal = new ArrayList<>();
		for(int i=0;i<cantidadPintadasHorizontal;i++){
			horizontal.add(new Pincelada(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt()));
		}
		vertical = new ArrayList<>();
		for(int i=0;i<cantidadPintadasVertical;i++){
			vertical.add(new Pincelada(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt()));
		}
		sc.close();
	}
	
	public boolean estaPintado(int i, int j){
		return mural[i][j] != '.';
	}
	
	public void pintarMural(){
		pintarHorizontal();
		pintarVertical();
	}

	private void pintarHorizontal() {
		for(Pincelada pincelada : horizontal){
			for(int i=pincelada.getInicio()-1;i<pincelada.getFin();i++){
				if(!estaPintado(pincelada.getHilera(),i)){
					mural[pincelada.getHilera()][i] = pincelada.getColor();
				}
				else{
					char color = mural[pincelada.getHilera()][i];
					char colorPincelada = pincelada.getColor();
					if(!pincelada.esMiColor(color)){
						if((colorPincelada == 'R' && color == 'A') || (colorPincelada == 'A' && color == 'R')){
							mural[pincelada.getHilera()][i] = 'N';
						}
						else if((colorPincelada == 'R' && color == 'Z') || (colorPincelada == 'Z' && color == 'R')){
							mural[pincelada.getHilera()][i] = 'P';
						}
						else if((colorPincelada == 'Z' && color == 'A') || (colorPincelada == 'A' && color == 'Z')){
							mural[pincelada.getHilera()][i] = 'V';
						}
					}
				}
			}
		}
	}
	
	private void pintarVertical() {
		for(Pincelada pincelada : vertical){
			for(int i=pincelada.getInicio()-1;i<pincelada.getFin();i++){
				if(!estaPintado(i,pincelada.getHilera())){
					mural[i][pincelada.getHilera()] = pincelada.getColor();
				}
				else{
					char color = mural[i][pincelada.getHilera()];
					char colorPincelada = pincelada.getColor();
					if(!pincelada.esMiColor(color)){
						if((colorPincelada == 'R' && color == 'A') || (colorPincelada == 'A' && color == 'R')){
							mural[i][pincelada.getHilera()] = 'N';
						}
						else if((colorPincelada == 'R' && color == 'Z') || (colorPincelada == 'Z' && color == 'R')){
							mural[i][pincelada.getHilera()] = 'P';
						}
						else if((colorPincelada == 'Z' && color == 'A') || (colorPincelada == 'A' && color == 'Z')){
							mural[i][pincelada.getHilera()] = 'V';
						}
					}
				}
			}
		}
	}
	
	public void aArchivo(String path) throws IOException{
		FileWriter fw = new FileWriter(new File(path));
		PrintWriter pw = new PrintWriter(fw);
		for(int i=0;i<mural.length;i++){
			for(int j=0;j<mural.length;j++){
				pw.print(mural[i][j]);
			}
			pw.println();
		}
		fw.close();
	}
}
