package palabrasExtremas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class PalabrasExtremas {

	private String[] palabras;
	private Hashtable<Character, Integer> ht;

	public PalabrasExtremas(String path) throws IOException {
		File archivo = null;
		FileReader reader = null;
		BufferedReader buffer = null;

		archivo = new File(path);
		reader = new FileReader(archivo);
		buffer = new BufferedReader(reader);

		String linea = buffer.readLine();
		if (linea != null) {
			palabras = new String[Integer.parseInt(linea)];
			for (int i = 0; i < palabras.length; i++) {
				palabras[i] = buffer.readLine();
			}
		}
		reader.close();
	}

	public String[] getPalabras() {
		return palabras;
	}

	public void setPalabras(String[] palabras) {
		this.palabras = palabras;
	}

	public void contarLetras() throws IOException {
		ht = new Hashtable<Character, Integer>();
		int value=0;
		for (int i = 0; i < palabras.length; i++) {
			char primera = palabras[i].charAt(0);
			char ultima = palabras[i].charAt(palabras[i].length() - 1);
			if (ht.containsKey(primera)){
				value = ht.get(primera);
				value++;
				ht.remove(primera);
				ht.put(primera, value);
			}
			else
				ht.put(primera, 1);
			if (ht.containsKey(ultima)){
				value = ht.get(ultima);
				value++;
				ht.remove(ultima);
				ht.put(ultima, value);
			}
			else
				ht.put(ultima, 1);
		}
	}
	
	
	public void EscribirArchivo() throws IOException {
		FileWriter archivo = new FileWriter(
				"E:/UNLaM/Programación Avanzada/Problemas Sugeridos/letrasExtremas.txt");
		;
		PrintWriter pw = new PrintWriter(archivo);

		Enumeration<Character> e = ht.keys();
		int cantidad = 0, maxCant = 0;
		while (e.hasMoreElements()) {
			cantidad = ht.get(e.nextElement());
			if (maxCant < cantidad) {
				maxCant = cantidad;
			}
		}

		e = ht.keys();
		ArrayList<Character> letras = new ArrayList<Character>();
		while (e.hasMoreElements()) {
			char c = e.nextElement();
			if (ht.get(c) == maxCant)
				letras.add(c);
		}
		for (int i = 0; i < letras.size(); i++) {
			pw.print(letras.get(i) + " ");
		}
		pw.println();
		ArrayList<String> guardadas = new ArrayList<String>();
		for (int i = 0; i < palabras.length; i++) {
			if (letras.contains(palabras[i].charAt(0)) || letras.contains(palabras[i].charAt(palabras[i].length() - 1))) {
				if(!(guardadas.contains(palabras[i]))){
					pw.println(palabras[i]);
					guardadas.add(palabras[i]);
				}
			}
		}
		archivo.close();
	}
	
	public static void main(String[] args) throws IOException {
		PalabrasExtremas le = new PalabrasExtremas(
				"E:/UNLaM/Programación Avanzada/Workspace/OIA/IN/mas palabras, una letra extrema.in");
		String[] s = le.getPalabras();
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		le.contarLetras();
		le.EscribirArchivo();
	}
}
