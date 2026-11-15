package uphf.astro.modele;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
public class MISSION {
	private int id;
	private String nom;
	private CORPSCELESTE corpsCeleste;
	private LocalDate dateLancement;
	private double budget;
	private Directeur directeur;
	private List<Operateur> operateurs;
	private List<Engin> engins;
	private List<Zone> zonesObjectifs;
	private List<Echantillon> echantillons;
	private EtatMission etat;
	private boolean reussie;
	public MISSION(int id, String nom, CORPSCELESTE corpsCeleste, LocalDate dateLancement, double budget, Directeur directeur) {
		this.id = id;
		this.nom = nom;
		this.corpsCeleste = corpsCeleste;
		this.dateLancement = dateLancement;
		this.budget = budget;
		this.directeur = directeur;
		this.operateurs = new ArrayList<Operateur>();
		this.engins = new ArrayList<Engin>();
		this.zonesObjectifs = new ArrayList<Zone>();
		this.echantillons = new ArrayList<Echantillon>();
		this.etat = EtatMission.PLANIFIEE;
	}
	public int getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public CORPSCELESTE getCorpsCeleste() {
		return corpsCeleste;
	}
	public LocalDate getDateLancement() {
		return dateLancement;
	}
	public double getBudget() {
		return budget;
	}
	public Directeur getDirecteur() {
		return directeur;
	}
	public getEtatMission getEtat() {
		return etat;
	}
	public boolean isReussie() {
		return reussie;
	}
	

}
