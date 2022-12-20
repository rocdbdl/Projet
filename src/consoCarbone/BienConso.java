package consoCarbone;

/**
 * Un BienConso est un ConsoCarbone qui correspond à une empreinte carbone liée aux dépenses annuelles 
 * @author Ugo Benazra et Roc De Begon Delarouzière
 * @version 1.0
 */

public class BienConso extends ConsoCarbone {
	
	/** montant en euros des dépenses annuelles */
	private double montant;
	
	/**
     * Constructeur qui crée une instance de la classe BienConso sans donner de valeurs aux attributs
	 */
	public BienConso(){
		super();
	}
	
	/**
     * Constructeur qui crée une instance de la classe BienConso en donnant le montant des dépenses annuelles
	 * @param montant (double)
	 */
	public BienConso(double montant) {
		super();
		this.montant = montant;
		//this.impact = montant/1750;
		setimpact(montant/1750);
	}
	
	
	/**
	 * getter pour le montant des dépenses annuelles
	 * @return montant (double)
	 */
	public double getmontant() {
		return montant;
	}
	
	/**
	 * setter pour le montant des dépenses annuelles
	 * @param montant (double) 
	 */
	public void setmontant(double montant) {
		this.montant = montant;
	}
	

	/**
	 * setter pour l'impact si jamais le montant de dépenses annuelles venait à étre modifié
	 */
	public void setimpact() {
		setimpact(montant/1750);
	}
	
	
	/**
	 * Afficheur de la consommation moyenne d'un français en terme de dépenses annuelles
	 */
	@Override
	public void CarbFRmoy() {
		System.out.println("En moyenne, un/une français.e consomme, en Bien conso, 1180 kg de co2 par an avec les achats et usages "
				+ "Internet et technologie, 763 kg/an avec l'habillement, et enfin 682 pour les autres biens et services.");
	}
	
	/**
	 * retourne la description détaillée de l'instance de BienConso
	 * @return (chaine de caractère) 
	 */
	@Override
	public String toString(){
		return "id Bien Conso : " + super.getidConsoCarb() + "\nMontant depensé par an :  " + montant + " € " + "\nimpact : " + super.getimpact() + " tCO2eq \n\n";
	}
	
	/**
	 * methode main de la classe
	 * @param args
	 */
	public static void main(String [] args) {}
}
