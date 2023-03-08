package clases;

import java.util.*;

public class Reserva {
	
	/**
	 * @author Álvaro y Lucca
	 * @version 1.0
	 * 
	 */
	
	private int numReserva;
	private Date fechaEntrada;
	private Date fechaSalida;
	private int numPersonas;
	
	/**
	 * Constructor que recibe el numero, la fecha de entrada, la fecha de salida y el numero de personas de la reserva
	 * @param numReserva numero de reserva
	 * @param fechaEntrada fecha de entrada
	 * @param fechaSalida fecha de salida
	 * @param numPersonas numero de personas
	 */ 
	
	public Reserva(int numReserva, Date fechaEntrada, Date fechaSalida, int numPersonas) {
		this.numReserva = numReserva;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.numPersonas = numPersonas;
	}
	
	//Generamos los getters y setters de las diferentes variables

	public int getNumReserva() {
		return numReserva;
	}

	public void setNumReserva(int numReserva) {
		this.numReserva = numReserva;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public int getNumPersonas() {
		return numPersonas;
	}

	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}
	
	
	

}
