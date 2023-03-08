package clases;

/**
 * 
 * @author Lucca y Alvaro
 * @version 1.0
 *
 */
public class Doble {
	
	private boolean minibar;

	/**
	 * Constructor que recibe si tiene minibar o no
	 * @param minibar
	 */
	public Doble(boolean minibar) {
		this.minibar = minibar;
	}

	/**
	 * Getter de minibar
	 * @return Si tiene minibar
	 */
	public boolean isMinibar() {
		return minibar;
	}

	/**
	 * Setter de minibar
	 * @param minibar Minibar de la doble
	 */
	public void setMinibar(boolean minibar) {
		this.minibar = minibar;
	}
	
	/**
	 * Metodo para calcular el descuento de la doble
	 */
	public void calcularDescuento() {
		
	}

}
