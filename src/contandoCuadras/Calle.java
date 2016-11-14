package contandoCuadras;

public class Calle {
	private int cantidadSimpatizantesEquipoA;
	private int cantidadSimpatizantesEquipoB;
	private int cantidadDeHabitantes;
	
	public Calle(int cantidadSimpatizantesEquipoA, int cantidadSimpatizantesEquipoB, int cantidadDeHabitantes){
		this.cantidadDeHabitantes = cantidadDeHabitantes;
		this.cantidadSimpatizantesEquipoA = cantidadSimpatizantesEquipoA;
		this.cantidadSimpatizantesEquipoB = cantidadSimpatizantesEquipoB;
	}
	
	public int obtenerDiferenciaDeSimpatizantes(){
		return Math.abs(cantidadSimpatizantesEquipoA - cantidadSimpatizantesEquipoB);
	}
	
	public int obtenerCantidadDeNeutrales(){
		return cantidadDeHabitantes - cantidadSimpatizantesEquipoA - cantidadSimpatizantesEquipoB;
	}
}
