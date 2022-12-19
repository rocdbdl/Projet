package consoCarbone;

public class ServicesPublics extends ConsoCarbone{
	private static ServicesPublics singleton = null;
	private double impact;
	
	public static ServicesPublics getInstance() {
		if (singleton == null) {
			singleton = new ServicesPublics();
		}	
		return singleton;
	}
	
	//Constructeur de ServicesPublics
	public ServicesPublics(){
		super();
		this.impact = 1.5;
	}
	
	//getter pour impact
	
	public double getimpact() {
		return impact;
	}
	
}
