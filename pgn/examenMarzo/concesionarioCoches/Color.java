package pgn.examenMarzo.concesionarioCoches;

/**
 * Representa los colores. Seg�n el enunciado del examen:
 * 
 * <pre>
 * Se limitarán los colores a tres: plata, rojo y azul. Para solicitar el color
 * al dar de alta al coche podr� implementarse un m�todo pedirColor que mediante
 * la gestión de un men�, devolver� el color indicado
 * </pre>
 * 
 * @author Mar�a Lourdes Magar�n Corvillo
 * 
 */
public enum Color {
	/**
	 * El color plata
	 */
	PLATA,
	/**
	 * El color rojo
	 */
	ROJO,
	/**
	 * El color azul
	 */
	AZUL;
	/**
	 * Almacena los colores posibles
	 */
	private static final Color[] VALUES = Color.values();

	/**
	 * Genera las opciones del men�
	 * 
	 * @return Opciones del men�, incluyendo "Salir"
	 */
	public String[] generarOpcionesMenu() {
		String[] opcionesMenu = new String[getValues().length + 1];
		int i = 0;
		for (Color color : getValues()) {
			opcionesMenu[i++] = color.name();
		}
		opcionesMenu[i] = "Salir";
		return opcionesMenu;
	}

	/**
	 * Devuelve VALUES
	 * 
	 * @return VALUES
	 * @see Color#VALUES
	 */
	public Color[] getValues() {
		return VALUES;
	}

}
