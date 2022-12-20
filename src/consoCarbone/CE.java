package consoCarbone;

/**
 * Un CE est une classe énergétique qualificative d'un logement
 * @author Ugo Benazra et Roc De Begon Delarouzière
 * @version 1.0
 */

public enum CE {
	A(0.005), B(0.01), C(0.02), D(0.035), E(0.055), F(0.08), G(0.1);
	
	/** coefficient énergétique lié à la classe énergétique du logement */
	private double alpha;
	
	/**
	 * Constructeur qui crée une instance de la classe CE en donnant la valeur du alpha
	 * @param alpha (double)
	 */
	private CE(double a) {
		this.alpha = a;
	}
	
	/**
	 * getter pour le alpha
	 * @return alpha (double)
	 */
	public double getalpha() {
		return alpha;
	}
	
	
}
