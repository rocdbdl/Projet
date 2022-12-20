	package utilisateur;
	import consoCarbone.*;
	
	/**
	 * Un Utilisateur est une personne dont on va pouvoir calculer l'empreinte carbonne
	 * @author Ugo Benazra et Roc De Begon Delarouzière
	 * @version 1.0
	 */
	
	public class Utilisateur {
		/** nombre d'utilisateurs créés */
	protected static int nbUtilisateur;
	/** id de l'utilisateur */
	protected int id;
	/** habitudes alimentaires de l'utilisateur */
	private Alimentation alimentation; //= new Alimentation();
	/** dépenses annuelles de l'utilisateur */
	private BienConso bienconso; // = new BienConso();
	/** caractéristiques du logement de l'utilisateur */
	private Logement logement; // = new Logement();
	/** utilisation de la voiture par l'utilisateur */
	private Voiture voiture; // = new Voiture();
	/** utilisation de l'avion par l'utilisateur */
	private Avion avion; 
	/** impact des services publics utilisés par l'utilisateur */
	private ServicesPublics services; // = new ServicesPublics();
	
	/**
	 * Constructeur qui crée une instance de la classe Utilisateur sans donner de valeurs aux attributs
	 */	
	public Utilisateur(){
		id = ++nbUtilisateur;
	}
	
	/**
	 * Constructeur qui crée une instance de la classe Utilisateur en donnant les valeurs des attributs
	 * @param alimentation (Alimentation)
	 * @param bienconso (BienConso)
	 * @param logement (Logement)
	 * @param voiture (Voiture)
	 * @param avion (Avion)
	 * @param services (ServicesPublics)
	 */
	public Utilisateur(Alimentation alimentation, BienConso bienconso, Logement logement, Voiture voiture, Avion avion, ServicesPublics services) {
		id = ++nbUtilisateur;
		this.alimentation = alimentation;
		this.bienconso = bienconso;
		this.logement = logement;
		this.voiture = voiture;
		this.avion = avion;
		this.services = services;
	}
	
	/**
	 * getter pour l'id de l'utilisateur
	 * @return id (entier)
	 */	
	public int get_Utilisateur_id() {
		return id;
	}
	
	
	/**
	 * getter pour alimentation
	 * @return alimentation (Alimentation)
	 */
	public Alimentation getAlimentation() {
		return alimentation;
	}
	
	 /**
	  * setter pour alimentation
	  * @param alimentation (Alimentation)
	  */
	public void setAlimentation(Alimentation alimentation) {
		this.alimentation = alimentation;
	}
	
	/**
	 * getter pour bienconso
	 * @return bienconso (BienConso)
	 */
	public BienConso getBienconso() {
		return bienconso;
	}
	
	/**
	 * setter pour bienconso
	 * @param bienconso (BienConso)
	 */
	public void setBienconso(BienConso bienconso) {
		this.bienconso = bienconso;
	}
	
	/**
	 * getter pour logement
	 * @return logement (Logement)
	 */
	public Logement getLogement() {
		return logement;
	}
	
	/**
	 * setter pour logement
	 * @param logement (Logement)
	 */
	public void setLogement(Logement logement) {
		this.logement = logement;
	}
	
	/**
	 * getter pour voiture
	 * @return voiture (Voiture)
	 */
	public Voiture getVoiture() {
		return voiture;
	}
	
	/**
	 * setter pour voiture
	 * @param voiture (Voiture)
	 */
	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	
	/**
	 * getter pour avion
	 * @return avion (Avion)
	 */
	public Avion getAvion() {
		return avion;
	}
	
	/**
	 * setter pour avion
	 * @param avion (Avion)
	 */
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	
	/**
	 * getter pour services
	 * @return services (ServicesPublics)
	 */
	public ServicesPublics getServices() {
		return services;
	}
	
	/**
	 * setter pour services
	 * @param services (ServicesPublics)
	 */
	public void setServices(ServicesPublics services) {
		this.services = services;
	}
	
	/**
	 * Calcul l'empreinte carbone total de l'utilisateur
	 * @return (double)
	 */
	public double calculEmpreinte(){
		return alimentation.getimpact()+bienconso.getimpact()+logement.getimpact()+voiture.getimpact()+avion.getimpact()+services.getimpact();
	}
	
	/**
	 * Détaille l'empreinte total de l'utilisateur en la décomposant suivant les différents postes de consommation 
	 */
	public void detaillerEmpreinte() {
		System.out.print("L'empreinte carbone de l'utilisateur "+id+ " se décompose comme ceci : \n");
		System.out.print(" - alimentation : " + alimentation.getimpact() + " tCO2eq \n");
		System.out.print(" - dépenses annuelles : " + bienconso.getimpact()+ " tCO2eq \n");
		System.out.print(" - logement : " + logement.getimpact()+ " tCO2eq \n");
		System.out.print(" - voiture : " +voiture.getimpact()+ " tCO2eq \n");
		System.out.print(" - avion : " +avion.getimpact()+ " tCO2eq \n");
		System.out.print(" - services publiques : " +services.getimpact()+ " tCO2eq \n");
		}
	}
