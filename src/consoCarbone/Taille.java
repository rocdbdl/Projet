package consoCarbone;

public enum Taille {
	P(4.2), G(19.0);
	
	private double consoTaille;
	
	private Taille(double consoTaille) {
		this.consoTaille = consoTaille;
	}
	
	public double getConsoTaille() {
		return consoTaille;
	}
}
