package consoCarbone;

/**
 * Un Transport est un ConsoCarbone qui correspond à une empreinte carbone liée aux déplacements à l'aide d'un vehicule motorisé
 * @author Ugo Benazra et Roc De Begon Delarouzière
 * @version 1.0
 */

public class Transport extends ConsoCarbone{

	 /**
     * Constructeur qui crée une instance de la classe Alimentation sans donner de valeurs aux attributs
	 */
	public Transport(){
		super();
	}
	
	/**
	 * Afficheur de la consommation moyenne d'un français en terme de Transport
	 */
	@Override
	public void CarbFRmoy() {
		System.out.println("En moyenne, un/une français.e consomme, avec pour le transport, 1972 kg de co2 par an avec la voiture, "
				+ "480 kg/an avec l'avion, 383 kg/an avec le fret et la messagerie et enfin 85 kg/an avec les trains et bus.");
	}
	
	/**
	 * retourne la description détaillée de l'instance de Transport
	 * @return (chaine de caractère) 
	 */
	@Override
	public String toString(){
		return "id Transport : " + super.getidConsoCarb() + "\nImpact : " + super.getimpact() + " tCO2eq \n\n";
	}
	
	/**
	 * methode main de la classe
	 * @param args
	 */
	public static void main(String [] args) {}
	
}