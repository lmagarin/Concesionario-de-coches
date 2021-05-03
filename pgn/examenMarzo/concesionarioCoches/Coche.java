package pgn.examenMarzo.concesionarioCoches;

//P: Indica cu�ndo se utiliza la etiqueta @see Busca c�mo se usa en http://docs.oracle.com/javase/7/docs/technotes/tools/solaris/javadoc.html
import java.util.regex.Pattern;

/**
 * Representa a un coche.
 * <p>
 * Un coche tendr� las siguientes caracter�sticas:
 * <ol>
 * <li>Color. Se limitarán los colores a tres: plata, rojo y azul.</li>
 * 
 * 
 * <li>Modelo. Se limitarán los modelos de coches a siete: C�rdoba (marca
 * Seat),Toledo (marca Seat),Ibiza (marca Seat), Serie 1 (marca BMW), Serie 2
 * (marca BMW),Serie 3 (marca BMW) y Serie 5 (marca BMW). Para solicitar el
 * modelo al dar de alta al coche podr� implementarse un m�todo pedirModelo que
 * mediante la gestión de un men�, devolver� el modelo indicado.</li>
 * 
 * 
 * <li>matrícula (�nica por coche) El formato de las matrículas ser� el nuevo:
 * combinaci�n de cuatro n�meros (de 0000 a 9999) y tres letras, comenzando por
 * BBB y terminando por ZZZ, excluyendo vocales, la LL, la � y la Q.</li>
 * 
 * 
 * <li>matrículas válidas: 0000-BBB, 0000 BBB, 0000BBB, 1234ZZZ.</li>
 * <li>matrículas inválidas: 000_BBB, 9999-BBQ, 0000-B�B, 0000-DEF, 0000 bbb,
 * 0000 AAA</li>
 * 
 * </ol>
 * 
 * @author Magarín
 * 
 */
public class Coche {
	/**
	 * matrícula del coche
	 */
	private String matricula;
	/**
	 * Color del coche
	 */
	private Color color;
	/**
	 * Modelo del coche
	 */
	private Modelo modelo;
	/**
	 * Representación compilada de la matrícua de un coche.
	 * 
	 * <p>
	 * Según el enunciado del examen: El formato de las matrículas ser� el nuevo:
	 * combinaci�n de cuatro números (de 0000 a 9999) y tres letras, comenzando por
	 * BBB y terminando por ZZZ, excluyendo vocales, la LL, la Ñ y la Q.
	 * <ol>
	 * <li>matrículas válidas: 0000-BBB, 0000 BBB, 0000BBB, 1234ZZZ.</li>
	 * <li>matrículas inválidas: 000_BBB, 9999-BBQ, 0000-B�B, 0000-DEF, 0000 bbb,
	 * 0000 AAA</li>
	 * </ol>
	 */
	static final private Pattern patternMatricula = Pattern.compile("^\\d{4}[ -]?[[B-Z]&&[^QEIOU]]{3}$");

	// P: Cu�ntas excepciones se lanzan en Coche?? �qu� m�todos se interrumpen?
	// �D�nde se tratan?
	// P: podr�a simplificarse en Exception?
	/**
	 * Crea un nuevo Coche con los parámetros indicados
	 * 
	 * @param matricula matrícula del nuevo coche
	 * @param color     Color del nuevo coche
	 * @param modelo    Modelo del nuevo coche
	 * @throws Exception Si el coche no puede crearse, en caso de una matrícula
	 *                   inv�lida, color o modelo.
	 * 
	 * @see Coche#patternMatricula
	 */
	public Coche(String matricula, Color color, Modelo modelo) throws Exception {
		// throws MatriculaNoValidaException, ColorNoValidaException,
		// ModeloNoValidoException {
		super();
		setMatricula(matricula);
		setColor(color);
		setModelo(modelo);
	}

	/**
	 * Crea un nuevo Coche con los parámetros indicados
	 * 
	 * @param matricula matrícula del nuevo coche
	 * @throws MatriculaNoValidaException Si el coche no puede crearse, en caso de
	 *                                    una matrícula inv�lida.
	 * @see Coche#patternMatricula
	 */
	public Coche(String matricula) throws MatriculaNoValidaException {
		setMatricula(matricula);
	}

	// P:�Por qu� no se usa instanciarCoche??

	// static Coche instanciarCoche(String matricula, Color color, Modelo
	// modelo) {
	// if (esValida(matricula) && color != null && modelo != null)
	// return new Coche(matricula, color, modelo);
	// return null;
	// }

	// static Coche instanciarCoche(String matricula) {
	// if (esValida(matricula))
	// return new Coche(matricula);
	// return null;
	// }

	/**
	 * Indica si una matrícula es o no válida
	 * 
	 * @param matricula Matrícula a validar
	 * @return true si la matrícula es válida. false en otro caso
	 * 
	 *         * @see Coche#patternMatricula
	 */
	private static boolean esValida(String matricula) {
		return patternMatricula.matcher(matricula).matches();
	}

	/**
	 * Asigna la matrícula del coche
	 * 
	 * @param matricula matrícula a asignar
	 * @throws MatriculaNoValidaException Si la matrícula no es v�lida
	 * @see Coche#patternMatricula
	 */
	private void setMatricula(String matricula) throws MatriculaNoValidaException {
		if (esValida(matricula))
			this.matricula = estandarizarMatricula(matricula);
		else
			throw new MatriculaNoValidaException("La matrícula no es v�lida. ");
	}

	/**
	 * Le cambia el formato a la matrícula del coche. u
	 * 
	 * @param matricula matrícula a estandarizar. Puede tener un espacio o guion
	 *                  para separar los 4 n�meros de las tres letras
	 * @return matrícula sin espacios ni guiones
	 */
	private String estandarizarMatricula(String matricula) {
		assert esValida(matricula);
		return matricula.replaceAll("[ -]", "");
	}

	/**
	 * Obtiene el color del coche
	 * 
	 * @return Color del coche
	 */
	Color getColor() {
		return color;
	}

	/**
	 * Asigna el color del coche
	 * 
	 * @param color Color a asignar
	 * @throws ColorNoValidoException Si el color es null
	 */
	private void setColor(Color color) throws ColorNoValidoException {
		if (color != null)
			this.color = color;
		else
			throw new ColorNoValidoException("El color no es v�lido. ");
	}

	/**
	 * * Asigna el modelo del coche
	 * 
	 * @param modelo Modelo a asignar
	 * @throws ModeloNoValidoException Si el Modelo es null
	 */
	private void setModelo(Modelo modelo) throws ModeloNoValidoException {
		if (modelo != null)
			this.modelo = modelo;
		else
			throw new ModeloNoValidoException("El modelo no es v�lido. ");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	/**
	 * Indica si otro coche es "igual a " este. Para ello, se fija en sus
	 * matrículas.
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	/**
	 * Devuelve una representaci�n del coche en forma de cadena.
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nCoche [matricula=" + matricula + ", color=" + color + ", modelo=" + modelo + "]";
	}

}
