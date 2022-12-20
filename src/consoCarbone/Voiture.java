package consoCarbone;

/**
 * Une Voiture est un Transport qui correspond à une empreinte carbone liée aux habitudes alimentaires
 * @author Ugo Benazra et Roc De Begon Delarouzière
 * @version 1.0
 */


public class Voiture extends Transport{
	/** boolean égale à true si une voiture est utilisé et false sinon */
	private boolean possede;
	/** Taille de la voiture */
	private Taille taille;
	/** kilomètres parcourus en voiture en 1 an */
	private int kilomAnnee;
	/** durée de conservation du véhicule */
	private int amortissement;
	/** constantes utiles dans le calcul de l'attribut impact */
	private static final double cst1=1.93*0.0001;
	
	/**
     * Constructeur qui crée une instance de la classe Voiture sans donner de valeurs aux attributs
	 */
	public Voiture(){
		super();
	}
	
	/**
     * Constructeur qui crée une instance de la classe Voiture sans en donnant des valeurs aux attributs
	 * @param possede (boolean)
	 * @param taille (Taille) 
	 * @param kilomAnnee (entier)
	 * @param amortissement (entier)
	 */
	public Voiture(boolean possede, Taille taille, int kilomAnnee, int amortissement) {
		super();
		this.possede = possede;
		this.taille = taille;
		this.kilomAnnee = kilomAnnee;
		this.amortissement = amortissement;
		if(possede == true) {
			//this.impact = kilomAnnee*cst1 + taille.getConsoTaille()/amortissement;
			setimpact(kilomAnnee*cst1 + taille.getConsoTaille()/amortissement);
		}
	}
	
	
	/**
	 * getter pour possede
	 * @return possede (boolean)
	 */	
	public boolean getpossede() {
		return possede;
	}
	
	/**
	 * setter pour possede
	 * @param possede (boolean)
	 */	
	public void setpossede(boolean possede) {
		this.possede = possede;
	}
	
	
	/**
	 * getter pour taille
	 * @return taille (Taille)
	 */	
	public Taille gettaille() {
		return taille;
	}
	
	/**
	 * setter pour taille
	 * @param taille (Taille)
	 */	
	public void settaille(Taille taille) {
		this.taille = taille;
	}
	
	
	/**
	 * getter pour kilomAnnee
	 * @return kilomAnnee (entier)
	 */		
	public int getkilomAnnee() {
		return kilomAnnee;
	}
	
	/**
	 * setter pour kilomAnnee
	 * @param kilomAnnee (entier)
	 */	
	public void setkilomAnnee(int kilomAnnee) {
		this.kilomAnnee = kilomAnnee;
	}
	
	
	/**
	 * getter pour amortissement
	 * @return amortissement (entier)
	 */	
	public int getamortissement() {
		return amortissement;
	}
	
	/**
	 * setter pour amortissement
	 * @param amortissement (entier)
	 */	
	public void setamortissement(int amortissement) {
		this.amortissement = amortissement;
	}
	
	/**
	 * setter pour impact (si la valeur d'un des attribut venait à être modifiée, setimpact doit être rappelée pour recalculer la valeur d'impact)
	 */	
	public void setimpact() {
		if(possede == false) {
			setimpact(0.0);
		}
		else {
			setimpact(kilomAnnee*cst1 + taille.getConsoTaille()/amortissement);
		}
	}

	
	/**
	 * setter pour possede, taille, kilomAnnee, amortissement
	 * @param possede (boolean)
	 * @param taille (Taille) 
	 * @param kilomAnnee (entier)
	 * @param amortissement (entier)
	 */	
	public void setVoiture(boolean possede, Taille taille, int kilomAnnee, int amortissement) {
		this.possede = possede;
		this.taille = taille;
		this.kilomAnnee = kilomAnnee;
		this.amortissement = amortissement;
		if(possede == false) {
			//this.impact = 0.0;
			setimpact(0.0);
		}
		else {
			//this.impact = kilomAnnee*cst1 + taille.getConsoTaille()/amortissement;
			setimpact(kilomAnnee*cst1 + taille.getConsoTaille()/amortissement);
		}
	}
	
	/**
	 * retourne la description détaillée de l'instance de Voiture
	 * @return (chaine de caractère) 
	 */
	@Override
	public String toString(){
		if(possede == true) {
			return "id Voiture : " + super.getidConsoCarb() + "\nPossede une voiture :  " + possede + "\nTaille : " + taille + "\nKilometres par an : " + kilomAnnee + "\nAmortissement : " + amortissement + "\nImpact : " + getimpact() + " tCO2eq \n\n";
		}
		else {
			return "id Voiture : " + super.getidConsoCarb() + "\nPossede une voiture :  " + possede + "\nImpact : " + getimpact() + " tCO2eq \n\n";
		}
	}
	
	/**
	 * methode main de la classe
	 * @param args
	 */
	public static void main(String [] args) {}
}
