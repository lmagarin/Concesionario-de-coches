package pgn.examenMarzo.concesionarioCoches;

/**
 * Lanzada para indicar que un medelo de coche no es válido.
 * 
 * @author María Lourdes Magarín Corvillo
 *
 */
public class ModeloNoValidoException extends Exception {
	/**
	 * Construye una excepción ModeloNoValidoException con el mensaje especificado
	 * 
	 * @param string mensaje detallado
	 */
	public ModeloNoValidoException(String string) {
		super(string);
	}

}
