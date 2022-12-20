package consoCarbone;

/**
 * Un Alimentation est un ConsoCarbone qui correspond à une empreinte carbone liée aux habitudes alimentaires
 * @author Ugo Benazra et Roc De Begon Delarouzière
 * @version 1.0
 */

public class Alimentation extends ConsoCarbone{
	
	/** taux de repas (entre 0 et 1) à base de boeuf */
	private double txBoeuf; 
	/** taux de repas (entre 0 et 1) végétariens */
	private double txVege;	
	/** constantes utiles dans le calcul de l'attribut impact */
    private static final double cst1=8.0, cst2 = 1.6, cst3 = 0.9;
	
	
    /**
     * Constructeur qui crée une instance de la classe Alimentation sans donner de valeurs aux attributs
	 */
	public Alimentation(){
		super();
	}
	
	/**
	 * Constructeur qui crée une instance de la classe Alimentation en donnant les valeurs des attributs
	 * @param txBoeuf (double)
	 * @param txVege (double)
	 */
	public Alimentation(double txBoeuf, double txVege){
		super();
		this.txBoeuf = txBoeuf;
		this.txVege = txVege;
		//this.impact = cst1*txBoeuf + cst2*(1-txVege-txBoeuf) + cst3*txVege;
		setimpact(cst1*txBoeuf + cst2*(1-txVege-txBoeuf) + cst3*txVege);
	}
	
	
	/**
	 * getter pour le taux de repas à base de boeuf
	 * @return txboeuf (double)
	 */
	public double gettxBoeuf() {
		return txBoeuf;
	}
	
	
	/**
	 * setter pour le taux de repas à base de boeuf
	 * @param x (double) 
	 */
	public void settxBoeuf(double x) {
		if (x>=0 && x<=1) this.txBoeuf = x;
		else System.out.println("la valeur rentrée pour le txBoeuf doit strictement être comprise entre 0 et 1 !");
	}
	
	
	/**
	 * getter pour le taux de repas vegetariens
	 * @return txVege (double)
	 */
	public double gettxVege() {
		return txVege;
	}
	
	/**
	 * setter pour le taux de repas vegetariens
	 * @param y (double) 
	 */
	public void settxVege(double y) {
		if (y>=0 && y<=1) this.txVege = y;
		else System.out.println("la valeur rentrée pour le txVege doit strictement être comprise entre 0 et 1 !");
	}
	
	/**
	 * setter pour l'impact si jamais les valeurs de txBoeuf et txVege venaient à changer
	 */
	public void setimpact() {
		setimpact(cst1*txBoeuf + cst2*(1-txVege-txBoeuf) + cst3*txVege);
	}
	
	/**
	 * setter pour le taux de repas vegetariens et le taux de repas à base de boeuf
	 * @param txBoeuf (double)
	 * @param txVege (double)
	 */
	public void setConsoAlim(double txBoeuf, double txVege) {
		if(txBoeuf+txVege > 1) {System.out.println("Les valeurs rentrée ne sont pas conformes. Leur somme doit inférieur à 1 !");}
		else {
			if (txBoeuf>=0 && txBoeuf<=1) {
				this.txBoeuf = txBoeuf;
				if (txVege>=0 && txVege<=1) {
					this.txVege = txVege;
					//this.impact = cst1*txBoeuf + cst2*(1-txVege-txBoeuf) + cst3*txVege;
					setimpact(cst1*txBoeuf + cst2*(1-txVege-txBoeuf) + cst3*txVege);
				}
				else {System.out.println("La valeur rentrée pour txVege n'est pas conforme. Elle doit être comprise entre 0 et 1 inclus !");}
			}
			else {System.out.println("La valeur rentrée pour txBoeuf n'est pas conforme. Elle doit être comprise entre 0 et 1 inclus !");}	
		}	
	}
	
	/**
	 * Afficheur de la consommation moyenne d'un français en terme d'alimentation
	 */
	@Override
	public void CarbFRmoy() {
		System.out.println("En moyenne, un/une français.e consomme, avec son alimentation, "
				+ "1144 kg/ an avec les viandes et poissons, 408 kg/an avec les produits laitiers et les oeufs,"
				+ "263 avec les autres boissons et enfin 538 avec tout le reste de l'alimentation.");
	}
	
	/**
	 * retourne la description détaillée de l'instance de Alimentation
	 * @return (chaine de caractère) 
	 */
	@Override
	public String toString(){
		return "id Alimentation : " + super.getidConsoCarb() + "\ntxBoeuf : " + txBoeuf + "\ntxVege : " + txVege + "\nimpact : " + super.getimpact() + " tCO2eq \n\n";
	}
	
	
	/**
	 * methode main de la classe
	 * @param args
	 */	public static void main(String [] args) {}
	
}