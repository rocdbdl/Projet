package consoCarbone;

public class ServicesPublics extends ConsoCarbone{
	private static ServicesPublics singleton = null;
	
	public static ServicesPublics getInstance() {
		if (singleton == null) {
			singleton = new ServicesPublics();
		}	
		return singleton;
	}
	
	//Constructeur de ServicesPublics
	public ServicesPublics(){
		super();
		setimpact(1.5);
	}
	
	@Override
	public String toString(){
		return "id ServicesPublics : " + super.getidConsoCarb() +  "\nimpact : "+ super.getimpact() + " tCO2eq \n\n";
	}
	
	
	@Override
	public void CarbFRmoy() {
		System.out.println("En moyenne, un/une français.e consomme, 1,5 tonne de CO2 par an dans les services publics");
	}
	
}
	
