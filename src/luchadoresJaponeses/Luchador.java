package luchadoresJaponeses;

public class Luchador {
	private int peso;
	private int altura;
	
	public Luchador() {
		peso=0;
		altura=0;
	}
	
	public Luchador(int peso, int altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Luchador [peso=" + peso + ", altura=" + altura + "]";
	}

	public boolean Comparar(Luchador l) {
		if(this.peso>=l.peso && this.altura>=l.altura)
			return true;
		return false;
	}
	
	public static void main(String args[]) {
		Luchador l1 = new Luchador();
		Luchador l2 = new Luchador(1,1);
		if(l1.Comparar(l2))
			System.out.println(l1);
		else
			System.out.println(l2);
	}
}
