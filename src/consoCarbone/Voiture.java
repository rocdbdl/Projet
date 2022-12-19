package consoCarbone;

public class Voiture extends Transport{
	private boolean possede;
	private Taille taille;
	private int kilomAnnee;
	private int amortissement;
	private static final double cst1=1.93*0.0001;
	

	public Voiture(){
		super();
	}
	
	public Voiture(boolean possede, Taille taille, int kilomAnnee, int amortissement) {
		super();
		this.possede = possede;
		this.taille = taille;
		this.kilomAnnee = kilomAnnee;
		this.amortissement = amortissement;
		if(possede == true) {
			//this.impact = kilomAnnee*cst1 + taille.getConsoTaille()/amortissement;
			setimpact(kilomAnnee*cst1 + taille.getConsoTaille()/amortissement);
		}
	}
	
	
	//getter and setter for possede
	public boolean getpossede() {
		return possede;
	}
	
	public void setpossede(boolean possede) {
		this.possede = possede;
	}
	
	
	//getter and setter for taille
	public Taille gettaille() {
		return taille;
	}
	
	public void settaille(Taille taille) {
		this.taille = taille;
	}
	
	
	//getter and setter for kilomAnnee
	public int getkilomAnnee() {
		return kilomAnnee;
	}
	
	public void setkilomAnnee(int kilomAnnee) {
		this.kilomAnnee = kilomAnnee;
	}
	
	
	//getter and setter for amortissement
	public int getamortissement() {
		return amortissement;
	}
	
	public void setamortissement(int amortissement) {
		this.amortissement = amortissement;
	}
	
	/*
	//getter pour impact 
	public double getimpact() {
		return impact;
	}*/
	
	//setter pour impact (si la valeur d'un des attribut venait à être modifiée, setimpact doit être rappelée pour recalculer la valeur d'impact)
	public void setimpact() {
		if(possede == false) {
			//this.impact = 0.0;
			setimpact(0.0);
		}
		else {
			//this.impact = kilomAnnee*cst1 + taille.getConsoTaille()/amortissement;
			setimpact(kilomAnnee*cst1 + taille.getConsoTaille()/amortissement);
		}
	}

	
	//setter general
	public void setVoiture(boolean possede, Taille taille, int kilomAnnee, int amortissement) {
		this.possede = possede;
		this.taille = taille;
		this.kilomAnnee = kilomAnnee;
		this.amortissement = amortissement;
		if(possede == false) {
			//this.impact = 0.0;
			setimpact(0.0);
		}
		else {
			//this.impact = kilomAnnee*cst1 + taille.getConsoTaille()/amortissement;
			setimpact(kilomAnnee*cst1 + taille.getConsoTaille()/amortissement);
		}
	}
	
	public String toString(){
		if(possede == true) {
			return "id Voiture : " + super.getidConsoCarb() + "\nPossede une voiture :  " + possede + "\nTaille : " + taille + "\nKilometres par an : " + kilomAnnee + "\nAmortissement : " + amortissement + "\nImpact : " + getimpact() + " tCO2eq \n\n";
		}
		else {
			return "id Voiture : " + super.getidConsoCarb() + "\nPossede une voiture :  " + possede + "\nImpact : " + getimpact() + " tCO2eq \n\n";
		}
	}
	
	public static void main(String [] args) {}
}
