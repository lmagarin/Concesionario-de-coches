package pgn.examenMarzo.concesionarioCoches;

/**
 * Lanzada para indicar que un coche no existe.
 * 
 * @author María Lourdes Magarín Corvillo
 *
 */
public class CocheNoExisteException extends Exception {

	/**
	 * Construye una excepción CocheNoExisteException con el mensaje especificado
	 * 
	 * @param string mensaje detallado
	 */
	public CocheNoExisteException(String string) {
		super(string);
	}

}
