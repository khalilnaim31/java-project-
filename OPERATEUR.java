package uphf.astro.modele;

import java.util.Set;

public class OPERATEUR extends PERSONNE {
	private Set<permis> categoriepermis;
	private Set<cadet> cadet;
	private Mission mission;
	public OPERATEUR() {
		return;
	}
	public void ajouterPermis(String permis) {
		return;
	}
	public boolean estDisponible() {
		return false;
	}

}
