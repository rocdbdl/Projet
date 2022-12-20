package consoCarbone;

/**
 * Une Taille est une classe qualificative d'une voiture
 * @author Ugo Benazra et Roc De Begon Delarouzière
 * @version 1.0
 */

public enum Taille {
	P(4.2), G(19.0);
	
	/** coefficient énergétique lié à la taille de la voiture */
	private double consoTaille;
	
	/**
	 * Constructeur
	 * Cree une instance de la classe Taille en donnant la valeur du consoTaille
	 * @param consoTaille (double)
	 */
	private Taille(double consoTaille) {
		this.consoTaille = consoTaille;
	}
	
	/**
	 * getter pour le consoTaille
	 * @return consoTaille (double)
	 */
	public double getConsoTaille() {
		return consoTaille;
	}
}
