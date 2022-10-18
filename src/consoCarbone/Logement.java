package consoCarbone;

public class Logement {
	private int superficie;
	private CE ce;
	private double impact;
	
	
	// constructeur Logement
	public Logement(int a, CE b) {
		this.superficie = a;
		this.ce = b; 
		impact = ce.getalpha() * superficie;
	}
	
	
	
	
	//getter et setter pour superficie
	public int getsuperficie() {
		return superficie;
	}
	
	public void setsuperficie(int x) {
		this.superficie = x;
	}
	
	
	
	
	//getter et setter pour ce
	public CE getce() {
		return ce;
	}
	
	public void setce(CE y) {
		this.ce = y;
	}
	
	
	//getter pour impact 
	public double getimpact() {
		return impact;
	}
	
	public static void CarbFRmoyLog() {
		System.out.println("En moyenne, un/une français.e consomme, avec son logement, 1696 kg de co2 par an avec les énergies et utilités du logement, "
				+ "675 kg/an avec les constructions et les gros entretiens du logement, et enfin 335 avec les équipements du logement.");
	}
	
	
	
}
