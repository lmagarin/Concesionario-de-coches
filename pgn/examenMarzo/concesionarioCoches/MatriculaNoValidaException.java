package pgn.examenMarzo.concesionarioCoches;

/**
 * Lanzada para indicar que la matrícula no es válida
 * 
 * @author María Lourdes Magarín Corvillo
 *
 */
public class MatriculaNoValidaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Construye una excepción MatriculaNoValidaException con el mensaje
	 * especificado
	 * 
	 * @param string mensaje detallado
	 */
	public MatriculaNoValidaException(String string) {
		super(string);
	}

}
