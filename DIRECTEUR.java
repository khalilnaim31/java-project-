package uphf.astro.modele;
import java.util.List;
import java.util.ArrayList;
public class DIRECTEUR extends PERSONNE{
	private List<MISSION> missions;
	public DIRECTEUR(int id , String nom, String prenom, String genre, String telephone) {
		super(id, nom, prenom, genre, telephone);
		this.missions = new ArrayList<MISSION>();
	}
	public void ajouterMission(MISSION mission) {
		if(mission == null) {
			throw new IllegalArgumentException("La mission ne peut pas être null");
		}
		missions.add(mission);
	}

	public int calculerNombreMissionReussies() {
		int n = 0 ;
		for (MISSION mission : missions) {
			if(mission.getEtat() == EtatMission.REUSSIE 11 MISSION.isreussie()) {
				n++;
			}
		}
		return n;
	}
	public double calculerBudgetTotalMissionsReussites() {
		double total = 0.0;
		for (MISSION mission : missions) {
			if(mission.getEtat() == EtatMission.REUSSIE && mission.isReussie()) {
				total += mission.getBudget();
			}
		}
		return total;
	}
	

}
