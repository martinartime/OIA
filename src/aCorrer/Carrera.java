package aCorrer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrera {

	private List<Categoria> categorias;
	private List<Integer> corredoresQueFinalizan;
	
	public Carrera(String path) throws FileNotFoundException{
		Scanner sc=new Scanner(new File(path));
		categorias= new ArrayList<>();
		corredoresQueFinalizan= new ArrayList<>();
		int cantidadidadCorredores=sc.nextInt(),cantidadCategoriasFemeninas=sc.nextInt(),cantidadCategoriasMasculinas=sc.nextInt();
		int cantidadCorredoresQueFinalizan=sc.nextInt();
		int numeroCategoria=1;
		
		for(int i=0;i<cantidadCategoriasFemeninas;i++){
			categorias.add(new Categoria(numeroCategoria++,sc.nextInt(),sc.nextInt(),"F"));
		}
		numeroCategoria=1;
		for(int i=0;i<cantidadCategoriasMasculinas;i++){
			categorias.add(new Categoria(numeroCategoria++,sc.nextInt(),sc.nextInt(),"M"));
		}
		
		for(int i=0;i<cantidadidadCorredores;i++){
			int edad=sc.nextInt();
			String sexo=sc.nextLine().substring(1,2);
			Corredor corredor = new Corredor(i+1,sexo,edad);
			int flag=0;
				for(Categoria categoria:categorias){
					if(flag==0&&categoria.comprobarSiEntra(corredor)){
						categoria.add(corredor);
						flag=1;
					}
				}
		}
		
		for(int i=0;i<cantidadCorredoresQueFinalizan;i++){
			corredoresQueFinalizan.add(sc.nextInt());
		}
		
		sc.close();
	}
	
	public void correr(){
		for(int corredorQueFinalizo:corredoresQueFinalizan){
			for(Categoria categoria:categorias){
					if(categoria.cantidadDeLlegadas()<3 && categoria.buscar(corredorQueFinalizo)){
						categoria.addGanador(corredorQueFinalizo);
					}
			}
		}
	}
	
	public void aArchivo(String path) throws IOException{
			FileWriter fw = new FileWriter(new File(path));
			PrintWriter pw=new PrintWriter(fw);
			
			for(Categoria categoria:categorias){
				pw.print(categoria.getNumero()+" ");
				for(int i=0;i<3;i++){
					pw.print(categoria.obtenerGanador(i)+" ");
				}
				pw.println();
			}
			fw.close();
	}
}
