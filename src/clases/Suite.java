package clases;

/**
 * 
 * @author Lucca y Alvaro
 * @version 1.0
 *
 */
public class Suite {
	
	private int metros;
	private String servicios;
	
	/**
	 * Constructor que recibe los metros y servicios de la suite
	 * @param metros Metros de la suite
	 * @param servicios Servicios de la suite
	 */
	public Suite(int metros, String servicios) {
		this.metros = metros;
		this.servicios = servicios;
	}

	/**
	 * Getter de metros
	 * @return Metros de la suite
	 */
	public int getMetros() {
		return metros;
	}

	/**
	 * Setter de metros
	 * @param metros Metros de la suite
	 */
	public void setMetros(int metros) {
		this.metros = metros;
	}

	/**
	 * Getter de servicios
	 * @return Servicios de la suite
	 */
	public String getServicios() {
		return servicios;
	}

	/**
	 * Setter de servicios
	 * @param servicios Servicios de la suite
	 */
	public void setServicios(String servicios) {
		this.servicios = servicios;
	}
	
	/**
	 * Metodo para calcular los gastos de la suite
	 */
	public void calcularGastos() {
		
	}

}
