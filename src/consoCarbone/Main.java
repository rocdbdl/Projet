package consoCarbone;

public class Main {
	public static void main(String[] args) {
		CE A = CE.A;
		CE C = CE.C;
		
		Logement log1 = new Logement(200, A);
		Logement log2 = new Logement(250, C);
		System.out.print(log1.getimpact());
		System.out.println("\n");
		System.out.print(log2.getimpact());
		System.out.println("\n");
		log1.CarbFRmoy();
		
		Alimentation ali1 = new Alimentation(0.5, 0.7);
		Alimentation ali2 = new Alimentation(0.4, 0.3);
		System.out.print(ali1.getimpact());
		System.out.println("\n");
		System.out.print(ali2.getimpact());
		System.out.println("\n");
		ali1.CarbFRmoy();
		
		System.out.println("\n");
		System.out.println("\n");
		System.out.print(ali1.compareTo(ali2));
		System.out.println("\n");
		System.out.print(ali2.compareTo(log2));
		System.out.println("\n");
		
		
	}
}
