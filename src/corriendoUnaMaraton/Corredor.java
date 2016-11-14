package corriendoUnaMaraton;

public class Corredor {
	private int categoria;
	private int numero;
	
	public Corredor(int numero, int categoria){
		this.numero = numero;
		this.categoria = categoria;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
