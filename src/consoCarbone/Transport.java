package consoCarbone;

public class Transport extends ConsoCarbone{

	public Transport(){
		super();
	}
	
	@Override
	public void CarbFRmoy() {
		System.out.println("En moyenne, un/une français.e consomme, avec pour le transport, 1972 kg de co2 par an avec la voiture, "
				+ "480 kg/an avec l'avion, 383 kg/an avec le fret et la messagerie et enfin 85 kg/an avec les trains et bus.");
	}
	
	@Override
	public String toString(){
		return "id Transport : " + super.getidConsoCarb() + "\nImpact : " + super.getimpact() + " tCO2eq \n\n";
	}
	
	public static void main(String [] args) {}
	
}