package altaEnElCielo;

public class Escuela {
	private int id;
	Bandera bandera;
	
	public Escuela(int id, int longitudInicial){
		this.id=id;
		bandera=new Bandera(longitudInicial);
		
	}
	
	public boolean pedir(Carretel carretel){
		if(carretel.puedeDar(bandera.getLongitudInicial())){
			carretel.darTela(bandera.getLongitudInicial());
			bandera.aumentarLongitud();
			return true;
		}
		return false;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Bandera getBandera() {
		return bandera;
	}
	public void setBandera(Bandera bandera) {
		this.bandera = bandera;
	}
	
	
}
