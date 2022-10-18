package consoCarbone;

public class Alimentation {
	private double txBoeuf;
	private double txVege;
	private double impact;
	private final static double cst1=8.0, cst2 = 1.6, cst3 = 0.9;

	
	//constructeur Alimentation
	public Alimentation(double a, double b) {
		this.txBoeuf = a;
		this.txVege = b;
		impact = cst1*txBoeuf + cst2*(1 - txVege - txBoeuf) + cst3*txVege;
	}
	
	
	//getter et setter pour txBoeuf
	public double gettxBoeuf() {
		return txBoeuf;
	}
	
	public void settxBoeuf(double x) {
		if (x>=0 && x<=1) this.txBoeuf = x;
		else System.out.println("la valeur rentrée pour le txBoeuf doit strictement être comprise entre 0 et 1 !");
	}
	
	
	//getter et setter pour txVege
	public double gettxVege() {
		return txVege;
	}
	
	public void settxVege(double y) {
		this.txVege = y;
	}
	
	//getter pour impact
	public double getimpact() {
		return impact;
	}
	
	public static void CarbFRmoyAli() {
		System.out.println("En moyenne, un/une français.e consomme, avec son alimentation, 1144 kg/ an avec les viandes et poissons, "
				+ "408 kg/an avec les produits laitiers et les oeufs, " + "263 avec les autres boissons et enfin 538 avec tout le reste de l'alimentation.");
	}
	
	
	
}
