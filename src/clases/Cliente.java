package clases;

import java.util.Scanner;

public class Cliente {
	
	/**
	 * @author Álvaro y Lucca
	 * @version 1.0
	 * 
	 */
	
	Scanner sc = new Scanner(System.in);
	private int numCliente;
	private String nombre;
	private String telefono;
	
	/**
	 * Constructor que recibe el numero, el nombre y el telefono del cliente
	 * @param numCliente numero del cliente
	 * @param nombre nombre del cliente
	 * @param telefono telefono del cliente
	 */
	public Cliente (int numCliente, String nombre, String telefono) {
		this.numCliente = numCliente;
		this.nombre = nombre;
		this.telefono = telefono;
		
	}
	
	//Realizamos los getters y setters de las diferentes variables creadas
	
	public int getNumCliente() {
		return numCliente;
	}
	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	/**
	 * Metodo para realizar la reserva 
	 * @param sc Scanner sc
	 * 
	 */
	public void hacerReserva(Scanner sc) {
		System.out.println("Introduzca su numero de cliente");
		numCliente = Integer.parseInt(sc.nextLine());
		System.out.println("Escribe tu nombre");
		nombre = sc.nextLine();
		System.out.println("Introduzca tu telefono");
		telefono = sc.nextLine();
	}
	

}
