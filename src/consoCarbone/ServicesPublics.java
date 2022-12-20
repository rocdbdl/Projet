package consoCarbone;

/**
 * Un ServicePublics est un ConsoCarbone qui correspond à une empreinte carbone liée aux activités des Services Publics pour chaque citoyen
 * @author Ugo Benazra et Roc De Begon Delarouzière
 * @version 1.0
 */

public class ServicesPublics extends ConsoCarbone{
	private static ServicesPublics singleton = null;
	
	public static ServicesPublics getInstance() {
		if (singleton == null) {
			singleton = new ServicesPublics();
		}	
		return singleton;
	}
	
	/**
	 * Constructeur qui crée une instance de la classe ServicesPublics
	 */
	public ServicesPublics(){
		super();
		setimpact(1.5);
	}
	
	/**
	 * Afficheur de la consommation moyenne d'un français en terme de Services Publics
	 */
	@Override
	public void CarbFRmoy() {
		System.out.println("En moyenne, un/une français.e consomme, 1,5 tonne de CO2 par an dans les services publics");
	}
	
	/**
	 * retourne la description détaillée de l'instance de ServicesPublics
	 * @return (chaine de caractère) 
	 */
	@Override
	public String toString(){
		return "id ServicesPublics : " + super.getidConsoCarb() +  "\nimpact : "+ super.getimpact() + " tCO2eq \n\n";
	}
}
	
