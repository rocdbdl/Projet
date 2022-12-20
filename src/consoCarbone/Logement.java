package consoCarbone;

public class Logement extends ConsoCarbone{
	
	private int superficie;     // superficie du logement en m2
	private CE ce;				// la classe énergétique du logement
	
	
	public Logement(){
		super();
	}
	
	public Logement(int superficie, CE ce) {
		super();
		this.superficie = superficie;
		this.ce = ce;
		//this.impact = ce.getalpha()*superficie;
		setimpact(ce.getalpha()*superficie);
	}
	
	
	//getter and setter for superficie
	public int getsuperficie() {
		return superficie;
	}
	
	public void setsuperfice(int superficie) {
		this.superficie = superficie;
	}
	
	
	//getter and setter for ce
	public CE getCE() {
		return ce;
	}
	
	public void setce(CE ce) {
		this.ce = ce;
	}
	
	/*
	//getter pour impact 
	public double getimpact() {
		return impact;
	}*/
	
	
	//setter pour impact (si la valeur d'un des attribut venait à être modifiée, setimpact doit être rappelée pour recalculer la valeur d'impact)
	public void setimpact() {
		//this.impact = ce.getalpha()*superficie;
		setimpact(ce.getalpha()*superficie);
	}
	
		
	//setter general
	public void setLogement(int superficie, CE ce) {
		this.superficie = superficie;
		this.ce = ce;
		//this.impact = ce.getalpha()*superficie;
		setimpact(ce.getalpha()*superficie);
	}
	
	
	public static void CarbFRmoyLog() {
		System.out.println("En moyenne, un/une français.e consomme, avec son logement, 1696 kg de co2 par an avec les énergies et utilités du logement, "
				+ "675 kg/an avec les constructions et les gros entretiens du logement, et enfin 335 avec les équipements du logement.");
	}
	
	public String toString(){
		return "id Logement : " + super.getidConsoCarb() + "\nSuperficie :  " + superficie + " m2 \nCE : " + ce + "\nimpact : " + getimpact() + " tCO2eq \n\n";
	}
	
	public static void main(String [] args) {}
	
}