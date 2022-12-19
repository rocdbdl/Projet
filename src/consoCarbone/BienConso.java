package consoCarbone;

public class BienConso extends ConsoCarbone {
	private double montant;
	
	public BienConso(){
		super();
	}
	
	public BienConso(double montant) {
		super();
		this.montant = montant;
		//this.impact = montant/1750;
		setimpact(montant/1750);
	}
	
	
	//getter and setter for montant
	public double getmontant() {
		return montant;
	}
	
	public void setmontant(double montant) {
		this.montant = montant;
	}
	
	/*
	//getter pour impact 
	public double getimpact() {
		return impact;
	}*/
	
	//setter pour impact (si la valeur d'un des attribut venait à être modifiée, setimpact doit être rappelée pour recalculer la valeur d'impact)
	public void setimpact() {
		//this.impact = montant/1750;
		setimpact(montant/1750);
	}
	
	public static void CarbFRmoyBienConso() {
		System.out.println("En moyenne, un/une français.e consomme, en Bien conso, 1180 kg de co2 par an avec les achats et usages "
				+ "Internet et technologie, 763 kg/an avec l'habillement, et enfin 682 pour les autres biens et services.");
	}
	
	public String toString(){
		return "id Bien Conso : " + super.getidConsoCarb() + "\nMontant depensé par an :  " + montant + " € " + "\nimpact : " + getimpact() + " tCO2eq \n\n";
	}
	
	public static void main(String [] args) {}
}
