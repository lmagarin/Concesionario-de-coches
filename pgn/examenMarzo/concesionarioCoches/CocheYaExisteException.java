package pgn.examenMarzo.concesionarioCoches;

/**
 * Lanzada para indicar que un coche existe.
 * 
 * @author María Lourdes Magarín Corvillo
 *
 */
public class CocheYaExisteException extends Exception {
	/**
	 * Construye una excepción CocheYaExisteException con el mensaje especificado
	 * 
	 * @param string mensaje detallado
	 */
	public CocheYaExisteException(String string) {
		super(string);
	}

}
