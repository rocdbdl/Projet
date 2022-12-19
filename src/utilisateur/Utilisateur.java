package utilisateur;
import consoCarbone.*;

public class Utilisateur {
	protected static int nbUtilisateur;
	protected int id;
	private Alimentation alimentation; //= new Alimentation();
	private BienConso bienconso; // = new BienConso();
	private Logement logement; // = new Logement();
	private Transport transport; // = new Transport();
	private ServicesPublics services; // = new ServicesPublics();
	
	//Constructeurs Utilisateurs
	public Utilisateur(){
		id = ++nbUtilisateur;
	}
	
	public Utilisateur(Alimentation alimentation, BienConso bienconso, Logement logement, Transport transport, ServicesPublics services) {
		id = ++nbUtilisateur;
		this.alimentation = alimentation;
		this.bienconso = bienconso;
		this.logement = logement;
		this.transport = transport;
		this.services = services;
	}
	
	//getter pour l'id
	public int get_Utilisateur_id() {
		return id;
	}

	
	//getter pour Alimentation
	public Alimentation getAlimentation() {
		return alimentation;
	}

	//setter pour ALimentation
	public void setAlimentation(Alimentation alimentation) {
		this.alimentation = alimentation;
	}

	//getter pour Bienconso
	public BienConso getBienconso() {
		return bienconso;
	}

	//setter pour Bienconso
	public void setBienconso(BienConso bienconso) {
		this.bienconso = bienconso;
	}

	//getter pour Logement
	public Logement getLogement() {
		return logement;
	}

	//setter pour Logement
	public void setLogement(Logement logement) {
		this.logement = logement;
	}

	//getter pour Transport
	public Transport getTransport() {
		return transport;
	}

	//setter pour Transport
	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	//getter pour Services Publics
	public ServicesPublics getServices() {
		return services;
	}

	//setter pour Services Publics 
	public void setServices(ServicesPublics services) {
		this.services = services;
	}
	
	public double calculEmpreinte(){
		return alimentation.getimpact()+bienconso.getimpact()+logement.getimpact()+transport.getimpact()+services.getimpact();
	}
	
	public void detaillerEmpreinte() {
		System.out.print("L'empreinte carbone de l'utilisateur "+id+ " se décompose comme ceci : \n");
		System.out.print(" - alimentation : " + alimentation.getimpact() + " tCO2eq \n");
		System.out.print(" - dépenses annuelles : " + bienconso.getimpact()+ " tCO2eq \n");
		System.out.print(" - logement : " + logement.getimpact()+ " tCO2eq \n");
		System.out.print(" - transport : " +transport.getimpact()+ " tCO2eq \n");
		System.out.print(" - services publiques : " +services.getimpact()+ " tCO2eq \n");
	}
}
