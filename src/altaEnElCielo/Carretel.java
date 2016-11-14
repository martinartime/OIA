package altaEnElCielo;

public class Carretel {
	private int longitud;
	private static Carretel carretel = new Carretel();
	
	private Carretel(){
		longitud = 0;
	}
	
	public static Carretel getInstance(){
		return carretel;
	}
	

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public boolean puedeDar(int longitudACortar){
		if(longitud>0 && longitudACortar<=longitud){
			return true;
		}	
		return false;
	}
	
	public void darTela(int longitudACortar){
		if(puedeDar(longitudACortar)){
			longitud-=longitudACortar;
		}
	}
}
