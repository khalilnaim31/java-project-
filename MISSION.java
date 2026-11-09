package uphf.astro.modele;

public class MISSION {
	private int id;
	private String nom;
	private CorpsCeleste corpsCeleste;
	private LocalDate dateLancement;
	private double budget;
	private Directeur directeur;
	private List<Operateur> operateurs;
	private List<Engin> engins;
	private List<Zone> zonesObjectifs;
	private List<Echantillon> echantillons;
	private EtatMission etat;
	private boolean reussie;
	public MISSION() {
		return;
	}
		
	

}
