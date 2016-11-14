package palabrasExtremas;

public class Letras {
	private char letra;
	private int cantidad;
	
	public Letras(){
		letra = 0;
		cantidad = 0;
	}
	
	public Letras(char c){
		letra = c;
		cantidad = 0;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Letras [letra=" + letra + ", cantidad=" + cantidad + "]";
	}
	
	public void sumar(){
		cantidad++;
	}
}
