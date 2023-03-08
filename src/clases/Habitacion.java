package clases;

public class Habitacion {
	
	/**
	 * @author Álvaro y Lucca
	 * @version 1.0
	 * 
	 */
	
	private int numHabitacion;
	private String estado;
	private int numCamas;
	
	/**
	 * Constructor que recibe el numero de habitaciones, el estado y el numero de camas de la habitacion
	 * @param numHabitacion numero habitaciones
	 * @param estado estado de habitacion 
	 * @param numCamas numero de camas
	 */
	
	public Habitacion(int numHabitacion, String estado, int numCamas) {
		this.numHabitacion = numHabitacion;
		this.estado = estado;
		this.numCamas = numCamas;
	}

	public int getNumHabitacion() {
		return numHabitacion;
	}

	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getNumCamas() {
		return numCamas;
	}

	public void setNumCamas(int numCamas) {
		this.numCamas = numCamas;
	}
	
	
	
	

}
