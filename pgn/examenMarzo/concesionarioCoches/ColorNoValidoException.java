package pgn.examenMarzo.concesionarioCoches;

/**
 * Lanzada para indicar que un color no es válido.
 * 
 * @author María Lourdes Magarín Corvillo
 *
 */
public class ColorNoValidoException extends Exception {
	/**
	 * Construye una excepción ColorNoValidoException con el mensaje especificado
	 * 
	 * @param string mensaje detallado
	 */
	public ColorNoValidoException(String string) {
		super(string);
	}

}
