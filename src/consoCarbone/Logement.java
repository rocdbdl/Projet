package consoCarbone;

/**
 * Un Logement est un ConsoCarbone qui correspond à une empreinte carbone liée au logement
 * @author Ugo Benazra et Roc De Begond Delarouzière
 * @version 1.0
 */

public class Logement extends ConsoCarbone{
	
	/** superficie du logement en m2 */
	private int superficie;     
	/** classe énergétique du logement */
	private CE ce;				
	
	
	/**
     * Constructeur qui crée une instance de la classe Logement sans donner de valeurs aux attributs
	 */
	public Logement(){
		super();
	}
	
	/**
     * Constructeur qui crée une instance de la classe Logement en donnant des valeurs aux attributs
	 * @param superficie (entier)
	 * @param ce (CE)
	 */
	public Logement(int superficie, CE ce) {
		super();
		this.superficie = superficie;
		this.ce = ce;
		//this.impact = ce.getalpha()*superficie;
		setimpact(ce.getalpha()*superficie);
	}
	
	
	/**
	 * getter pour la superficie du logement 
	 * @return superficie (int)
	 */
	public int getsuperficie() {
		return superficie;
	}
	
	/**
	 * setter pour la superficie du logement 
	 * @param superficie (entier) 
	 */
	public void setsuperfice(int superficie) {
		this.superficie = superficie;
	}
	
	
	/**
	 * getter pour la classe énergétique du logement
	 * @return ce (CE)
	 */
	public CE getCE() {
		return ce;
	}
	
	/**
	 * setter pour la classe énergétique du logement
	 * @param ce (CE)
	 */
	public void setce(CE ce) {
		this.ce = ce;
	}
	
	
	/**
	 * setter pour l'impact si jamais les valeurs de superficie et ce venaient à changer
	 */
	public void setimpact() {
		setimpact(ce.getalpha()*superficie);
	}
	
		
	/**
	 * setter pour la superficie et la classe énergétique
	 * @param superficie (entier)
	 * @param ce (CE)
	 */
	public void setLogement(int superficie, CE ce) {
		this.superficie = superficie;
		this.ce = ce;
		//this.impact = ce.getalpha()*superficie;
		setimpact(ce.getalpha()*superficie);
	}
	
	/**
	 * Afficheur de l'empreinte carbonne moyenne d'un français en terme de logement
	 */
	@Override
	public void CarbFRmoy() {
		System.out.println("En moyenne, un/une français.e consomme, avec son logement, 1696 kg de co2 par an avec les énergies et utilités du logement, "
				+ "675 kg/an avec les constructions et les gros entretiens du logement, et enfin 335 avec les équipements du logement.");
	}
	
	
	/**
	 * retourne la description détaillée de l'instance de Logement
	 * @return chaine de caractère 
	 */
	@Override
	public String toString(){
		return "id Logement : " + super.getidConsoCarb() + "\nSuperficie :  " + superficie + " m2 \nCE : " + ce + "\nimpact : " + super.getimpact() + " tCO2eq \n\n";
	}
	
	/**
	 * methode main de la classe
	 * @param args
	 */
	public static void main(String [] args) {}
	
}