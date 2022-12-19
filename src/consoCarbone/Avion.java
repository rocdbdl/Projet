package consoCarbone;

public class Avion extends Transport{
	private boolean utilise;
	private int kilomAnnee;
	private static final double cst1=9*0.00001;
	
	public Avion(){
		super();
	}
	
	public Avion(boolean utilise, int kilomAnnee) {
		super();
		this.utilise = utilise;
		this.kilomAnnee = kilomAnnee;
		if(utilise == true) {
			//this.impact = kilomAnnee*cst1 + taille.getConsoTaille()/amortissement;
			setimpact(cst1*kilomAnnee);
		}
		else {
			setimpact(0.0);
		}
	}

	public boolean isUtilise() {
		return utilise;
	}

	public void setUtilise(boolean utilise) {
		this.utilise = utilise;
	}

	public int getKilomAnnee() {
		return kilomAnnee;
	}

	public void setKilomAnnee(int kilomAnnee) {
		this.kilomAnnee = kilomAnnee;
	}
	
	public void setimpact() {
		if(utilise == true) {
			//this.impact = kilomAnnee*cst1 + taille.getConsoTaille()/amortissement;
			setimpact(cst1*kilomAnnee);
		}
		else {
			setimpact(0.0);
		}
	}

	//setter general
	public void setVoiture(boolean utilise, int kilomAnnee) {
		this.utilise = utilise;
		this.kilomAnnee = kilomAnnee;
		if(utilise == true) {
			//this.impact = kilomAnnee*cst1 + taille.getConsoTaille()/amortissement;
			setimpact(cst1*kilomAnnee);
		}
		else {
			setimpact(0.0);
		}
	}
	
	public String toString(){
		if(utilise == true) {
			return "id Avion : " + super.getidConsoCarb() + "\nUtilise l'avion :  " + utilise + "\nKilometres par an : " + kilomAnnee + "\nImpact : " + getimpact() + " tCO2eq \n\n";
		}
		else {
			return "id Avion : " + super.getidConsoCarb() + "\nUtilise l'avion :  " + utilise + "\nImpact : " + getimpact() + " tCO2eq \n\n";
		}
	}
	
	public static void main(String [] args) {}
	
	
	
	
}
