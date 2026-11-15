package uphf.astro.modele;

public class CADET extends PERSONNE {
	private OPERATEUR tuteur;
	private int missionsReussies;

	public CADET(int id , String nom, String prenom, String genre, String telephone , OPERATEUR tuteur) {
		super(id, nom, prenom, genre, telephone);
		this.missionsReussies = 0;
		this.tuteur = tuteur;
	}
	public void changeTuteur(OPERATEUR tuteur) {
		if(nouveauTuteur == null) {
			throw new IllegalArgumentException("Le tuteur ne peut pas être null");
		}
		this.tuteur = tuteur;
	}
	public void ajoutrerMissionReussie() {
		this.missionsReussies++;
	}
	public boolean peutDevenirOperateur() {
		return missionsReussies >= 3;
	}
	public OPERATEUR getTuteur() {
		return tuteur;
	}
	piblic int getMissionsReussies() {
		return missionsReussies;
	}
}
