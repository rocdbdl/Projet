package consoCarbone;

/**
 * Un ConsoCarbone est une empreinte carbone
 * @author Ugo Benazra et Roc De Begond Delarouzière
 * @version 1.0
 */

public class ConsoCarbone implements Comparable<ConsoCarbone>{
	/** nombre d'instance ConsoCarbonne */
	protected static int nbConsoCarb;
	/** Numero d'identification de l'instance */
	protected int id;
	/** empreinte carbone en tCO2eq */
	private double impact;

	/**
	 * Constructeur
	 * Cree une instance de la classe ConsoCarbone
	 */
	public ConsoCarbone() {
		id = ++nbConsoCarb;
		impact=0.0;
	}
	
	/**
	 * getter pour le numero d'identification de ConsoCarbone
	 * @return l'entier id
	 */
	public double getidConsoCarb() {
		return id;
	}
	
	/**
	 * getter pour impact
	 * @return le double impact
	 */
	public double getimpact() {
		return impact;
	}
	
	/**
	 * setter pour impact
	 * @param impact un double 
	 */
	public void setimpact(double impact) {
		this.impact = impact;
	}
	
	/**
	 * retourne la description détaillée de l'instance de ConsoCarbone
	 * @return chaine de caractère 
	 */
	public String toString(){
		return "id ConsoCarbonne : " + getidConsoCarb() + "\nimpact : " + impact + " tCO2eq \n\n";
	}
	
	/**
	 * compare deux instances de ConsoCarbone
	 * @param o une instance de ConsoCarbone
	 * @return	entier 1 si l'impact de l'instance passée en paramètre est supérieure à l'impact de l'instance en question,
	 * 0 si elle est égale,
	 * -1 si elle est inférieure
	 */
	public int compareTo(ConsoCarbone o) {
		if(o.getimpact() > impact) {
			return 1;
		}
		else if(o.getimpact()<impact) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	
}
