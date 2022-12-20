package consoCarbone;

/**
 * Un Avion est un Transport qui correspond à une empreinte carbone liée à l'utilisation de l'avion pour se déplacer
 * @author Ugo Benazra et Roc De Begond Delarouzière
 * @version 1.0
 */

public class Avion extends Transport{
	
	/** boolean égale à true si l'avion est utilisé et false sinon */
	private boolean utilise;
	/** kilomètres parcourus en avion en 1 an */
	private int kilomAnnee;
	/** constantes utiles dans le calcul de l'attribut impact */
	private static final double cst1=9*0.00001;
	
	/**
     * Constructeur qui crée une instance de la classe Avion sans donner de valeurs aux attributs
	 */
	public Avion(){
		super();
	}
	
	/**
	 * Constructeur qui crée une instance de la classe Avion en donnant les valeurs des attributs
	 * @param utilise (boolean), kilomAnnee (entier)
	 */
	public Avion(boolean utilise, int kilomAnnee) {
		super();
		this.utilise = utilise;
		this.kilomAnnee = kilomAnnee;
		if(utilise == true) {
			//this.impact = kilomAnnee*cst1 + taille.getConsoTaille()/amortissement;
			setimpact(cst1*kilomAnnee);
		}
		else {
			setimpact(0.0);
		}
	}

	/**
	 * getter pour utilise
	 * @return utilise (boolean)
	 */
	public boolean isUtilise() {
		return utilise;
	}

	/**
	 * setter pour utilise
	 * @param utilise (boolean) 
	 */
	public void setUtilise(boolean utilise) {
		this.utilise = utilise;
	}

	/**
	 * getter pour le nombre de kilomètres parcourus par an en avion
	 * @return kilomAnnee (entier)
	 */
	public int getKilomAnnee() {
		return kilomAnnee;
	}

	/**
	 * setter pour kilomAnnee
	 * @param kilomAnnee (entier) 
	 */
	public void setKilomAnnee(int kilomAnnee) {
		this.kilomAnnee = kilomAnnee;
	}
	
	/**
	 * setter pour l'impact si jamais les valeurs de utilise et kilomAnnee venaient à changer
	 */
	public void setimpact() {
		if(utilise == true) {
			//this.impact = kilomAnnee*cst1 + taille.getConsoTaille()/amortissement;
			setimpact(cst1*kilomAnnee);
		}
		else {
			setimpact(0.0);
		}
	}

	/**
	 * setter pour utilise et kilomAnnee
	 * @param utilise (boolean), kilomAnnee (entier)
	 */
	public void setAvion(boolean utilise, int kilomAnnee) {
		this.utilise = utilise;
		this.kilomAnnee = kilomAnnee;
		if(utilise == true) {
			//this.impact = kilomAnnee*cst1 + taille.getConsoTaille()/amortissement;
			setimpact(cst1*kilomAnnee);
		}
		else {
			setimpact(0.0);
		}
	}
	
	/**
	 * retourne la description détaillée de l'instance de Avion
	 * @return (chaine de caractère) 
	 */
	@Override
	public String toString(){
		if(utilise == true) {
			return "id Avion : " + super.getidConsoCarb() + "\nUtilise l'avion :  " + utilise + "\nKilometres par an : " + kilomAnnee + "\nImpact : " + getimpact() + " tCO2eq \n\n";
		}
		else {
			return "id Avion : " + super.getidConsoCarb() + "\nUtilise l'avion :  " + utilise + "\nImpact : " + getimpact() + " tCO2eq \n\n";
		}
	}
	
	/**
	 * methode main de la classe
	 * @param args
	 */
	public static void main(String [] args) {}
	
	
	
	
}
