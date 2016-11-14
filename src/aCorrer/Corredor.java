package aCorrer;

public class Corredor {
	private long numero;
	private String sexo;
	private int edad;
	
	public Corredor(long numero, String sexo,int edad){
		this.numero=numero;
		this.sexo=sexo;
		this.edad=edad;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
