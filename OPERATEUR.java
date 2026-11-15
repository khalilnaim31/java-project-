package uphf.astro.modele;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class OPERATEUR extends PERSONNE {
	private Set<Competence> categoriepermis;
	private Set<cadet> cadet;
	private MISSION mission;
	public OPERATEUR(int id , String nom, String prenom, String genre, String telephone) {
		super(id, nom, prenom, genre, telephone);
		this.categoriepermis = new HashSet<Competence>();
		this.cadet = new HashSet<cadet>();
		this.mission = null;
	}
	public void ajouterPermis(Competence permis) {
		categoriepermis.add(permis);
	}
	public boolean estDisponible() {
			return mission == null;
	}
	public void ajouterCadet(cadet cadet) {
		cadet.add(cadet);
	}
	public void retirerCadet(cadet cadet) {
		cadet.remove(cadet);
	}
	public Set<Competence> getCategoriePermis() {
		return EnumSet.copyOf(categoriepermis);
	}
	public Set<cadet> getCadets() {
		return new HashSet<cadet>(cadet);
	}
	oublic MISSION getMission() {
		return mission;
	}
	void setMission(MISSION mission) {
		this.mission = mission;
	}
}
